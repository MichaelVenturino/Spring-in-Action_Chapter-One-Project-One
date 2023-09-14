package com.example.chapteroneprojectone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// This class is a Spring MVC controller responsible for handling requests related to the home page.
@Controller
public class HomeController {

    // This method handles HTTP GET requests for the default home page.
    @GetMapping("/")
    public String home() {
        // The template associated with this view name (in this case home.html) will be rendered as the response to the client.
        return "home";
    }
}
