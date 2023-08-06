package com.example.demo.handler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.entity.ErrorResponse;
import com.example.demo.exception.UserNotFoundException;

@RestControllerAdvice
public class ExceptionHandling// extends ResponseEntityExceptionHandler
{
	@Autowired
	ErrorResponse err;
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException ex)
	{
		ErrorResponse er = new ErrorResponse();
		er.setErrorMessage(ex.getMessage());
		er.setStatus(HttpStatus.NOT_FOUND);
		er.setTimeStamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleNotValidException(MethodArgumentNotValidException ex)
	{
		BindingResult bindingResult = ex.getBindingResult();
//	    String errorMessage = bindingResult.getFieldErrors().stream()
//	                .map(FieldError::getDefaultMessage)
//	                .findFirst().orElse("Validation Failed");
		Map<String, String> errorMap = new HashMap<>();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            errorMap.put(fieldError.getField() , fieldError.getDefaultMessage());
        }
		err.setErrorMessage(errorMap.toString());
		err.setStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
}
