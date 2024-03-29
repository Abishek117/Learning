package com.learning.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.main.entity.Courses;
import com.learning.main.ifaces.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository cr;

	
	public List<String> findCourses(){
		List<Courses> courses =  cr.findAll();
		return courses.stream().filter(n -> n.getPrice()>200).map(m -> m.getClass().toString().concat(" course")).collect(Collectors.toList());
		
	}
	
	public Courses save(Courses c) {
		return cr.save(c);
	}
	
	public Optional<Courses> getCourseById(int id) {
		return cr.findById(id);
	}
	

}
