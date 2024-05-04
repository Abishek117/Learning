package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Questions;
import com.example.demo.repo.QuestionRepository;

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
			return "Id already exists!..";
		}
		else
		{
			repo.save(questions);
			return "Entry added..";
		}	
	}
	
	

	
	
}
