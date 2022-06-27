package com.bilel.eCommerce.entites;
import java.util.*;

import javax.persistence.*;

import lombok.*;
@Entity
@DiscriminatorValue(value = "Client")
@Data  @ToString
public class Client extends Acteur{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 484963205797725424L;
	@OneToMany(mappedBy = "id")
	
	private  List<Panier> mesPaniers=new ArrayList<Panier>();
	
	
	public Client() {
		super();
		this.mesPaniers=new ArrayList<Panier>();
	}
	
    
	
	public Client(String nom,String email,String password) {
		
		super(nom,email,password);
		
		
	}



	public Client(String nom, String email, String password, String section, String image, String level) {
		super(nom, email, password, section, image, level);
		
		
	}
	
	public void setMesPaniers(List<Panier> list) {
		this.mesPaniers=list;
	}
	
	public List<Panier> getMesPaniers(){
		return this.mesPaniers;
	}
	

}
