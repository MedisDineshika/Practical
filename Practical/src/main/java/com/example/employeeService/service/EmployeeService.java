package com.example.employeeService.service;

import java.util.List;

import com.example.employeeService.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void addEmployee(Employee employee);

	Employee getEmployeeById(int id);
	
	
	
	
	

}
