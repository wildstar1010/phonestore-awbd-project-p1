package dev.project.awbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @GetMapping
    public String showRegistrationForm(Model model) {
        return "register"; // Kept the path as "/register"
    }
}
