package com.app.pojos;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data       // All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields,
            //@Setter on all non-final fields, and @RequiredArgsConstructor!
public class Cibil {
	@Id
	private Integer cibilId;
	private Integer cibilScore;
	private String cibilScoreDateTime;
	//status : valid and invalid
	private String status;
	//remark : pending initally, approved and reject
	private String remark;
	
}



