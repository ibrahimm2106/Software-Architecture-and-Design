package com.epic.equity.controllers;

import com.epic.equity.business.UserServiceImpl;
import com.epic.equity.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/login/{username}")
    public Optional<User> login(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.createUser(user);
    }
}
