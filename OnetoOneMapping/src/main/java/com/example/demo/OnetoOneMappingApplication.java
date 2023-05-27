package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.EmpDetails;
import com.example.demo.entity.Employee;
import com.example.demo.servcies.EmployeeService;

@SpringBootApplication
public class OnetoOneMappingApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(OnetoOneMappingApplication.class, args);
		
		EmployeeService es = ctx.getBean(EmployeeService.class);
		
		Employee e = ctx.getBean(Employee.class);
		
		EmpDetails ed = ctx.getBean(EmpDetails.class);
//	
//		ed.setId(72112412);
//		ed.setName("Kathiravan");
//		ed.setType("Aadhaar");
//		
//		e.setEmpId(104);
//		e.setEmpName("Kathir");
//		e.setAge(25);
//		e.setEmpDetails(ed);
		
//		es.addEntity(e);
//		es.remove(106);
		System.out.println(es.getAll(e));
//		es.getById(107);
	}

}
