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
public class SanctionLetter {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer sanctionId;
	private String sanctionDate;
	
	private String applicantName;
	
	private Long contactDetails;
	
	private String producthomeEquity;
	
	private Double loanAmtSanctioned;
	
	private String interestType;
	
	private Double rateOfInterest ;
	
	private Integer loanTenure;
	
	private Double monthlyEmiAmount;
	
	private String modeOfPayment;
	
	private String remarks;
	
	private String termsCondition;
	
	private String status;

	
	
	
	
}

