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
@Data //@ToString, @EqualsAndHashCode, @Getter on all fields,
//@Setter on all non-final fields, and @RequiredArgsConstructor
public class EnquiryDetails {
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private long mobileNo;
    private String pancardNo;
    private String mailSent;
    
    @OneToOne(cascade = CascadeType.ALL)
	private Cibil cibil;
}


