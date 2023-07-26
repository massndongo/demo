package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur createUser(Utilisateur utilisateur) {
        
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUser(Long id) {
        utilisateurRepository.deleteById(id);
        
    }

    @Override
    public Utilisateur findUserById(Long id) {
        Optional<Utilisateur> utOptional = utilisateurRepository.findById(id);
        if (utOptional.isEmpty()) {
            return null;
        } else {
            return utOptional.get();
        }
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur updateUser(Utilisateur utilisateur) {
        Optional<Utilisateur> utOptional = utilisateurRepository.findById(utilisateur.getId());
        if (utOptional.isEmpty()) {
            return null;
        } else {
            return utilisateurRepository.save(utilisateur);
        }
    }

    @Override
    public List<Utilisateur> findByFirstName(String firstname) {
        
        return ;
    }
    
}
