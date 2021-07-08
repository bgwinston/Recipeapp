package com.projects.Recipe.controllers;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("login")
public class loginController {
    @RequestMapping(value="home", method= RequestMethod.GET)
    public String displaylogin(Model model){
    model.addAttribute("title", "Recipe Vault");
    return "login/home";
    }

    @RequestMapping(value="home", method= RequestMethod.POST)
    public String processlogin() {

        return "login/home";

    }
}
