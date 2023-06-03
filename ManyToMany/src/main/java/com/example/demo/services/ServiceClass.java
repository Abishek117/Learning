package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Users;
import com.example.demo.repo.CourseRepository;
import com.example.demo.repo.UsersRepository;

@Service
public class ServiceClass
{
	@Autowired
	Users users;
	
	@Autowired
	List<Courses> courses;
	
	@Autowired
	UsersRepository repo1;
	
	@Autowired
	CourseRepository repo2;
	
	public void addEntity()
	{
		users.setCourses(courses);
		repo1.save(users);
		System.out.println("Added");
	}
	
	public List<Users> getAll()
	{
//		List<Users> u = repo1.findAll();
//		for(Users user : u)
//		{
//			System.out.println(user);
//		}
//		return u;
		return repo1.findAll();
	}
	
	public Optional<Users> getById()
	{
		return repo1.findById(102);
	}
	
	public Optional<Courses> getbyCourseId()
	{
		return repo2.findById(1003);
	}
	
	
	public void removeUsers()
	{
/*
  To delete an entry in a many-to-many relationship using Spring Data JPA, you can follow these steps:

   1. Retrieve the entity that you want to delete from the database using its ID or any other identifying attribute.
	
   2. Remove the related entities from the association. In a many-to-many relationship, this involves removing the associated entities from the collection property representing the relationship.
	
   3. Save the updated entity back to the database. Spring Data JPA will automatically handle the necessary updates to the join table
*/
		Optional<Users> u = repo1.findById(103);
		Users users = u.get();
		users.getCourses().clear();
		repo1.save(users);
		//repo1.deleteById(103);
	}

}
