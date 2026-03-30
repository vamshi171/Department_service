package com.test.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entity.Employee;
@Service

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public List viewAllEmployees();
}
