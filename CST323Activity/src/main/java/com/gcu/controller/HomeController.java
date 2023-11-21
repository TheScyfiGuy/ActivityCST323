package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        // You can add any model attributes needed for rendering the home page
        model.addAttribute("title", "Home Page");
        return "home"; // Assuming you have a Thymeleaf template named "home.html"
    }

    @GetMapping("/about")
    public String about(Model model) {
        // You can add any model attributes needed for rendering the about page
        model.addAttribute("title", "About Page");
        return "about"; // Assuming you have a Thymeleaf template named "about.html"
    }

    
}
