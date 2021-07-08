package com.projects.Recipe.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("library")
public class recipeController {

    @RequestMapping(value="myLibrary")
    public String library(){
        return "library/myLibrary";
    }

}




