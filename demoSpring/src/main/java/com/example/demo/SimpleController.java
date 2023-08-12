package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("simpleController")
public class SimpleController {
	// @Value("${spring.application.name}")
	String appName = "niceApp";

    @GetMapping("/")
    public String homePage(Model model) {
		model.addAttribute("appName", appName);
        return "home";
    }
}

