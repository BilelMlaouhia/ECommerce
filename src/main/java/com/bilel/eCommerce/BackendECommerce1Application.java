package com.bilel.eCommerce;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bilel.eCommerce.entites.Acteur;
import com.bilel.eCommerce.entites.Admin;
import com.bilel.eCommerce.entites.Client;
import com.bilel.eCommerce.entites.Mobile;
import com.bilel.eCommerce.entites.Ordinateur;
import com.bilel.eCommerce.entites.Panier;
import com.bilel.eCommerce.entites.Produit;
import com.bilel.eCommerce.entites.ResponsableMagasin;
import com.bilel.eCommerce.repository.ActeurRepository;
import com.bilel.eCommerce.repository.PanierRepository;
import com.bilel.eCommerce.repository.ProduitRepository;

@SpringBootApplication
public class BackendECommerce1Application {
//@Autowired

//@Autowired
//private PanierRepository panierRepository;
//@Autowired
//private ProduitRepository produitRepository;
	public static void main(String[] args) {
		
		
	   	 ConfigurableApplicationContext ca=
		 SpringApplication.run(BackendECommerce1Application.class, args);
		 ActeurRepository acteurRepository = ca.getBean(ActeurRepository.class);
		 PanierRepository panierRepository = ca.getBean(PanierRepository.class);
		 ProduitRepository produitRepository =ca.getBean(ProduitRepository.class);
//		Acteur a= new Client("Hichem","Hichem@gmail.com","Hichem123");
//		Acteur a1= new Client("Sonia","Sonia@gmail.com","Sonia123");
//		Acteur a2= new ResponsableMagasin("Oumayma","Oumayma@gmail.com","Oumayma123");
//		Acteur a3=new Admin("Bilel","Bilel@gmail.com","Bilel123");
		
		// Acteur a= new Client();
		//Panier p = new Panier(new Date(),2.2,false,(Client)a);
		//Panier p = new Panier(new Date(),9.7,false,(Client)a);
		//Mobile pr= new Mobile("huwawei");
		 //	pr.setImei("123ERT55");
		 
		//produitRepository.save(new Ordinateur("HP"));
//			acteurRepository.save(a);
//			acteurRepository.save(a1);
//			acteurRepository.save(a2);
//			acteurRepository.save(a3);
		   // panierRepository.save(p);
		 acteurRepository.findAll().forEach(r->{
			 System.out.println("acteur "+r.getNom());
		 });
		
		
	}

}
