package com.app.serviceImplements;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Cibil;
import com.app.pojos.EnquiryDetails;
import com.app.repository.CibilRepository;
import com.app.repository.EnquiryDetailsRepository;
import com.app.service.CibilIService;


@Service
public class CibilServiceImpl implements CibilIService {
	
	@Autowired
	private CibilRepository cr;
	
	@Autowired
	private EnquiryDetailsRepository edr;

	@Override
	public Cibil saveData(Cibil c) {
		
		EnquiryDetails enquiryDetails=edr.findById(c.getCibilId()).orElse(null);
		
		//CIbil Score
		int min=600;
		int max=900;
		//math.random() a pseudorandom double greater than or equalto 0.0 and less than 1.0.
		int a =(int) (Math.random()*(max-min+1)+min);
		
		c.setCibilScore(a);
		
		// Set Date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date(); 
	    
	    //Formats a Date into a date-time string.
		c.setCibilScoreDateTime(formatter.format(date));
		
		c.setRemark("PENDING");
		System.out.println("CIBIL SCORE = "+a+"     From Object = "+c.getCibilScore());
		
		if(a>=750) {
		c.setStatus("Valid");
		//assigning cibil score to enquiry details
		enquiryDetails.setCibil(c);
		
		//update enquiry details with cibil score
		edr.save(enquiryDetails);
		
		//showing valid cibil score enquiry details
		System.out.println("IN CIBIL Serviceimpl = "+enquiryDetails);
		return c;
		}
		else{
			c.setStatus("Invalid");
			enquiryDetails.setCibil(c);
			edr.save(enquiryDetails);
			System.out.println("IN CIBIL Serviceimpl = "+enquiryDetails);
			return c;
		}
	
	
		
	}

	@Override
	public Iterable<Cibil> getAllCibilData() {
		//jpa repo method findAll(): returns list of all entities
		//attaching iterable interface to retured list
	Iterable<Cibil> c	=cr.findAll();
		return c;
	}

	@Override
	public Cibil getSingleData(Integer cibilId) {
		//Retrieves an entity by its id.
		//java.util.Optional.get(): If a value is present, returns the value, otherwise throws NoSuchElementException.
	Cibil c	=cr.findById(cibilId).get();
		return c;
	}

	

	

	
	
}
