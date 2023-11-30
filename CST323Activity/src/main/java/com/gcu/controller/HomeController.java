package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index") // Changed from "/home"
    public String home(Model model) {
        // You can add any model attributes needed for rendering the home page
        model.addAttribute("title", "Home Page");
        return "home"; // Points to home.html
    }

    @GetMapping("/about")
    public String about(Model model) {
        // You can add any model attributes needed for rendering the about page
        model.addAttribute("title", "About Page");
        return "about"; // Points to about.html
    }
}
