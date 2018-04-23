package com.hieu.springrecipe.recipeproject.controllers;

import com.hieu.springrecipe.recipeproject.entities.Recipe;
import com.hieu.springrecipe.recipeproject.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class HomeController {


    RecipeService recipeService;

    @Autowired
    public HomeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String index(Model model) {
        Set<Recipe> recipeSet = recipeService.getAll();
        model.addAttribute("recipeSet",recipeSet);
        return "index";
    }

}
