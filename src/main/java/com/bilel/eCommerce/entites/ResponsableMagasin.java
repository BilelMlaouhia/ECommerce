package com.bilel.eCommerce.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ResponsableMagasin")
public class ResponsableMagasin extends Acteur{

	public ResponsableMagasin() {
		super();
	}

	public ResponsableMagasin(String nom, String email, String password, String section, String image, String level) {
		super(nom, email, password, section, image, level);
	}

	public ResponsableMagasin(String nom, String email, String password) {
		super(nom, email, password);
	}
}
