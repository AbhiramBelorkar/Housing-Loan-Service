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
public class EMIDetails {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer emiID;
	
	private Double emiAmountMonthly;
	
	private String nextEmiDueDate;	
	
	private String previousEmiStatus;
	
	
	
	}
