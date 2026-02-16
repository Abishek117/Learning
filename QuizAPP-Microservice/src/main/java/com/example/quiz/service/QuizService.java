package com.example.quiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
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
	
	@Autowired
	CircuitBreakerRegistry circuitBreakerRegistry;

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

	
	@RateLimiter(name = "questionRateLimiter", fallbackMethod = "rateLimitFallback")
	@CircuitBreaker(name = "questionCB", fallbackMethod = "questionFallback")
	@Retryable(maxAttempts = 3, backoff = @Backoff(delay = 500, multiplier = 2))
	public JsonNode getQuestionsById(int id){
		System.out.println("::::::::::::::::::Entering srvice");
		var cb = circuitBreakerRegistry.circuitBreaker("questionCB");
		System.out.println("CB STATE = " + cb.getState());
        System.out.println("Number of calls = " + cb.getMetrics().getNumberOfBufferedCalls());
        System.out.println("Failed calls = " + cb.getMetrics().getNumberOfFailedCalls());
		JsonNode node = restTemplate.getForObject("http://question-service/v1/questions/getQuestionbyId/2", JsonNode.class);
		return node;
	}

	public JsonNode questionFallback(int id, Throwable ex){
		System.out.println("FALLBACK EXECUTED: " + ex.getClass().getName());
		ObjectMapper objMap = new ObjectMapper();
		try{
			String jsonString = "{\"message\": \"Unable to reach inventory-servcie. Try again after some time\"}";
			JsonNode node = objMap.readTree(jsonString);
			return node;
		} catch(Exception e) {
			System.out.print(e.getMessage());
			return null;
		}
	}
	
	public JsonNode rateLimitFallback(int id, Throwable ex) {
	    System.out.println("FALLBACK EXECUTED: " + ex.getClass().getName());
		ObjectMapper objMap = new ObjectMapper();
		try{
			String jsonString = "{\"message\": \"Too many requests. Please try again later.\"}";
			JsonNode node = objMap.readTree(jsonString);
			return node;
		} catch(Exception e) {
			System.out.print(e.getMessage());
			return null;
		}
	}
	
	public int getResult(List<Response> responses) {
		int result = questionFeign.getResult(responses);
		return result;
	}
	
	public List<JsonNode> testFeignForExtCalls() {
		return externalCallsFeign.getUsers();
	}
	
}
