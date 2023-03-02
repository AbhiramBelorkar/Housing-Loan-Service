package com.app.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.LocalAddress;
import com.app.repository.LocalAddressRepository;
import com.app.service.LocalAddressServiceI;



@Service
public class LocalAddressServiceImpl implements LocalAddressServiceI 
{
  @Autowired
  LocalAddressRepository lar;

@Override
public LocalAddress saveLocalAddress(LocalAddress ld)
{
	LocalAddress la=lar.save(ld);	
	return la;
}

@Override
public Iterable<LocalAddress> getAllLocalAddress() {
	Iterable<LocalAddress> list=lar.findAll();
	return list;
}

@Override
public LocalAddress updateLocalAddress(Integer localAddressId, LocalAddress add) {
	add.setLocalAddressId(localAddressId);
	LocalAddress localadd=lar.save(add);
	return localadd;
}

@Override
public LocalAddress getSingleLocalAddress(Integer localAddressId) {
	
	return lar.findById(localAddressId).get();
}

@Override
public void deleteLocalAddress(Integer localAddressId) {
	lar.deleteById(localAddressId);
	
}
  
  
}
