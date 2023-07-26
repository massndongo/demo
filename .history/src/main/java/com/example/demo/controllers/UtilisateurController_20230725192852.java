package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserService;
import com.example.demo.Utilisateur;

@RestController
@RequestMapping("/users")
public class UtilisateurController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/getAllUsers")
    public List<Utilisateur> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public Utilisateur createUsers(@RequestBody Utilisateur utilisateur) {
        return userService.createUser(utilisateur);
    }

    @PutMapping
    public Utilisateur updateUsers(@RequestBody Utilisateur utilisateur) {
        return userService.updateUser(utilisateur);
    }

    @DeleteMapping(path="/{id}")
    public void deleteUsers(@PathVariable Long id) {
        return userService;
    }
}
