package com.example.employeeService.service;

import java.util.List;

import com.example.employeeService.model.Employee;

public interface EmployeeService {

	Employee add(Employee employee);

	Employee fethAllAllocationsByID(Integer id);

	List<Employee> getAllEmployees();

}
