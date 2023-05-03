package com.example.main;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaApplication.class, args);
		Employee abi = ctx.getBean(Employee.class);
		EmployeeService service = ctx.getBean(EmployeeService.class);
		Employee added = service.add(abi);
		ctx.close();

	}
	@Bean
	public Employee abi()
	{
		return new Employee(101,"Abi",23);
	}

}
