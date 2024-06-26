package com.grafica.papelmache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Isso vai retornar "index.html" que deve estar na pasta resources/templates
    }
}
