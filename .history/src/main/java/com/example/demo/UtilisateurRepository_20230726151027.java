package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur, Long>{

    public List<Utilisateur> findByFirstname(String firstname);   
     public List<Utilisateur> findByFirstnameAnd(String firstname);

    
}
