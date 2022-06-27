
package com.bilel.eCommerce.entites;

import java.io.Serializable;

import javax.persistence.*;

import com.bilel.eCommerce.enumerer.*;

import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Data @NoArgsConstructor @ToString
public abstract class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -855815858572804343L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	
	private String name;
	
	private Double prix;

	private Long quantite;
	
	private String description;
	
	private String image;
    @ManyToOne
	private Acteur acteur;
  

	public Produit(String name) {
		
		this.name = name;
		
	}
    
	
    
	
}
