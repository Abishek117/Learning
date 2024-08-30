package com.example.quiz.quizEntity;

import java.util.List;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "quiz_data")
public class Quiz {

	@Id
	@Column(name = "quiz_id")
	private int id;
	
	@Column(name = "quiz_title")
	private String quizTitle;
	
	@ElementCollection
	@CollectionTable(name="quiz_questions", joinColumns = @JoinColumn(name = "quiz_id"))
	@Column(name = "question_id")
	private List<Integer> questions;

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(int id, String quizTitle, List<Integer> questions) {
		super();
		this.id = id;
		this.quizTitle = quizTitle;
		this.questions = questions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuizTitle() {
		return quizTitle;
	}

	public void setQuizTitle(String quizTitle) {
		this.quizTitle = quizTitle;
	}

	public List<Integer> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Integer> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", quizTitle=" + quizTitle + ", questions=" + questions + "]";
	}
	
	
}
	
	
	
	
	
	
