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
public class PreviousLoanBank {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer branchId;	
	private String branchName;	
	private Double branchCode;	
	private String branchType;
	private String ifsccode	;
	private String micrcode;
	private Double conatctNumber;	
	private String email;	
	private String status;	
	
	@OneToOne(cascade = CascadeType.ALL)
	private BranchAddress bankAddress;
	


}
