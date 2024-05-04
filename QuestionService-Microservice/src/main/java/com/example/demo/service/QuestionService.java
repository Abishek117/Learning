package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.QuestionWrapper;
import com.example.demo.entity.Questions;
import com.example.demo.entity.Response;
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

	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, int count) {
		List<Integer> questions = repo.findRandomQuestionsByCategory(category, count);
		return new ResponseEntity<>(questions,HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
		List<QuestionWrapper> questionWrapper = new ArrayList<>();
		List<Questions> questions= new ArrayList<>();
		for (Integer id : questionIds)
		{
			questions.add(repo.findById(id).get());
		}
		for(Questions question : questions)
		{
			QuestionWrapper wrapper = new QuestionWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestion(question.getQuestionTitle());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			questionWrapper.add(wrapper);		
		}
		return new ResponseEntity<>(questionWrapper, HttpStatus.OK);
	}

	public int getScore(List<Response> responses) {
		int count = 0;
		for(Response response : responses) {
			Optional<Questions> questions = repo.findById(response.getId());
			if(response.getResponse().equalsIgnoreCase(questions.get().getRightAnswer())) {
				count++;
			}
		}
		return count;
	}

}
