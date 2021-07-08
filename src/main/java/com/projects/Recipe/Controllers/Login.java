package com.projects.Recipe.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {

    @RequestMapping(value ="")
    @ResponseBody
    public String login(){
        return "hello world";
    }
}
