package com.hieu.springrecipe.recipeproject.repositories;

import com.hieu.springrecipe.recipeproject.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
