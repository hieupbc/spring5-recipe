package com.hieu.springrecipe.recipeproject.converters;

import com.hieu.springrecipe.recipeproject.DTO.NoteDTO;
import com.hieu.springrecipe.recipeproject.entities.Note;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NotedtoToNote implements Converter<NoteDTO, Note> {
    @Synchronized
    @Nullable
    @Override    public Note convert(NoteDTO source) {
        if (source == null) {
            return null;
        } else {
            final Note note = new Note();
            note.setDescription(source.getDescription());
            note.setId(source.getId());

            return note;
        }

    }
}
