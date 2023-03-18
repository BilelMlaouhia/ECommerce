package com.bilel.eCommerce.controller;

import java.io.Serializable;
import java.util.List;

import com.bilel.eCommerce.entites.*;
import com.bilel.eCommerce.repository.ActeurRepository;
import com.bilel.eCommerce.repository.ProduitRepository;
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
	@Autowired
	private ActeurRepository acteurRepository;
	@Autowired
	private ProduitRepository produitRepository;

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
	public void ajouterProduit(@RequestBody OrdinateurDto o) {
		Ordinateur ordinateur = new Ordinateur();
		ordinateur.setIdProduit(o.getIdProduit());
		ordinateur.setImage(o.getImage());
		ordinateur.setName(o.getName());
		ordinateur.setPrix(o.getPrix());
		ordinateur.setProssPc(o.getProssPc());
		ordinateur.setDescription(o.getDescription());
		ordinateur.setQuantite(o.getQuantite());
		ordinateur.setActeur(acteurRepository.findById(o.getActeurIdNumber()).get());
		System.out.println("data recu: "+o.getActeurIdNumber());
		this.produitImp.ajouterProduit(ordinateur);
	}
	@PutMapping("/ajoutMob")
	public void ajouterProduit(@RequestBody Mobile m) {
		this.produitImp.ajouterProduit(m);
	}
	
	@GetMapping("/delete/{id}")
	public void deleteProduit(@PathVariable("id") Long id) {

		produitRepository.deleteById(id);
	}
	
	@PutMapping("/update")
	public void updateProduit(@RequestBody ProduitDto p) {
				Produit pr = new Ordinateur();
				pr.setIdProduit(p.getIdProduit());
				pr.setPrix(p.getPrix());
				pr.setActeur(acteurRepository.getById(p.getActeurId()));
				pr.setImage(p.getImage());
				pr.setDescription(p.getDescription());
				pr.setQuantite(p.getQuantite());
				pr.setName(p.getName());

		this.produitImp.updateProduit(pr);
	}

}
