package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentLoanDetails {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer currentloanId;
	
	private Integer currentloanNo;	
	
	private Double loanAmount;
	
	private Double rateOfInterest;
	
	private Integer tenure;	
	
	private Double  totalAmounttobepaidDouble;
	
	private Double processingFees;
	
	private Double totalInterest;
	
	private String sanctionDate;
	
	private String remark;
	
	private String status;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	 private EMIDetails emidetails;
	

}
