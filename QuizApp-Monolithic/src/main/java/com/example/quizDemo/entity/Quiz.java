package com.example.quizDemo.entity;

import java.util.List;

import org.springframework.stereotype.Component;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "Quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "quiz_id")
	private int id;
	
	@Column(name = "quiz_title")
	private String quizTitle;
	
	@ManyToMany
	private List<Questions> questions;

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(int id, String quizTitle, List<Questions> questions) {
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

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", quizTitle=" + quizTitle + ", questions=" + questions + "]";
	}
	
	
}
	
	
	
	
	
	
