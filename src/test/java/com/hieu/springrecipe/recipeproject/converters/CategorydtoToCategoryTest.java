package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.CategoryDTO;
import com.hieu.springrecipe.recipeproject.entities.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategorydtoToCategoryTest {

    private CategorydtoToCategory categorydtoToCategory;
    public final static String DESCRIPTION = "description";
    public final static Long ID = Long.valueOf(10L);


    @Before
    public void setUp() throws Exception {
        categorydtoToCategory = new CategorydtoToCategory();
    }

    @Test
    public void convert() {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(ID);
        categoryDTO.setDescription(DESCRIPTION);
        Category category = categorydtoToCategory.convert(categoryDTO);
        assertEquals(ID, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());
    }

    @Test
    public void testNullObject() {
        assertNull(categorydtoToCategory.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(categorydtoToCategory.convert(new CategoryDTO()));
    }
}