package com.example.FirstWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//@ResponseBody
public class HomeController {
    @RequestMapping("/")
    public String Greet(){
        return "Welcome Aboard";
    }

    @RequestMapping("/about")
    public String About(){
        return "Well, This is the About Page";
    }
}
