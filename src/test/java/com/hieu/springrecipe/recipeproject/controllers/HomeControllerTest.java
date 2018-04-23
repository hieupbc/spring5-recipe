package com.hieu.springrecipe.recipeproject.controllers;

import com.hieu.springrecipe.recipeproject.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.Times;
import org.springframework.ui.Model;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class HomeControllerTest {

    HomeController homeController;

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        homeController = new HomeController(recipeService);
    }

    @Test
    public void indexTest() {
        String index = homeController.index( model);

        assertEquals("index",index);
        verify(recipeService, times(1)).getAll();
        verify(model,times(1)).addAttribute(eq("recipeSet"),anySet());
    }

}