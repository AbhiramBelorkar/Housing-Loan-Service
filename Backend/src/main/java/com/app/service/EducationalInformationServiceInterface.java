package com.app.service;

import java.util.List;

import com.app.pojos.EducationalInformation;



public interface EducationalInformationServiceInterface {
	
	//add a method to save educational information of a customer
	public EducationalInformation saveEducationalInformation(EducationalInformation education);

	//add a method to get all educational information of all customers
	public List<EducationalInformation> getAllEducationalInformation();

	//add a method to get educational information of a customer by education id
	public EducationalInformation getSingleEducationalInformation(Integer educationId);

	//
	public void deleteEducationalInformation(Integer educationId);

	public EducationalInformation updateEducationalInformation(Integer educationId,EducationalInformation educationalInformation);

}
