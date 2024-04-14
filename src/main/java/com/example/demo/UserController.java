package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user-api")
    public String welcomeUser() {
        return "welcome to SDET from Mia";
    }
}
