package com.bilel.eCommerce.service.Interfaces;

import java.util.List;
import java.util.Optional;

import com.bilel.eCommerce.entites.Produit;

public interface IProduit {
public void ajouterProduit(Produit p);
public void supprimerProduit(Produit p);
public Produit getProduitParId(Long id);
public List<Produit> getProduitParDesignation(String designation);
//public List<Produit> getProduitParPrix(Double prix);
public List<Produit> getAllProduits();
public void updateProduit(Produit p);


}
