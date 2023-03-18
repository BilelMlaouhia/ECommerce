
package com.bilel.eCommerce.entites;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public  class ProduitDto {


	private Long idProduit;

	private String name;

	private Double prix;

	private Long quantite;

	private String description;

	private String image;

	private Long acteurId;



    
	
    
	
}
