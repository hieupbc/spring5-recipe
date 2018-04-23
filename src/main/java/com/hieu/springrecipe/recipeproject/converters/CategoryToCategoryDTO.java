package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.CategoryDTO;
import com.hieu.springrecipe.recipeproject.entities.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryDTO implements Converter<Category, CategoryDTO> {
    @Synchronized
    @Nullable
    @Override
    public CategoryDTO convert(Category source) {
        if (source == null) {
            return null;
        } else {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(source.getId());
            categoryDTO.setDescription(source.getDescription());
            return categoryDTO;
        }
    }
}
