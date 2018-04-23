package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.IngredientDTO;
import com.hieu.springrecipe.recipeproject.entities.Ingredient;
import lombok.Synchronized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientToIngredientDTO implements Converter<Ingredient, IngredientDTO> {

    private UnitofmeasureToUnitofmeasureDTO unitofmeasureToUnitofmeasureDTO;

    @Autowired
    public IngredientToIngredientDTO(UnitofmeasureToUnitofmeasureDTO unitofmeasureToUnitofmeasureDTO) {
        this.unitofmeasureToUnitofmeasureDTO = unitofmeasureToUnitofmeasureDTO;
    }

    @Synchronized
    @Nullable
    @Override    public IngredientDTO convert(Ingredient source) {
        if (source == null) {
            return null;
        } else {
            IngredientDTO ingredientDTO = new IngredientDTO();
            ingredientDTO.setId(source.getId());
            ingredientDTO.setAmount(source.getAmount());
            ingredientDTO.setDecription(source.getDecription());
            ingredientDTO.setUnitOfMeasure(unitofmeasureToUnitofmeasureDTO.convert(source.getUnitOfMeasure()));
            return ingredientDTO;
        }
    }
}
