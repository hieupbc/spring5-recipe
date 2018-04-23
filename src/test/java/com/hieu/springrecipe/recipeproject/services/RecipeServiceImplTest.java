package com.hieu.springrecipe.recipeproject.services;

import com.hieu.springrecipe.recipeproject.entities.Recipe;
import com.hieu.springrecipe.recipeproject.repositories.RecipeRepository;
import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getAll() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);
        when(recipeService.getAll()).thenReturn(recipes);
        Set<Recipe> all = recipeService.getAll();

        assertEquals(1, all.size());
        verify(recipeRepository,times(1)).findAll();
    }
}