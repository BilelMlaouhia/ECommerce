package com.bilel.eCommerce.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Admin")
public class Admin extends Acteur{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2486272860147084865L;

	public Admin() {
		super();
	}

	public Admin(String nom, String email, String password, String section, String image, String level) {
		super(nom, email, password, section, image, level);
	}

	public Admin(String nom, String email, String password) {
		super(nom, email, password);
	}
}
