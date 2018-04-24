package com.hieu.springrecipe.recipeproject.services;

import com.hieu.springrecipe.recipeproject.entities.Category;

import java.util.Set;

public interface CategoryService {

    Set<Category> getAll();
    Category getCategoryById(Long id);
}
