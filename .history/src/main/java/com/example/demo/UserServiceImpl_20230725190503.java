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
        return utilisateurRepository.findAll(null);
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Utilisateur findUserById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Utilisateur updateUser(Utilisateur utilisateur) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
