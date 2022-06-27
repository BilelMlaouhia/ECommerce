package com.bilel.eCommerce.service.Interfaces;

import java.util.List;

import com.bilel.eCommerce.entites.Acteur;

public interface IActeur {
	public Acteur getActeurByEmailAndPassword(String email,String password);
	public Acteur getActeurByEmail(String email);
	public void deleteActeurByEmail(String email);
	public Acteur getActeurById(Long id);
	public List<Acteur> getAllActeurs();
	public void deleteActeurById(Long id);
	public void updateActeur(Acteur a);
	public void insertActeur(Acteur a);
}
