package com.example.demo.servcies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmpDetails;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmpDetailsRepository;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService
{	
	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	Employee emp;
	
	@Autowired
	EmpDetails empDetails;
	
	
//	public EmployeeService(EmployeeRepository repo) {
//		super();
//		this.repo = repo;
//	}
	
	@Autowired
	public void addEntity(Employee emp)
	{
		emp.setEmpDetails(empDetails);
		this.repo.save(emp);
		System.out.println("Added");
	}

	

	
}
