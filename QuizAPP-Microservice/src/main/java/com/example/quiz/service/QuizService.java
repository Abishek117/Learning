package com.example.quiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quiz.quizEntity.QuestionWrapper;
import com.example.quiz.quizEntity.Quiz;
import com.example.quiz.quizEntity.Response;
import com.example.quiz.repo.ExternalCallsFeign;
import com.example.quiz.repo.QuestionFeign;
import com.example.quiz.repo.QuizRepository;
import org.springframework.web.client.RestTemplate;

@Service
public class QuizService {
	
	@Autowired
	QuizRepository repo1;
	
	@Autowired
	Quiz quiz;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	QuestionFeign questionFeign;
	
	@Autowired
	ExternalCallsFeign externalCallsFeign;

//    @Autowired
//    public QuizService(QuestionFeign questionFeign) {
//        this.questionFeign = questionFeign;
//    }

	public QuizService(){
		super();
	}

	
	public ResponseEntity<String> 	getAllQuiz(int id,String category, int count, String title) {
		List<Integer> questions = questionFeign.getQuestionsForQuiz(category, count).getBody();
		quiz.setId(id);
		quiz.setQuizTitle(title);
		quiz.setQuestions(questions);
		repo1.save(quiz);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizById(int id) {
		Optional<Quiz> getQuiz = repo1.findById(id);
		List<QuestionWrapper> questions = questionFeign.getQuestionsFromId(getQuiz.get().getQuestions()).getBody();
		return new ResponseEntity<>(questions,HttpStatus.OK);
	}

	public JsonNode getQuestionsById(int id){
		JsonNode node = restTemplate.getForObject("http://question-service/v1/questions/getQuestionbyId/2", JsonNode.class);
		return node;
	}

	public int getResult(List<Response> responses) {
		int result = questionFeign.getResult(responses);
		return result;
	}
	
	public List<JsonNode> testFeignForExtCalls() {
		return externalCallsFeign.getUsers();
	}
}
