package com.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.AccountDetails;


@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails,Integer >{

	


}