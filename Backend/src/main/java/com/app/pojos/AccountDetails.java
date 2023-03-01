package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer accountId;
    private String accounType;
    private Double accountBalance;
    private String accountHolderName;
    private String accountStatus;
    private Long accountNumber;	

}

