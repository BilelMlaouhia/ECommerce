package com.bilel.firstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import repository.ActeurRepository;
import repository.PanierRepository;
import repository.ProduitRepository;

@SpringBootApplication
public class BackendECommerce1Application {
@Autowired
private ActeurRepository acteurRepository;
@Autowired
private PanierRepository panierRepository;
@Autowired
private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendECommerce1Application.class, args);
	}

}
