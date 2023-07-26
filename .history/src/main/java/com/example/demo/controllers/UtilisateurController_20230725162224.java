package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UtilisateurController {
    @
    public String getAllUsers() {
        return "get all users was called";
    }
    public String createUsers() {
        return "get create users was called";
    }
    public String updateUsers() {
        return "get update users was called";
    }
}
