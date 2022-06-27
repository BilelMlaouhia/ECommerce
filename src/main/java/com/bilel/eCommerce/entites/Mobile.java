package com.bilel.eCommerce.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue(value="Mobile")
@Data @NoArgsConstructor @ToString
public class Mobile extends Produit{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5575559071707502531L;
	@Column(name = "Num_imei")
	private String imei;

	public Mobile(String name) {
	super(name);
	
	}

}
