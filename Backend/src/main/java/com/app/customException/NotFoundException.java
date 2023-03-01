package com.app.customException;

public class NotFoundException extends RuntimeException {

	public NotFoundException(String msg)
	{
		super (msg);
	}
}
