package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur createUser(Utilisateur utilisateur) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Utilisateur findUserById(Long id) {
        return utilisateurRepository.findBy;
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur updateUser(Utilisateur utilisateur) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
