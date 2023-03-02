package com.app.serviceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Profession;
import com.app.repository.ProfessionRepository;
import com.app.service.ProfessionServiceInterface;



@Service
public class ProfessionServiceImpl implements ProfessionServiceInterface {
	
	@Autowired
	ProfessionRepository professionRepository;

	@Override
	public Profession saveProfession(Profession profession) {
		Profession pro=	professionRepository.save(profession);
		return pro ;
		
	}

	@Override
	public List<Profession> getAllProfession() {
		
		return professionRepository.findAll();
	}

	@Override
	public Profession getSingleProfession(Integer professionid) {
		     
		return professionRepository.findById(professionid).get();
	}

	@Override
	public void deleteProfession(Integer professionid) {
		
		professionRepository.deleteById(professionid);

	}

	@Override
	public Profession updateProfession(Profession profession) {
		
		return professionRepository.save(profession);
	}

	

}
