package com.hieu.springrecipe.recipeproject.repositories;

import com.hieu.springrecipe.recipeproject.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
