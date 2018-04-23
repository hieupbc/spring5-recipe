package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.UnitOfMeasureDTO;
import com.hieu.springrecipe.recipeproject.entities.UnitOfMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class UnitofmeasureToUnitofmeasureDTO implements Converter<UnitOfMeasure,UnitOfMeasureDTO> {
    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasureDTO convert(UnitOfMeasure source) {
        if (source==null){
            return null;
        }else {
            UnitOfMeasureDTO unitOfMeasureDTO= new UnitOfMeasureDTO();
            unitOfMeasureDTO.setId(source.getId());
            unitOfMeasureDTO.setUom(source.getUom());
            return unitOfMeasureDTO;
        }
    }
}
