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
public class Ledger {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer ledgerId;
	
	private String ledgerCreatedDate;
	
	private Double totalLoanAmount;
	
	private Double payableAmountwithInterest;
	
	private Integer tenure;
	
	private Double monthlyEMI;
	
	private Double amountPaidtillDate;
	
	private Double remainingAmount;
	
	private String nextEmiDatestart;
	
	private String nextEmiDateEnd;
	
	private Integer defaulterCount;
	
	private String previousEmitStatus;
	
	private String currentMonthEmiStatus;
	
	private String loanEndDate;
	
	private String loanStatus;
	
}


