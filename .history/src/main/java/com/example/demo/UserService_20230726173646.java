package com.example.demo;

import java.util.List;

public interface UserService {
    public List<Utilisateur> getAllUsers();
    public Utilisateur findUserById(Long id);
    public Utilisateur  createUser(Utilisateur utilisateur);
    public Utilisateur updateUser(Utilisateur utilisateur);    
    public void deleteUser(Long id);

    // Méthdes avancées
    public List<Utilisateur> findByFirstname(String firstname);
    public List<Utilisateur> findByFirstnameOrLastname(String firstname, String lastname);
    public List<Utilisateur> findByRolesTitre(String titre);



}
