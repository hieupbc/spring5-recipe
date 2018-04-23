package com.hieu.springrecipe.recipeproject.repositories;

import com.hieu.springrecipe.recipeproject.Entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
