package com.hieu.springrecipe.recipeproject.services;

import com.hieu.springrecipe.recipeproject.entities.Recipe;
import com.hieu.springrecipe.recipeproject.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Transactional
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    public Set<Recipe> getAll() {
        Set<Recipe> recipeList = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(e -> recipeList.add(e));
        return recipeList;
    }
}
