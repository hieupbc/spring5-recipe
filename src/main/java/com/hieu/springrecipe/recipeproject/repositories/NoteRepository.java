package com.hieu.springrecipe.recipeproject.repositories;

import com.hieu.springrecipe.recipeproject.entities.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository  extends CrudRepository<Note,Long>{
}
