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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer customerId;
	private String customerName;
	private String customerDateOfBirth;
	private Integer customerAge;
	private String customerGender;
	private String customerEmail;
	private Long customerMobileNumber;
	private Long customerAdditionalMobileNumber;
	private Double customerAmountPaidForHome;
	private Double customerTotalLoanRequired;
	

     @OneToOne(cascade = CascadeType.DETACH)
     private EnquiryDetails enquiryDetails;
     
         
	@OneToOne(cascade = CascadeType.ALL)
	private EducationalInformation educationalInfo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private AllPersonalDocuments allpersonalDoc;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DependentInfo familydependentInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MortgageDetails mortgageDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Cibil cibilscore;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentloandetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan previousloan;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyInfo propertyinfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails gurantordetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement loandisbursement;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;
	
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionletter;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification customerverification;
	
	
}
