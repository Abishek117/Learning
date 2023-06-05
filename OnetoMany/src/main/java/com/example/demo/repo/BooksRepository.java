package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> 
{
	@Query(nativeQuery = true,value = "select book_id from books")
	public ArrayList<Integer> getBookId();
	
	
}
