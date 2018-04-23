package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.NoteDTO;
import com.hieu.springrecipe.recipeproject.entities.Note;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class NoteToNoteDTO implements Converter<Note, NoteDTO> {
    @NotNull
    @Synchronized
    @Override
    public NoteDTO convert(Note source) {
        if (source == null) {
            return null;
        } else {
            NoteDTO noteDTO = new NoteDTO();
            noteDTO.setId(source.getId());
            noteDTO.setDescription(source.getDescription());
            return noteDTO;
        }
    }
}
