package com.bilel.eCommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bilel.eCommerce.entites.Produit;
import com.bilel.eCommerce.repository.ProduitRepository;
import com.bilel.eCommerce.service.Interfaces.IProduit;

@Component
public class ProduitImp implements IProduit{
	@Autowired
	private ProduitRepository produitRepository;
	
	public ProduitImp(ProduitRepository pr) {
		this.produitRepository=pr;
	}
	

	public ProduitImp() {
			}


	@Override
	public void ajouterProduit(Produit p) {
		this.produitRepository.save(p);
		
	}

	@Override
	public void supprimerProduit(Produit p) {
		this.produitRepository.delete(p);
		
	}

	@Override
	public Produit getProduitParId(Long id) {
		return this.produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getProduitParDesignation(String designation) {
		return this.produitRepository.findByNameIgnoreCase(designation);
	}

//	@Override
//	public List<Produit> getProduitParPrix(Double prix) {
//		return this.produitRepository.findByPrix(prix);
//	}

	@Override
	public List<Produit> getAllProduits() {
		return this.produitRepository.findAll();
	}

	@Override
	public void updateProduit(Produit p) {
		this.produitRepository.save(p);
		
	}

}
