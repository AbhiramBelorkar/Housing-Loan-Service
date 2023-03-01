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
public class PreviousLoan {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer previousLoanId;	
	
	private Double previousLoanAmount;	
	private Integer previousLoanTenure;	
	private Double previousLoanpaidAmount;	
	private Double previousLoanremainingAmount;	
	private Integer previousLoandeafulterCount;
	
	private String previousLoanStatus;	
	private String previousLoanRemark;	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	 private PreviousLoanBank previousLoanbankDetails;	


}
