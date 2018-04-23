package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.RecipeDTO;
import com.hieu.springrecipe.recipeproject.entities.Recipe;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class RecipeToRecipeDTO implements Converter<Recipe,RecipeDTO>{
    @Synchronized
    @Nullable
    @Override    public RecipeDTO convert(Recipe source) {
        return null;
    }
}
