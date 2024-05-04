package com.example.quiz.repo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.quiz.quizEntity.QuestionWrapper;
import com.example.quiz.quizEntity.Response;


@FeignClient("QUESTION-SERVICE")
public interface QuestionFeign {

	@GetMapping(path = "/v1/questions/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category , @RequestParam int count);
	
	@PostMapping("/v1/questions/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);
	
	@PostMapping(path = "/v1/questions/score")
	public int getResult(@RequestBody List<Response> response);
}
