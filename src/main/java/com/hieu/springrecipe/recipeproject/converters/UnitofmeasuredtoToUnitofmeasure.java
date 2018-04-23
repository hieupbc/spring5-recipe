package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.UnitOfMeasureDTO;
import com.hieu.springrecipe.recipeproject.entities.UnitOfMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UnitofmeasuredtoToUnitofmeasure implements Converter<UnitOfMeasureDTO, UnitOfMeasure> {
    @Nullable
    @Synchronized
    @Override
    public UnitOfMeasure convert(UnitOfMeasureDTO source) {
        if (source == null) {
            return null;
        } else {
            UnitOfMeasure unitOfMeasure = new UnitOfMeasure();
            unitOfMeasure.setId(unitOfMeasure.getId());
            unitOfMeasure.setUom(source.getUom());
            return unitOfMeasure;
        }
    }
}
