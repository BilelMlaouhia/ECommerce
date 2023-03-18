package com.bilel.eCommerce.entites;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Data @NoArgsConstructor @ToString
public class OrdinateurDto extends Produit{

/**
	 *
	 */
	private static final long serialVersionUID = 1L;
private String prossPc;
private Long acteurIdNumber;

public OrdinateurDto(String name) {
	super(name);
	
}

}
