package com.example.practical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practical.model.Employee;
import com.example.practical.service.EmployeeService;

@RestController
public class EmployeeContoller {

@Autowired

EmployeeService employeeService ;

@RequestMapping("/")    
public List<Employee> getAllUser()  
{    
return employeeService.getAllEmployees();    
}       
@RequestMapping(value="/add-employee", method=RequestMethod.POST)    
public void addUser(@RequestBody Employee employee)  
{    
	employeeService.addEmployee(employee);    
}       







//@RequestMapping("/hello") 
	
	//public String greeting(){
	//return "hello";
	
	

		
	//}
}
