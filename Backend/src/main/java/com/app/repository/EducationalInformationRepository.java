package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.EducationalInformation;



@Repository
public interface EducationalInformationRepository extends JpaRepository<EducationalInformation, Integer>{

}
