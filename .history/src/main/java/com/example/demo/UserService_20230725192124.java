package com.example.demo;

import java.util.List;

public interface UserService {
    public String getAllUsers();
    public Utilisateur findUserById(Long id);
    public Utilisateur  createUser(Utilisateur utilisateur);
    public Utilisateur updateUser(Utilisateur utilisateur);    
    public void deleteUser(Long id);


}
