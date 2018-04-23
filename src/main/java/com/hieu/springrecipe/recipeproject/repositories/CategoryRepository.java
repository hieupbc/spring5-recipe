package com.hieu.springrecipe.recipeproject.repositories;

import com.hieu.springrecipe.recipeproject.Entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
