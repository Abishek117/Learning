package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Questions;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Integer> {

	@Query(nativeQuery = true,value = "select question_id from questions")
	public ArrayList<Integer> getQuestionId();

	@Query(nativeQuery = true,value = "select question_title from questions")
	public ArrayList<String> getQuestion();
	
	@Query(nativeQuery = true, value = "select question_id from questions where category=:category ORDER BY RAND() LIMIT :count")
	public List<Integer> findRandomQuestionsByCategory(String category, int count);


}
