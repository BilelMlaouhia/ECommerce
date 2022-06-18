package com.bilel.firstApp.entites;

import javax.persistence.*;


import com.bilel.firstApp.enumerer.*;

//import lombok.AllArgsConstructor;

@Entity
//@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
//@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	private Long idProduit;
	@Column
	private String name;
	@Column
	private Double prix;
	@Column
	private Long quantite;
	@Column
	private String description;
	@Column
	private String image;
    @ManyToOne
	private Long ActeurId;
    @Column
	private TProduit type;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Long getQuantite() {
		return quantite;
	}
	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getActeurId() {
		return ActeurId;
	}
	public void setActeurId(Long acteurId) {
		ActeurId = acteurId;
	}
	public TProduit getType() {
		return type;
	}
	public void setType(TProduit type) {
		this.type = type;
	}
	public Produit(String name, Double prix, Long quantite, String description, String image, Long acteurId,
			TProduit type) {
		
		this.name = name;
		this.prix = prix;
		this.quantite = quantite;
		this.description = description;
		this.image = image;
		ActeurId = acteurId;
		this.type = type;
	}
	public Produit() {
		
	}
	@Override
	public String toString() {
		
		return "this is a Produit";
	}
    
	
}
