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
public class BranchAddress {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer branchAddressId;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private Integer pincode;
	private String streetName;

}
