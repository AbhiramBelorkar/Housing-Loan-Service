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
public class Profession {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer professionid;
	
	private String professiontype;
	
	private Double professionsalary;
	
	private String professionsalaryType;
	
	private String professionworkingperiod;
	
	private String professionDesignation;
	
	@Lob
	private byte[] professionsalaryslips;


}









