package com.app.pojos;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MortgageDetails {
		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer mortgageId;
	
	private Double mortgagePropertyValue;
	
	@Lob
	private byte[] mortgagePropertyProof;
	
	private String mortgagePropertyType;
	
	private Double mortgageLoanOnProperty;
	
	@Lob
	private byte[] mortgagePropertyInsurance;
	
	

}
