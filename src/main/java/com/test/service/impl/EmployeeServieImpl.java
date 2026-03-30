package com.test.service.impl;

import java.util.List;

import com.test.entity.Employee;
import com.test.repo.EmployeeRepository;
import com.test.service.EmployeeService;

public class EmployeeServieImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List viewAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

}
