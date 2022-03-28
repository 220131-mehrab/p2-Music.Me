package com.revature.springsecurity.controllers;
import com.revature.springsecurity.UserData;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    @GetMapping("/users")
    public List<UserData> getUsers() {
        List<UserData> users = new ArrayList<>();
        users.add(new UserData(1,"Darryl", "darrylbraijon152@revature.net", "#1love2C0de"));
        return users;
    }
}