package com.bilel.eCommerce.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.*;
@Entity
@DiscriminatorValue(value = "Ordinateur")
@Data @NoArgsConstructor @ToString
public class Ordinateur extends Produit{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String prossPc;

public Ordinateur(String name) {
	super(name);
	
}

}
