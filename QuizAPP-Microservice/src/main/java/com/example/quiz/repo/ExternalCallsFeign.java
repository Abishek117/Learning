package com.example.quiz.repo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.JsonNode;

@FeignClient(
		name =  "jsonplaceholder-client",
		url = "https://jsonplaceholder.typicode.com")
public interface ExternalCallsFeign {

	@GetMapping("/posts")
    List<JsonNode> getUsers();
}
