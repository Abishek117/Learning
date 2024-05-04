package com.example.quiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quiz.quizEntity.QuestionWrapper;
import com.example.quiz.quizEntity.Quiz;
import com.example.quiz.quizEntity.Response;
import com.example.quiz.repo.QuestionFeign;
import com.example.quiz.repo.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	QuizRepository repo1;
	
	@Autowired
	Quiz quiz;
	
	private final QuestionFeign questionFeign;

    @Autowired
    public QuizService(QuestionFeign questionFeign) {
        this.questionFeign = questionFeign;
    }
	
	public ResponseEntity<String> 	getAllQuiz(String category, int count, String title) {
		List<Integer> questions = questionFeign.getQuestionsForQuiz(category, count).getBody();
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

	public int getResult(List<Response> responses) {
		int result = questionFeign.getResult(responses);
		return result;
	}
	
	

}
