package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class QuestionWrapper {
	
	private long id;
	
	private String question;
	
	private String option1;
	
	private String option2;
	
	private String option3;

	public QuestionWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionWrapper(long id, String question, String option1, String option2, String option3) {
		super();
		this.id = id;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	@Override
	public String toString() {
		return "QuestionWrapper [id=" + id + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + "]";
	}

	
}
