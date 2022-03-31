package com.revature.springsecurity.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping(value = "home")
    public String home() {
        return "Home";
    }
}
