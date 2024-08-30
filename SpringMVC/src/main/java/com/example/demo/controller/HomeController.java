
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(path = "/api/v1")
public class HomeController
{

	private ModelAndView mdlView;

	@Autowired
	Student s;
	
	@Autowired
	StudentService service;

	@Autowired
	public HomeController(ModelAndView mdlView) {
		super();
		this.mdlView = mdlView;
	}
	
	@GetMapping(path = "/CollegeXStudentRegistry")
	public ModelAndView home()
	{
		//return "Hii";
		mdlView.setViewName("index");
		return mdlView;
	}
	
	@RequestMapping(path = "/login")
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
		if ("admin".equals(username) && "password".equals(password)) {
			model.addAttribute("username", username);
			mdlView.setViewName("welcome");
			return mdlView;
		} else {
			model.addAttribute("errorMessage", "Username or password doesn't match.");
			mdlView.setViewName("index");
			return mdlView;
		}

	}
	
	@RequestMapping("/stud")
	public String getUserName(@RequestParam("name") String name, Model m)
	{
		s.setName(name);
		m.addAttribute("StudentName", s.getName());
		return "welcome.jsp";
	}

	@RequestMapping("/details")
	public String getStudentName1(@RequestParam("name") String name, Model m)
	{
		m.addAttribute("StudentDetails",service.getByName(name));
		return "profile.jsp";
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
