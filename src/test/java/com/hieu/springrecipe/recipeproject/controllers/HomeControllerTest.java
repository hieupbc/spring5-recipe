package com.hieu.springrecipe.recipeproject.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void indexTest(){
        HomeController homeController = new HomeController();
        assertEquals("index",homeController.index());
    }

}