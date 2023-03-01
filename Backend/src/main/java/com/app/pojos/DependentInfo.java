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
public class DependentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dependentInfoId;
	
	private String fatherName;
	
	private String motherName;
	
	private Integer noOfFamilyMember;
	
	private Integer noOfChild;
	
	private String maritalStatus;
	
	private Integer dependentMember;
	
	private Double familyIncome;
	
    private  String spouseName;
}


