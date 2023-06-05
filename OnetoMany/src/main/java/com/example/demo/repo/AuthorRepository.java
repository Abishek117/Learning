package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Author;

import jakarta.transaction.Transactional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> 
{
	
	
	
	public Author findByName(String name);
	
	@Modifying
	@Transactional
	public void deleteByName(String name);

}
