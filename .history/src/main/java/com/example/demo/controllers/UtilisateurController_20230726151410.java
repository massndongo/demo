package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(path="/{id}")
    public ResponseEntity<Utilisateur> getUserById(@PathVariable Long id) {
        Utilisateur utilisateur = userService.findUserById(id);
        if (utilisateur==null) {
            return new ResponseEntity<Utilisateur>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<Utilisateur>(utilisateur, HttpStatus.OK);
        }
    }

    @GetMapping(path="/findByFirstname/{firstname}")
    public ResponseEntity<List<Utilisateur>> getUserByFirstname(@PathVariable String firstname) {
        List<Utilisateur> utilisateurs = userService.findByFirstname(firstname);
        if (utilisateurs.isEmpty()) {
            return new ResponseEntity<List<Utilisateur>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<Utilisateur>>(utilisateurs, HttpStatus.OK);
        }
    }
    @GetMapping(path="/findByFirstnameAnd/{firstname}")
    public ResponseEntity<List<Utilisateur>> getUserByFirstnameAndLastname(@PathVariable String firstname, @PathVariable String lastname) {
        List<Utilisateur> utilisateurs = userService.findByFirstnameAndLastname(firstname, lastname);
        if (utilisateurs.isEmpty()) {
            return new ResponseEntity<List<Utilisateur>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<Utilisateur>>(utilisateurs, HttpStatus.OK);
        }
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
        userService.deleteUser(id);
    }
}
