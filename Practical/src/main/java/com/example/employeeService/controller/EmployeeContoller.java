package com.example.employeeService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeService.model.Employee;

//import com.example.employeeService.model.Telephone;
import com.example.employeeService.service.EmployeeService;

import com.example.employeeService.service.TelephoneServiceImpl;

@RestController
public class EmployeeContoller {

	@Autowired

	EmployeeService employeeService;

	@Autowired

	TelephoneServiceImpl telephoneService;

	@RequestMapping("/")
	public List<Employee> getAllUser() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping("/add")
	public Employee addAllEmployees(@RequestBody Employee employee) {
		return employeeService.add(employee);
	}

	@RequestMapping("/employee/{id}")
	public Employee getByID(@PathVariable Integer id) {
		return employeeService.fethAllAllocationsByID(id);
	}

	// @RequestMapping(value = "/add-employee", method = RequestMethod.POST)
	// public void addUser(@RequestBody Employee employee) {
	// employeeService.addEmployee(employee);
	// }

	// @RequestMapping(value = "/add-tele", method = RequestMethod.POST)
	// public void addTel(@RequestBody Telephone telephone) {
	// telephoneService.addTel(telephone);
	// }

	// @RequestMapping(value = "/EmpsaveWithTp", method = RequestMethod.POST)
	// void saveEmployee(@RequestBody Employee employee) {

	// for (Telephone telephone : employee.getTelephones()) {
	// telephone.setEmployee(employee);
	// }

	// employeeService.addEmployee(employee);
	// }

	// @RequestMapping("/hello")

	// public String greeting(){
	// return "hello";

	// }
}
