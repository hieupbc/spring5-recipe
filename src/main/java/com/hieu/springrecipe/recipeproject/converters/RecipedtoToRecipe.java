package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.RecipeDTO;
import com.hieu.springrecipe.recipeproject.entities.Recipe;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class RecipedtoToRecipe implements Converter<RecipeDTO, Recipe> {
    @Synchronized
    @Nullable
    @Override    public Recipe convert(RecipeDTO source) {
        if (source == null) {
            return null;
        } else {
            final Recipe recipe = new Recipe();
            recipe.setId(source.getId());
            recipe.setDifficulty(source.getDifficulty());
            recipe.setCookTime(source.getCookTime());
            recipe.setDescription(source.getDescription());
            recipe.setDirection(source.getDirection());
            recipe.setPrepTime(source.getPrepTime());
            recipe.setSource(source.getSource());
            recipe.setUrl(source.getUrl());


            return recipe;

        }

    }
}