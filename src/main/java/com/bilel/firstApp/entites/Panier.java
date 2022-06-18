package com.bilel.firstApp.entites;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

//import lombok.*;

@Entity
//@Table
//@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Panier {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @OneToMany(mappedBy = "idProduit")
	private List<Produit> ProduitsChoisie;
    @Column
	private Date date;
	@ManyToOne
	private Long idActeur;
	@Column
	private Double remise;
	@Column
	private Boolean paimentValide;
	public Panier(List<Produit> produitsChoisie, Date date, Long idActeur, Double remise, Boolean paimentValide) {
		
		ProduitsChoisie = produitsChoisie;
		this.date = date;
		this.idActeur = idActeur;
		this.remise = remise;
		this.paimentValide = paimentValide;
	}
	public Panier() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Produit> getProduitsChoisie() {
		return ProduitsChoisie;
	}
	public void setProduitsChoisie(List<Produit> produitsChoisie) {
		ProduitsChoisie = produitsChoisie;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getIdActeur() {
		return idActeur;
	}
	public void setIdActeur(Long idActeur) {
		this.idActeur = idActeur;
	}
	public Double getRemise() {
		return remise;
	}
	public void setRemise(Double remise) {
		this.remise = remise;
	}
	public Boolean getPaimentValide() {
		return paimentValide;
	}
	public void setPaimentValide(Boolean paimentValide) {
		this.paimentValide = paimentValide;
	}
	
	@Override
	public String toString() {
		
		return "this is a Panier";
	}
	
}
