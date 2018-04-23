package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.CategoryDTO;
import com.hieu.springrecipe.recipeproject.entities.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryToCategoryDTOTest {

    private CategoryToCategoryDTO categoryToCategoryDTO;

    @Before
    public void setUp() throws Exception {
        categoryToCategoryDTO = new CategoryToCategoryDTO();
    }

    @Test
    public void convert() {
        Long id = Long.valueOf(10L);
        String description = "description";
        Category category = new Category();
        category.setId(id);
        category.setDescription(description);
        CategoryDTO categoryDTO = categoryToCategoryDTO.convert(category);
        assertEquals(id, categoryDTO.getId());
        assertEquals(description, categoryDTO.getDescription());

    }

    @Test
    public void testNullObject() {
        assertEquals(null, categoryToCategoryDTO.convert(null));
    }

    @Test
    public void testEmptyObject(){
        assertNotNull(categoryToCategoryDTO.convert(new Category()));
    }
}