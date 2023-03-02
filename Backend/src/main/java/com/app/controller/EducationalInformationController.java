package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.EducationalInformation;
import com.app.service.EducationalInformationServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("/EducationalInformation")
public class EducationalInformationController {
	
	@Autowired
	EducationalInformationServiceInterface edInformationServiceInterface;
	
	//http://localhost:9595/dependentinfocontroller/dependentInfoData
	@PostMapping(value="/educationalinformation")
	public EducationalInformation saveEducationalInformation(@RequestBody EducationalInformation education)
	{
		EducationalInformation educationalinformation=edInformationServiceInterface.saveEducationalInformation(education);
		
		return educationalinformation;
	}
	
	@GetMapping(value="/educationalinformation")
	public List<EducationalInformation> getAllEducationalInformation()
	{
		List<EducationalInformation>education=edInformationServiceInterface.getAllEducationalInformation();
		return education;
	}
	
	@GetMapping(value="/educationalinformation/{educationId}")
	public EducationalInformation getSingleEducationalInformation(@PathVariable Integer educationId)
	{
		EducationalInformation education=edInformationServiceInterface.getSingleEducationalInformation(educationId);
		return education;
		
	}
	@DeleteMapping("/educationalinformation/{educationId}")
	public void deleteEducationalInformation(@PathVariable Integer educationId)
	{
		edInformationServiceInterface.deleteEducationalInformation(educationId);
		
	}
	
	@PutMapping(value="educationalinformation/{educationId}")
	public EducationalInformation updateEducationalInformation(@PathVariable Integer educationId,@RequestBody EducationalInformation educationalInformation  )
	{
		EducationalInformation education=edInformationServiceInterface.updateEducationalInformation( educationId,educationalInformation);
		return education;
	}

}
