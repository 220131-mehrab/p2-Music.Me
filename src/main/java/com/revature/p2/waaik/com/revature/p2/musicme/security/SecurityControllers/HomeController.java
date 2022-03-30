package com.revature.p2.waaik.com.revature.p2.musicme.security.SecurityControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping(value = "home")
    public String home() {
        return "Home";
    }
}