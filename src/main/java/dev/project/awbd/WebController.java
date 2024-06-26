package dev.project.awbd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")  // Keeping this as the root URL
public class WebController {

    @GetMapping
    public String home() {
        return "index";  // Assuming this returns the main index page
    }
}
