package com.example.practical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practical.model.Employee;

import com.example.practical.model.Telephone;
import com.example.practical.service.EmployeeService;
import com.example.practical.service.TelephoneService;

@RestController
public class EmployeeContoller {

	@Autowired

	EmployeeService employeeService;

	@Autowired

	TelephoneService telephoneService;

	@RequestMapping("/")
	public List<Employee> getAllUser() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "/add-employee", method = RequestMethod.POST)
	public void addUser(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/add-tele", method = RequestMethod.POST)
	public void addTel(@RequestBody Telephone telephone) {
		telephoneService.addTel(telephone);
	}

	@RequestMapping(value = "/EmpsaveWithTp", method = RequestMethod.POST)
	void saveEmployee(@RequestBody Employee employee) {

		for (Telephone telephone : employee.getTelephones()) {
			telephone.setEmployee(employee);
		}

		employeeService.addEmployee(employee);
	}

	// @RequestMapping("/hello")

	// public String greeting(){
	// return "hello";

	// }
}
