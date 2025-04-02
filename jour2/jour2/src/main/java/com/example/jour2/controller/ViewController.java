package com.example.jour2.controller;

import com.example.jour2.model.UserForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;



@Controller
public class ViewController {

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("message", "Hello, ici la view!");
        model.addAttribute("userForm", new UserForm());
        return "submitForm";
        // return "view";
    }

    @GetMapping("/viewList")
    public String viewList(Model model) {
        List<String> items = Arrays.asList("item1", "item2", "item3");
        model.addAttribute("items", items);
        return "viewList";
    }

    @PostMapping("/submitForm")
    public String submitForm(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "submitForm";
        }
        model.addAttribute("welcomeMessage", "Bienvenue, " + userForm.getName() + "!");
        return "welcome";
    }
}

