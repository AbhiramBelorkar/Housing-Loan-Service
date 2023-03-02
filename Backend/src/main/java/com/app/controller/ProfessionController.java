package com.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.Profession;
import com.app.service.ProfessionServiceInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin("*")
@RestController
@RequestMapping("/Profession")
public class ProfessionController {
	
	@Autowired
	ProfessionServiceInterface professionServiceInterface;
	//http://localhost:9595/Profession/profession
	@PostMapping(value="/profession", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String  saveProfession(@RequestPart("professionsalaryslips")MultipartFile file1,
			@RequestPart("cust")String cust) throws JsonMappingException, JsonProcessingException
	{
		    ObjectMapper objectMapper= new ObjectMapper();
		    Profession profession = objectMapper.readValue(cust, Profession.class);
		    try {
		    	profession.setProfessionsalaryslips(file1.getBytes());
		    	
				
		    	Profession prof= professionServiceInterface.saveProfession(profession);
		    	
				return "saved Successfully";	
				
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		
		
	}
	
	@GetMapping(value="/profession",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<Profession> getAllProfession()
	{
		List<Profession> profession= professionServiceInterface.getAllProfession();
		     return profession;
	}
	
	@GetMapping(value="/profession/{professionid}")
	public Profession getSingleProfession(@PathVariable ("professionid")Integer professionid)
	{
		Profession pro	=professionServiceInterface.getSingleProfession(professionid);
		return pro;
		
	}
	
	@DeleteMapping(value="/profession/{professionid}")
	public String deleteProfession(@PathVariable("professionid") Integer professionid)
	{
		professionServiceInterface.deleteProfession(professionid);
		
		return "delete Successfully";
		
	}
	
	@PutMapping(value="/profession/{professionid}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String  updateProfession(
			@RequestPart("professionsalaryslips")MultipartFile file1,
			@RequestPart("cust")String cust,
			@PathVariable("professionid")Integer professionid) throws JsonMappingException, JsonProcessingException
	{
		  ObjectMapper objectMapper= new ObjectMapper();
		    Profession profession = objectMapper.readValue(cust, Profession.class);
		    try {
		    	profession.setProfessionsalaryslips(file1.getBytes());
		    	
				
		    	Profession prof= professionServiceInterface.updateProfession(profession);
		    	profession.setProfessionid(professionid);
		    	
				return "upadate Successfully";
				
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		
		
	}

}
