package com.example.demo.handler;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;


@Component
public class ResponseHandler 
{
	public ResponseEntity<Object> responseHandler(String header,HttpStatus status,Object res)
	{
		Map<String,Object> response = new HashMap<>();
		response.put("message", header);
		response.put("status", status);
		response.put("data", res);
		return new ResponseEntity<>(response, status);
	}
	
	public ResponseEntity<Object> addDriver(String message,HttpStatus status,Object res)
	{
		Map<String,Object> response = new HashMap<>();
		response.put("message", message);
		response.put("status", status);
		response.put("data", res);
		return new ResponseEntity<>(response, status);
	}
	
	
	
}
