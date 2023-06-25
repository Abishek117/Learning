package com.example.demo.exception;

import org.springframework.stereotype.Component;

@Component
public class UserNotFoundException extends RuntimeException
{
	private String message;

	public UserNotFoundException(String message)
	{
		super(message);
	}

	public UserNotFoundException() 
	{
		super();
	}
}
