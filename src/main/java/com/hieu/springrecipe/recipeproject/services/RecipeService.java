package com.hieu.springrecipe.recipeproject.services;

import com.hieu.springrecipe.recipeproject.entities.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getAll();

}
