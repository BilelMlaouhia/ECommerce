package com.bilel.eCommerce.entites;

import java.io.Serializable;

import javax.persistence.*;



 
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role",discriminatorType = DiscriminatorType.STRING,length = 20)
public abstract class Acteur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 182640865030636012L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;
	 
	 protected String nom;
	 
	 protected String email;
	 
	 protected String password;
	 
	 protected String section;
	
	 protected String image;
	
	 protected String level;
	 
	
	 
	public Acteur(String nom, String email, String password, String section, String image, String level) {
		
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.section = section;
		this.image = image;
		this.level = level;
		
		
	}
	
	
	

	public Acteur(String nom, String email, String password) {
		super();
		this.nom = nom;
		this.email = email;
		this.password = password;
	}




	public Acteur() {
		
	}

	public Long getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		
		return "this is a Acteur";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	

	
	
	
}
