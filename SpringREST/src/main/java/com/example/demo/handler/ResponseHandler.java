package com.example.demo.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseHandler 
{
	public ResponseEntity<Object> responseHandler(String message,HttpStatus status,Object res)
	{
		Map<String,Object> response = new HashMap<>();
		response.put("message", message);
		response.put("status", status);
		response.put("data", res);
		return new ResponseEntity<>(response, status);
	}

}
