package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.IngredientDTO;
import com.hieu.springrecipe.recipeproject.entities.Ingredient;
import lombok.Synchronized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientdtoToIngredient implements Converter<IngredientDTO, Ingredient> {

    private UnitofmeasuredtoToUnitofmeasure unitofmeasuredtoToUnitofmeasure;

    @Autowired
    public IngredientdtoToIngredient(UnitofmeasuredtoToUnitofmeasure unitofmeasuredtoToUnitofmeasure) {
        this.unitofmeasuredtoToUnitofmeasure = unitofmeasuredtoToUnitofmeasure;
    }

    @Synchronized
    @Nullable
    @Override
    public Ingredient convert(IngredientDTO source) {
        if (source == null) {
            return null;
        } else {
            Ingredient ingredient = new Ingredient();
            ingredient.setId(source.getId());
            ingredient.setAmount(source.getAmount());
            ingredient.setUnitOfMeasure(unitofmeasuredtoToUnitofmeasure.convert(source.getUnitOfMeasure()));
            return ingredient;
        }
    }
}
