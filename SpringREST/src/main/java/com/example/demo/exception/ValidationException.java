package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ValidationException extends RuntimeException 
{
	private String errorMessage;

	public ValidationException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public ValidationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}