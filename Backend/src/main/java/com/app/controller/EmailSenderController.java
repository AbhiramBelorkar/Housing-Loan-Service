package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.Customer;
import com.app.pojos.EmailSender;
import com.app.pojos.EnquiryDetails;
import com.app.service.EmailSenderServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
@RequestMapping("/emailsendercontroller")
public class EmailSenderController {
	
	@Autowired
	EmailSenderServiceI esi;
	
	//retrieve email id from pom.xml
	@Value("${spring.mail.username}")
	String formEmailId;
	

	@PostMapping(value="/emailsend")
	public String emailSend(@RequestBody EmailSender e)
	{
		e.setFormEmailId(formEmailId);
		
		try
		{
		  esi.emailSend(e);	
		}
		catch(Exception e1)
		{
			return "Email Can't Sent";
		}
		
		return "Email send Successfully";
	}
	
	@PostMapping(value="/emailsendingwithattachment")
	public String emailSendwithAttachment(@RequestBody EnquiryDetails enquiry)
	{
//		e.setFormEmailId(formEmailId);
		try
		{
		 EnquiryDetails enquiryDetails=esi.emailSendwithAttachment(enquiry);
		}
		catch(Exception e1)
		{
			return "Email can not sent";
		}
		return "Email send Succesfully";	 
	}
	
	
	
	@PostMapping(value="/sendsanctionletter")
	public String sendSanctionLetter(@RequestPart("sanctionLetter")MultipartFile sanctionLetter,
			@RequestPart("cust")String cust) throws JsonMappingException, JsonProcessingException
	{
		
		ObjectMapper objectMapper= new ObjectMapper();
		Customer customer = objectMapper.readValue(cust, Customer.class);
		 
//		e.setFormEmailId(formEmailId);
		try
		{
		 esi.sendSanctionLetter(customer,sanctionLetter);
		}
		catch(Exception e1)
		{
			return "Email can not sent";
		}
		return "Email send Succesfully";	 
	}

}
