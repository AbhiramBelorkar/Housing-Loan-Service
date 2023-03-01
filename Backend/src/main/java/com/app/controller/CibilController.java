package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.customException.NotFoundException;
import com.app.pojos.Cibil;
import com.app.pojos.EnquiryDetails;
import com.app.service.EnquiryDetailsServiceI;
import com.app.serviceImplements.CibilServiceImpl;


@CrossOrigin("*")
@RequestMapping(value="/cibil")
@RestController
public class CibilController {
	
	@Autowired
	private CibilServiceImpl csi;
	
	@Autowired
	private EnquiryDetailsServiceI edi;
	
	
	
	//http://localhost:9595/cibil/cibildata/1
	
	
	@PostMapping("/cibildata/{cibilId}")
	public ResponseEntity<Cibil> saveCibilData(@RequestBody Cibil c, @PathVariable("cibilId") int cibilId)
	{
		System.out.println("CIBIL ID = "+cibilId);
		EnquiryDetails edaiDetails=edi.getSingleEnquiryDetails(cibilId);
		
		if(edaiDetails!=null)
		{
			//set cibil id with enquiry details id
			c.setCibilId(edaiDetails.getId());
			
			// calculate cibil and set all fields of cibil
			Cibil cibil=csi.saveData(c);
			
			//HttpStatus.CREATED : 201
			return new ResponseEntity<Cibil>(cibil,HttpStatus.CREATED);
		}
		else {
				throw new NotFoundException("Cibil Detail Not Found");
		}
	}
	
	//http://localhost:9595/api/getCibilData
	
	
	@GetMapping("/cibildata")
	public ResponseEntity<Iterable<Cibil>> getAllCibilData(){
		Iterable<Cibil> c =csi.getAllCibilData();
		
		//HttpStatus.OK : 200
		return new ResponseEntity<Iterable<Cibil>>(c,HttpStatus.OK);
	}
	
	
	
	//http://localhost:9595/api/getSingleCibilData/8
	
	@GetMapping("/cibildata/{cibilId}")
	public ResponseEntity<Cibil> getSingleData(@PathVariable Integer cibilId) {
		Cibil c=csi.getSingleData(cibilId);
		if(c!=null)
		{
			return new ResponseEntity<Cibil>(c,HttpStatus.OK);
		}
		else {
			throw new NotFoundException("Cibil Detail not Found");
		}
		
	}
}
