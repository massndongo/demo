package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur, Long>{

    public List<Utilisateur> findByFirstname(String firstname);   
    public List<Utilisateur> findByFirstnameOrLastname(String firstname, String lastname);
    public List<Utilisateur> findByRolesTitre();
    // Requete sur les entités mappés: JPQL
    @Query("SELECT u FROM Utilisateur u WHERE u.firstname LIKE ?1 OR u.lastname LIKE ?2")
    public List<Utilisateur> findByFirstnameOrLastnameWithJPQL(String firstname, String lastname);
}
