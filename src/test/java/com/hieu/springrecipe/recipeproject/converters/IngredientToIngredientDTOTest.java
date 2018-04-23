package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.IngredientDTO;
import com.hieu.springrecipe.recipeproject.entities.Ingredient;
import com.hieu.springrecipe.recipeproject.entities.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class IngredientToIngredientDTOTest {

    private IngredientToIngredientDTO ingredientToIngredientDTO;


    @Before
    public void setUp() throws Exception {
        ingredientToIngredientDTO = new IngredientToIngredientDTO(new UnitofmeasureToUnitofmeasureDTO());
    }

    @Test
    public void convert() {
        Ingredient ingredient = new Ingredient();

        Long id = new Long(10);
        BigDecimal amount = new BigDecimal(5);
        String description = "description";
        UnitOfMeasure unitOfMeasure = new UnitOfMeasure();
        ingredient.setId(id);
        ingredient.setAmount(amount);
        ingredient.setDecription(description);
        ingredient.setUnitOfMeasure(unitOfMeasure);
        IngredientDTO ingredientDTO = ingredientToIngredientDTO.convert(ingredient);
        assertEquals(id, ingredientDTO.getId());
        assertEquals(amount, ingredientDTO.getAmount());
        assertEquals(description, ingredientDTO.getDecription());
        assertEquals(unitOfMeasure.getId(), ingredientDTO.getUnitOfMeasure().getId());

    }

    @Test
    public void testNullObject() {
        assertEquals(null, ingredientToIngredientDTO.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(ingredientToIngredientDTO.convert(new Ingredient()));
    }
}