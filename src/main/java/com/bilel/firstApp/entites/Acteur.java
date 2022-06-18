package com.bilel.firstApp.entites;

import java.util.List;

import javax.persistence.*;

import com.bilel.firstApp.enumerer.*;

//import lombok.*;

@Entity
//@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
//@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Acteur {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	 @Column
	private String nom;
	 @Column
	private String email;
	 @Column
	private String password;
	 @Column
	private String section;
	 @Column
	private String image;
	 @Column
	private String level;
	 @Column
	private TRole role;
	
	@OneToMany(mappedBy = "idActeur")
	private List<Panier> mesPaniers;
	
	@OneToMany(mappedBy = "ActeurId")
	private List<Produit> mesProduit;

	public Acteur(String nom, String email, String password, String section, String image, String level, TRole role,
			List<Panier> mesPaniers, List<Produit> mesProduit) {
		
		this.nom = nom;
		this.email = email;
		this.password = password;
		this.section = section;
		this.image = image;
		this.level = level;
		this.role = role;
		this.mesPaniers = mesPaniers;
		this.mesProduit = mesProduit;
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

	public TRole getRole() {
		return role;
	}

	public void setRole(TRole role) {
		this.role = role;
	}

	public List<Panier> getMesPaniers() {
		return mesPaniers;
	}

	public void setMesPaniers(List<Panier> mesPaniers) {
		this.mesPaniers = mesPaniers;
	}

	public List<Produit> getMesProduit() {
		return mesProduit;
	}

	public void setMesProduit(List<Produit> mesProduit) {
		this.mesProduit = mesProduit;
	}
	
	
	
	
}
