package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Questions;
import com.example.demo.service.QuestionService;

@RestController
@RequestMapping(path = "/v1/questions")
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	@Autowired
	Questions questions;
	
	@GetMapping(path = "/getAllQuestions")
	public List<Questions> getQuestions()
	{
		return this.questionService.getQuestions();
	}
	
	@PostMapping(path = "/addQuestions")
	public String addQuestions(@RequestBody Questions questions)
	{
		return questionService.addQuestions(questions);	
	}


}
