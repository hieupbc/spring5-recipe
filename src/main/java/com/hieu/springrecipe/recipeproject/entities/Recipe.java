package com.hieu.springrecipe.recipeproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer serving;
    private String source;
    private String url;
    private String direction;
    @Lob
    private Byte[] image;
    @OneToOne
    private Note note;

    @OneToMany(mappedBy = "recipe",cascade = CascadeType.ALL)
    private Set<Ingredient> ingredients;
    @Enumerated(value = EnumType.STRING)
    private Difficulity difficulity;

    @ManyToMany
    @JoinTable(name = "recipe_category", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;


}
