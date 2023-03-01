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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApplicantForm {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer applicantformId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;
	


}
