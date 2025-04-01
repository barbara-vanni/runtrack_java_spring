package com.example.demodeux.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @Value("${greeting.message}")
    private String message;

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", message);
        return "greeting";
    }
}
