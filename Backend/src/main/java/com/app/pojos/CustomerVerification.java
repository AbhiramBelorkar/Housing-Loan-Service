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
public class CustomerVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer verificationID;
	
	private String verificationDate;
	
	private String status;
	
	private String remarks;

}
