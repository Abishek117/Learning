 package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.QuestionWrapper;
import com.example.demo.entity.Questions;
import com.example.demo.entity.Response;
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

	@GetMapping(path = "/getQuestionbyId/{id}")
	public Optional<Questions> getQuestionbyId(@PathVariable("id") Integer questionId)
	{
		return questionService.getQuestionbyId(questionId);
	}
	
	
	
	@GetMapping(path = "/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category , @RequestParam int count)
	{
		return questionService.getQuestionsForQuiz(category, count);
	}
	
	@PostMapping("getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds)
	{
		return questionService.getQuestionsFromId(questionIds);
	}
	
	@PostMapping(path = "/score")
	public int getResult(@RequestBody List<Response> response)
	{
		return questionService.getScore(response);
	}
	
}
