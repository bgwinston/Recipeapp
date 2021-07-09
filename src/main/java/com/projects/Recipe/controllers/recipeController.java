package com.projects.Recipe.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("library")
public class recipeController {
    static ArrayList<String> recipes = new ArrayList<>();

    @RequestMapping(value="myLibrary")
    public String library(Model model){
        model.addAttribute("title", "My Recipe Library");
        model.addAttribute("recipes", recipes);
        return "library/myLibrary";
    }
    public String remove(){
        return "myLibrary";
    }
    @RequestMapping(value="add", method= RequestMethod.GET)
    public String displayAdd(Model model){
        model.addAttribute("title", "Add a recipe!");
        return "library/add";
    }
    @RequestMapping(value="add", method=RequestMethod.POST)
    public String processAdd(Model model, @RequestParam String recipeName) {
        recipes.add(recipeName);
        model.addAttribute("title","Recipe Confirmation");
        return "library/rconfirmation";
    }
}




