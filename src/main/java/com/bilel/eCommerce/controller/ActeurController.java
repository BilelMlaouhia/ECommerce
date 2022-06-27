package com.bilel.eCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bilel.eCommerce.entites.*;
import com.bilel.eCommerce.repository.ActeurRepository;
import com.bilel.eCommerce.service.ActeurImp;

import java.util.*;

import javax.websocket.server.PathParam;
@CrossOrigin
@RestController 
@RequestMapping("/acteur")
public class ActeurController {

	private static final long serialVersionUID = 2606321053557889583L;
	
	@Autowired
	private ActeurImp acteurImp;
	
	@GetMapping("/all")
	public List<Acteur> avoirToutActeurs(){
		return this.acteurImp.getAllActeurs();
	}
	
	
	@GetMapping( "/{id}" )
	public Acteur getActeurById(@PathVariable Long id) {
		System.out.println("the id is: "+id);
		System.out.println("qui a returner: "+acteurImp.getActeurById(id));
		if(acteurImp.getActeurById(id)instanceof Client) return(Client) acteurImp.getActeurById(id);
		else if(acteurImp.getActeurById(id)instanceof Admin) return(Admin) acteurImp.getActeurById(id);
		else if(acteurImp.getActeurById(id)instanceof ResponsableMagasin) return(ResponsableMagasin) acteurImp.getActeurById(id);
		else return null;
	}
    
	@GetMapping( "/par" )
	//@ResponseBody
	public Acteur getActeurByEmailAndPassword(@RequestParam(name="email", required=false) String email,@RequestParam(name="password", required=false) String password) {
		System.out.println("email: "+email+" password: "+password);
		return acteurImp.getActeurByEmailAndPassword(email, password);
	}
	
	@PutMapping("/updateClient")
	//@PostMapping("/ajouterClient")
	public void ajouterClient(@RequestBody Client a) {
		
		acteurImp.insertActeur(a);
	}
	@PutMapping("/updateAdmin")
	@PostMapping("/ajouterAdmin")
	public void ajouterAdmin(@RequestBody Admin a) {
		
		acteurImp.insertActeur(a);
	}
	@PutMapping("/updateResponsable")
	@PostMapping("/ajouterResponsable")
	public void ajouterResponsable(@RequestBody ResponsableMagasin a) {
		
		acteurImp.insertActeur(a);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteActeur (@PathVariable Long id) {
		acteurImp.deleteActeurById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
