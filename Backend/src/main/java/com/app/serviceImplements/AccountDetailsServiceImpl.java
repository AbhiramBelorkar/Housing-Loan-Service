package com.app.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.AccountDetails;
import com.app.repository.AccountDetailsRepository;
import com.app.service.AccountDetailsServiceI;


@Service
public class AccountDetailsServiceImpl implements AccountDetailsServiceI
{

	@Autowired
	AccountDetailsRepository adr;
	
	@Override
	public AccountDetails SaveAccountDetails(AccountDetails ad) 
	{
		AccountDetails a=adr.save(ad);
		return a;
	}
	@Override
	public Iterable<AccountDetails> getAllAccountDetails()
	{
		Iterable<AccountDetails> a1=adr.findAll();
		return a1;
	}
	@Override
	public void deleteAccountDetails(Integer accountId) 
	{
		adr.deleteById(accountId);
		
	}
	@Override
	public AccountDetails getSingleAccountDetails(Integer accountId) 
	{
		//get(): throws NoSuchElementException if value is not found
		return adr.findById(accountId).get();
	}
	@Override
	public AccountDetails updateAccountDetails(Integer accountId, AccountDetails a) 
	{
		a.setAccountId(accountId);
		AccountDetails a1=adr.save(a);
		return a1;
	}

	
}
