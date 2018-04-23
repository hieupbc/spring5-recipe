package com.hieu.springrecipe.recipeproject.controllers;

import com.hieu.springrecipe.recipeproject.Entities.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping({"", "/", "index"})
    public String index() {
        System.out.println("home access changed");
        return "index";
    }

}
