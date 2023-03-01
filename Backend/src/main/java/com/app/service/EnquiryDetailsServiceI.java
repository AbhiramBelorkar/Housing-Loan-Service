package com.app.service;

import java.util.List;


import com.app.pojos.EnquiryDetails;

public interface EnquiryDetailsServiceI {
	
	//add method to save enquiry details
	public EnquiryDetails saveEnquiryDetails(EnquiryDetails enqury);

	//add a method to get all enquiry details
	public List<EnquiryDetails> getAllEnquiryDetails();

	//add a method to get a single enquiry details by id
	public EnquiryDetails getSingleEnquiryDetails(int id);

	//add a method to delete enquiry details by id
	public void deleteEnquiry(int id);

	//add a method to edit enquiry details
	public EnquiryDetails editEnquiry(EnquiryDetails enqury);
}
