package dev.project.awbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/web")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to the Web Page!");
        return "web/index";  // Corresponds to web/index.html
    }
}
