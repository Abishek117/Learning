package com.example.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.quizEntity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

	
}
