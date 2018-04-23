package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.CategoryDTO;
import com.hieu.springrecipe.recipeproject.entities.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategorydtoToCategory implements Converter<CategoryDTO, Category> {
    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryDTO source) {
        if (source == null) {
            return null;
        } else {
            final Category category = new Category();
            category.setId(source.getId());
            category.setDescription(source.getDescription());
            return category;
        }
    }
}
