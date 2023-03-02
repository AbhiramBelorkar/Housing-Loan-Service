package com.app.controller;

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

import com.app.pojos.LocalAddress;
import com.app.service.LocalAddressServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping("/localaddresscontroller")
public class LocalAddressController 
{
	@Autowired
	LocalAddressServiceI lai;
	
	@PostMapping("/localaddress")
	public LocalAddress saveLocalAddress(@RequestBody LocalAddress ld)
	{
		LocalAddress ad=lai.saveLocalAddress(ld);
		return ad;
	}
	
	@GetMapping("/localaddress")
	public Iterable<LocalAddress> getAllLocalAddress()
	{
		Iterable<LocalAddress> list=lai.getAllLocalAddress();
		return list;
	}
	
	@PutMapping("/localaddress/{localAddressId}")
	public LocalAddress updateLocalAddress(@PathVariable Integer localAddressId,@RequestBody LocalAddress add)
	{
		LocalAddress localadd=lai.updateLocalAddress(localAddressId,add);
		return localadd;
	}
	
	@GetMapping("/localaddress/{localAddressId}")
	public LocalAddress getSingleLocalAddress(@PathVariable Integer localAddressId)
	{
		LocalAddress slocadd=lai.getSingleLocalAddress(localAddressId);
		return slocadd;
	}
	
	@DeleteMapping("/localaddress/{localAddressId}")
	public String deleteLocalAddress(@PathVariable Integer localAddressId)
	{
		lai.deleteLocalAddress(localAddressId);
		return "Delete local Address Id";
	}

}
