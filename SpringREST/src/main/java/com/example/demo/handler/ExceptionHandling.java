package com.example.demo.handler;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.ErrorResponse;
import com.example.demo.exception.UserNotFoundException;

@RestControllerAdvice
public class ExceptionHandling// extends ResponseEntityExceptionHandler
{
	@Autowired
	ErrorResponse err;
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(UserNotFoundException ex)
	{
		ErrorResponse er = new ErrorResponse();
		er.setErrorMessage(ex.getMessage());
		er.setStatus(HttpStatus.NOT_FOUND);
		er.setTimeStamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
	}
	
/*
	@Override
	@ExceptionHandler(UserNotFoundException.class)
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) 
	{
		ErrorResponse er = new ErrorResponse();
		er.setErrorMessage(ex.getFieldError().getDefaultMessage());
		er.setStatus(HttpStatus.NOT_FOUND);
		er.setTimeStamp(LocalDateTime.now());
		return ResponseEntity.badRequest().body(er);
	}*/
	
	
	
	
}
