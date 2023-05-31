package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Author;
import com.example.demo.entity.Books;
import com.example.demo.repo.AuthorRepository;
import com.example.demo.repo.BooksRepository;

@Service
public class ServiceClass
{
	
	@Autowired
	AuthorRepository repo1;
	
	@Autowired
	BooksRepository repo2;
	
	@Autowired
	Author a;
	
	@Autowired
	List<Books> b;
	
	public void addEntity()
	{
		a.setBooks(b);
		repo1.save(a);
		System.out.println("Added");
	}
	
	public Author/*List<Author>*/ getByName()
	{
		/*List<Author>*/Author a = repo1.findByName("Sudha Kongara");
		
//		for(Author author : a)
//		{
//			System.out.println("Name : " + author.getName());
//			List<Books> b = author.getBooks();
//			for(Books books : b)
//			{
//				System.out.println("Book Name : " + books.getBookName() + ".It's rating : " + books.getRating());
//			}
//			System.out.println("********");
//		}
		return a;
		
	}
	
	public List<Author> getAll()
	{
		return repo1.findAll();
	}
	
	public void removeEntity()
	{
		repo1.deleteByName("Lokesh Kanagaraj");
		System.out.println("Removed");
	}
	
}
