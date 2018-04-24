package com.hieu.springrecipe.recipeproject.repositories;

import com.hieu.springrecipe.recipeproject.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
