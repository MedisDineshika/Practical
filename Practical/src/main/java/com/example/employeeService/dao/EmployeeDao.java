package com.example.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeService.model.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	//void save(Telephone telephone);
	

	
	
	
	
}
