package com.app.service;

import com.app.pojos.AccountDetails;



public interface AccountDetailsServiceI 
{
	//add a method to save account details of customer
	public AccountDetails SaveAccountDetails(AccountDetails ad);

	//add a method to get all account details customer
	public Iterable<AccountDetails> getAllAccountDetails();
	
	//add a method to delete account details by account id
    public void deleteAccountDetails(Integer accountId);

    //add a method to get account details by account id
	public AccountDetails getSingleAccountDetails(Integer accountId);

	//add a method to update account details 
	public AccountDetails updateAccountDetails(Integer accountId, AccountDetails a);

	
	

}
