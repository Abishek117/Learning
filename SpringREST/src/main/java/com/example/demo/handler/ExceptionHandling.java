package com.example.demo.handler;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.ErrorResponse;
import com.example.demo.exception.UserNotFoundException;

@RestControllerAdvice
public class ExceptionHandling
{
	@Autowired
	ErrorResponse err;
	
	@ExceptionHandler(UserNotFoundException.class)
	public ErrorResponse handleException(UserNotFoundException ex)
	{
		ErrorResponse er = new ErrorResponse();
		er.setErrorMessage(ex.getMessage());
		er.setStatus(HttpStatus.NOT_FOUND);
		er.setTimeStamp(LocalDateTime.now());
		return er;
	}
	
	
}
