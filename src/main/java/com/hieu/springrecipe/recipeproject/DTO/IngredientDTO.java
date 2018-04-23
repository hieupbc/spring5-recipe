package com.hieu.springrecipe.recipeproject.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientDTO {

    private Long id;
    private String decription;
    private BigDecimal amount;
    private UnitOfMeasureDTO unitOfMeasure;
}
