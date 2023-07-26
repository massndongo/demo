package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UtilisateurController {

    @GetMapping
    public String getAllUsers() {
        return "get all users was called";
    }

    @PostMapping
    public String createUsers() {
        return "get create users was called";
    }

    @PutMapping
    public String updateUsers() {
        return "get update users was called";
    }

    @DeleteMapping
    public String deleteUsers() {
        return "get delete users was called";
    }
}
