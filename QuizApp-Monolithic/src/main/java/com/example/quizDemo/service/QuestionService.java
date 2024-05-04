package com.example.quizDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.quizDemo.entity.Questions;
import com.example.quizDemo.repo.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	Questions questions;
	
	@Autowired
	QuestionRepository repo;

	public List<Questions> getQuestions() {
		return this.repo.findAll();
	}

	public String addQuestions(Questions questions) {
		ArrayList<Integer> arr1 = repo.getQuestionId();
		ArrayList<String> arr2 = repo.getQuestion();
		if(arr1.contains(questions.getId()) || arr2.contains(questions.getQuestionTitle()))
		{
			if(arr1.contains(questions.getId())){
				return "Id already exists!..";
			}
			return "Question already exists!..";
		}
		else
		{
			repo.save(questions);
			return "Entry added..";
		}	
	}

	public Optional<Questions> getQuestionbyId(Integer questionId) {
		return repo.findById(questionId);
	}

}
