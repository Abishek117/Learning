package com.learning.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.main.entity.Courses;
import com.learning.main.service.CourseService;

@RestController
@RequestMapping(path = "/api/v1")
public class Controller {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping(path="/courses")
	public List<String> getCourses(){
		return courseService.findCourses();
	}
	
}
