package com.bilel.eCommerce.service;

import com.bilel.eCommerce.entites.Acteur;
import com.bilel.eCommerce.repository.ActeurRepository;
import com.bilel.eCommerce.service.Interfaces.IActeur;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Component
public class ActeurImp implements IActeur{
  
	@Autowired
	private  ActeurRepository acteurRepository;

	@Override
	public Acteur getActeurByEmailAndPassword(String email, String password) {
		return acteurRepository.findByEmailAndPassword(email, password);
	}
    
	@Override
	public List<Acteur> getAllActeurs(){
		return acteurRepository.findAll();
	}
	
	public ActeurImp() {
		
	}

	public ActeurImp(ActeurRepository acteurRepository) {
		
		this.acteurRepository = acteurRepository;
	}

	@Override
	public Acteur getActeurById(Long id) {
		return acteurRepository.findById(id).get();
	}
	
	@Override
	public Acteur getActeurByEmail(String email) {
		return acteurRepository.findByEmail(email);
	}
	
	@Override
	public void deleteActeurByEmail(String email) {
		
		acteurRepository.delete(this.getActeurByEmail(email));
		
	}
     
	@Override 
	public void deleteActeurById(Long id) {
		acteurRepository.delete(this.getActeurById(id));
	}
	
	@Override 
	public void updateActeur(Acteur a) {
		acteurRepository.save(a);
	}
	
	@Override
	public void insertActeur(Acteur a) {
		this.updateActeur(a);
	}
	
	
	
}
