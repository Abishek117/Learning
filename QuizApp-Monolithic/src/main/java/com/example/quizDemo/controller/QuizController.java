package com.example.quizDemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizDemo.entity.QuizWrapper;
import com.example.quizDemo.entity.Response;
import com.example.quizDemo.service.QuizService;


@RestController
@RequestMapping(path = "/quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	@PostMapping(path = "/createQuiz")
	public ResponseEntity<String> getAllQuiz(@RequestParam String category,@RequestParam int count, @RequestParam String title){
		return quizService.getAllQuiz(category, count, title);
	}
	
	@GetMapping(path = "/getQuiz/{id}")
	public ResponseEntity<List<QuizWrapper>> getQuizById(@PathVariable("id") Integer id){
		return quizService.getQuizById(id);
	}
	
	@PostMapping(path = "/submit/{id}")
	public int getResult(@PathVariable("id") int id,@RequestBody List<Response> response)
	{
		return quizService.getResult(id,response);
	}
}
