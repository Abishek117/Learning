package com.example.service;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
public class EmployeeService
{
    @Autowired
    private EmployeeRepository repo;

    @Autowired
    public EmployeeService(EmployeeRepository repo) {
        super();
        this.repo=repo;
    }

    public Employee add(Employee entity)
    {
        return this.repo.save(entity);
    }
}
