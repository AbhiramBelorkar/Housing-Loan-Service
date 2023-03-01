package com.app.service;

import com.app.pojos.Cibil;

public interface CibilIService {
	
	// add method to save cibil data
	public Cibil saveData(Cibil c);
	
	// add method to get all cibil data
	public Iterable<Cibil> getAllCibilData() ;
	
	// add a method to get single cibil data by cibil id
	public Cibil getSingleData(Integer cibilId);

}
