package com.example.demo.servcies;

import java.util.List;
import java.util.Optional;

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
	EmpDetailsRepository repo1;
	
	//	@Autowired
	//	Employee emp;
	
	@Autowired
	EmpDetails empDetails;
	
	
	public void addEntity(Employee emp)
	{
		emp.setEmpDetails(empDetails);
		this.repo.save(emp);
		System.out.println("Added");
	}
	
	public void remove(int id)
	{
		this.repo.deleteById(id);
		System.out.println("removed");
	}
	
	public List<Employee> getAll(Employee employee)
	{
		return this.repo.findAll();
	}
	
	public void getById(int id)
	{
		System.out.println(this.repo.findById(id));
	}
	
	

	

	
}
