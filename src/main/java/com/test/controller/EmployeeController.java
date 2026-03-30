package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;
import com.test.service.impl.EmployeeServieImpl;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeServieImpl empserviceimpl;
	
	@PostMapping("/create")
	public Employee createEmployee(Employee employee) {
		return empserviceimpl.saveEmployee(employee);
		
	}
	@GetMapping("/fetch")
	public List<Employee> viewEmployee(){
		return empserviceimpl.viewAllEmployees();
		
	}
	
}
