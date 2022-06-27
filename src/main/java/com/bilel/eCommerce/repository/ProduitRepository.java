package com.bilel.eCommerce.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bilel.eCommerce.entites.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	
public List<Produit> findByNameIgnoreCase(String name);
//@Modifying
//@Query ("select p from produit p where p.prix>=?1")
//public List<Produit> findByPrix(Double prix);


}
