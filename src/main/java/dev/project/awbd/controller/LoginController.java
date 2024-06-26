package dev.project.awbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/signup")
    public String register(Model model) {
        return "register"; // Changed the path from "/register" to "/login/signup"
    }
}
