package com.hieu.springrecipe.recipeproject.DTO;

import com.hieu.springrecipe.recipeproject.entities.Difficulity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeDTO {

    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    private String source;
    private String url;
    private String direction;
    private Byte[] image;
    private NoteDTO note;

    private Set<IngredientDTO> ingredients;
    private Difficulity difficulity;

    private Set<CategoryDTO> categories;

}
