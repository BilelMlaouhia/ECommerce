package com.bilel.eCommerce.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.bilel.eCommerce.entites.*;

import lombok.*;

@Entity
@Data @NoArgsConstructor  @ToString
public class Panier implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    //@OneToMany
	//private List<Produit> ProduitsChoisie;
   
	private Date date;
	
	private Double remise;
	
	private Boolean paimentValide;
	@ManyToOne
	private Client vendeurId;
	
	public Panier( Date date, Double remise, Boolean paimentValide) {
	
		this.date = date;
		this.remise = remise;
		this.paimentValide = paimentValide;
	}

	public Panier(Date date, Double remise, Boolean paimentValide, Client client) {
		super();
		this.date = date;
		this.remise = remise;
		this.paimentValide = paimentValide;
		this.vendeurId = client;
	}
	
	
	
	
}
