package com.hieu.springrecipe.recipeproject.controllers;

import com.hieu.springrecipe.recipeproject.entities.Category;
import com.hieu.springrecipe.recipeproject.entities.Recipe;
import com.hieu.springrecipe.recipeproject.services.CategoryService;
import com.hieu.springrecipe.recipeproject.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.jws.WebParam;
import java.util.Set;

@Controller
public class RecipeController {

    private final RecipeService recipeService;
    private final CategoryService categoryService;

    @Autowired
    public RecipeController(RecipeService recipeService, CategoryService categoryService) {
        this.recipeService = recipeService;
        this.categoryService = categoryService;
    }

    @GetMapping(value = "recipe/{id}/show")
    public String showDetail(@PathVariable String id, Model model){
        Recipe recipeById = recipeService.getRecipeById(Long.valueOf(id));
        model.addAttribute("recipe",recipeById);
        return "recipe/show";
    }

    @GetMapping(value = "recipe/{id}/update")
    public String editDetail(@PathVariable String id,Model model){
        Recipe recipeById = recipeService.getRecipeById(Long.valueOf(id));
        model.addAttribute("recipe",recipeById);
        Set<Category> categories = categoryService.getAll();
        model.addAttribute("categories",categories);
        return "recipe/form";
    }

    @GetMapping(value = "recipe/new")
    public String addNew(Model model){
        Set<Category> categories = categoryService.getAll();
        model.addAttribute( "categories",categories);
        Recipe recipe = new Recipe();
        model.addAttribute("recipe",recipe);
        return "/recipe/form";
    }

    @GetMapping(value = "recipe/{id}/deletesubmit")
    public String deleteSubmit(@PathVariable String id,Model model){
        model.addAttribute("id",id);
        return "recipe/deletesubmit";
    }
    @GetMapping(value = "recipe/{id}/deleteconfirm")
    public String deleteConfirm(@PathVariable String id,Model model){
        recipeService.deleteRecipeById(Long.valueOf(id));
        Set<Recipe> recipeSet = recipeService.getAll();
        model.addAttribute("recipeSet",recipeSet);
        return "redirect:/index";
    }
}
