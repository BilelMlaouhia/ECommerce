package com.bilel.eCommerce.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bilel.eCommerce.entites.Mobile;
import com.bilel.eCommerce.entites.Ordinateur;
import com.bilel.eCommerce.entites.Produit;
import com.bilel.eCommerce.service.ProduitImp;


@CrossOrigin
@RestController
@RequestMapping(path = "/produit")
public class ProduitController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3318411325525729540L;
	
	@Autowired
	private ProduitImp produitImp; 
	
    @GetMapping("/all")
	public List<Produit> getToutProduit() {
		return this.produitImp.getAllProduits();
	}
    
	@GetMapping("/allParDes")
	public List<Produit> getProduitsParDesignation(@RequestParam("desg") String des){
		return this.produitImp.getProduitParDesignation(des);
	}
	
	@GetMapping("/{id}")
	public Produit getProduitParId(@PathVariable Long id) {
		return this.produitImp.getProduitParId(id);
	}
	
	@PutMapping("/ajoutPc")
	public void ajouterProduit(@RequestBody Ordinateur o) {
		this.produitImp.ajouterProduit(o);
	}
	@PutMapping("/ajoutMob")
	public void ajouterProduit(@RequestBody Mobile m) {
		this.produitImp.ajouterProduit(m);
	}
	
	@DeleteMapping("/delete")
	public void deleteProduit(@RequestBody Produit p) {
		this.produitImp.supprimerProduit(p);
	}
	
	@PutMapping("/update")
	public void updateProduit(@RequestBody Produit p) {
		this.produitImp.updateProduit(p);
	}
	
//	@GetMapping("/produitPrix/{prix}")
//	public List<Produit> produitParPrix(@PathVariable Double prix){
//		return this.produitParPrix(prix);
//	}
	
	
	
	
}
