package com.bilel.eCommerce.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bilel.eCommerce.entites.*;


public interface ActeurRepository extends JpaRepository<Acteur,Long>{
public List<Acteur> findByNomContainsIgnoreCase(String nom);
public Acteur findByEmailAndPassword(String email,String password);
public Acteur findByEmail(String email);
public List<Acteur> findAll();


}
