package com.adil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getMessage() {
        return "Wellcome to Docker Messages demo app!";
    }
}