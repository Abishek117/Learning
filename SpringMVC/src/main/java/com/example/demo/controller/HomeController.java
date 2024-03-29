
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

import jakarta.persistence.criteria.Path;


@Controller
//@RequestMapping(path = "/api/v1")
public class HomeController
{
		
	@Autowired
	Student s;
	
	@Autowired
	StudentService service;
	
	@GetMapping(path = "/CollegeXStudentRegistry")
	public String home()
	{
		return "Hii";
		//return "index.jsp";
	}
	
	@RequestMapping("/sayHii")
	public String sayHi()
	{
		return "Hii";
		//return "index.jsp";
	}
	
	@RequestMapping("/stud")
	public String getUserName(@RequestParam("name") String name, Model m)
	{
		s.setName(name);
		m.addAttribute("StudentName", s.getName());
		return "welcome.jsp";
	}
	
	@RequestMapping("/details")
	public String getStudentName(@RequestParam("name") String name, Model m)
	{
		m.addAttribute("StudentDetails",service.getByName(name));
		return "profile.jsp";
	}
	

	//performing same task using @ModelAttribute
	@RequestMapping("/student")
	public String studDetails(@ModelAttribute("student") Student s)
	{
		return "profile.jsp";
	}
	
	//@ModelAttribute at a method level
//	@ModelAttribute
//	public void stud(@RequestParam("name") String name,Model m)
//	{
//		Student s= new Student();
//		s.setName(name);
//		m.addAttribute("StudentName", s.getName());		
//	}
	
	
}
