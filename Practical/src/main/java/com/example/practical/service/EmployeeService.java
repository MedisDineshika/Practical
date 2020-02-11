package com.example.practical.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practical.dao.EmployeeDao;
import com.example.practical.model.Employee;
import com.example.practical.model.Telephone;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<>();
		employeeDao.findAll().forEach(employees::add);
		return employees;
	}

	public void addEmployee(Employee employee) {
		employeeDao.save(employee);

	}

	public void addTel(Telephone telephone) {
		// TODO Auto-generated method stub

	}

}
