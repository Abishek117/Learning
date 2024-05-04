package com.example.quizDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quizDemo.entity.Questions;
import com.example.quizDemo.entity.Quiz;
import com.example.quizDemo.entity.QuizWrapper;
import com.example.quizDemo.entity.Response;
import com.example.quizDemo.repo.QuestionRepository;
import com.example.quizDemo.repo.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository repo1;
	
	@Autowired
	QuestionRepository repo2;
	
	@Autowired
	Quiz quiz;
	
	@Autowired
	QuizWrapper quizWrapper;
	
	public ResponseEntity<String> getAllQuiz(String category, int count, String title) {
		List<Questions> questions = repo2.findRandomQuestionsByCategory(category, count);
		quiz.setQuizTitle(title);
		quiz.setQuestions(questions);
		System.out.println(quiz.getQuestions());
		repo1.save(quiz);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuizWrapper>> getQuizById(int id) {
		Optional<Quiz> getQuiz = repo1.findById(id);
		List<Questions> questions = getQuiz.get().getQuestions();
		List<QuizWrapper> quetionsList = new ArrayList<>();
		for(Questions question : questions) {
			QuizWrapper wrapper = new QuizWrapper();
			wrapper.setId(question.getId());
			wrapper.setQuestion(question.getQuestionTitle());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			quetionsList.add(wrapper);
		}
		return new ResponseEntity<>(quetionsList,HttpStatus.OK);
	}

	public int getResult(int id,List<Response> responses) {		
		Optional<Quiz> getQuiz = repo1.findById(id);
		List<Questions> questions = getQuiz.get().getQuestions();
		int i=  0;
		int count = 0;
		for(Response response : responses) {
			if(response.getResponse().equalsIgnoreCase(questions.get(i).getRightAnswer())) {
				count++;
			}
			i++;
		}
		return count;
	}
	

}
