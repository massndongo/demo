package com.example.demo;

import java.util.List;

public interface UserService {
    public List<Utilisateur> getAllUsers();    
    public Utilisateur  createUser(Utilisateur utilisateur);
    public List<Utilisateur> updateUser(utilisateur);

}
