package com.app.pojos;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GuarantorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer guarantorId;
	
	private String guarantorName;
	private Long guarantorMobileNumber;
	private String guarantorDateOfBirth;
	private String guarantorRelationshipwithCustomer;
	private Long guarantorAdharCardNo;
	private String guarantorMortgageDetails ;
	private String guarantorJobDetails;
	private String guarantorLoaclAddress;
	private String guarantorPermanentAddress;

}
