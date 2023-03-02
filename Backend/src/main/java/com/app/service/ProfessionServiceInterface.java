package com.app.service;


import java.util.List;

import com.app.pojos.Profession;



public interface ProfessionServiceInterface {

	public Profession saveProfession(Profession profession);

	public List<Profession> getAllProfession();

	public Profession getSingleProfession(Integer professionid);

	public void deleteProfession(Integer professionid);

	public Profession updateProfession(Profession profession);

	

	

}
