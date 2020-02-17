package com.example.AllocationService.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AllocationService.model.Allocation;
import com.example.AllocationService.service.AllocationService;

@RestController
public class AllocationController {

	@Autowired
	AllocationService allocationService;

	// EmployeeService employeeService ;

	@RequestMapping(value = "/add-allocation", method = RequestMethod.POST)
	public void addAllocation(@RequestBody Allocation allocation) {
		allocationService.saveAllocation(allocation);
	}

	@RequestMapping(value = "/findAllocationById/{id}", method = RequestMethod.GET)
	public List<Allocation> allocations(@PathVariable Integer id) {
		List<Allocation> allocation = allocationService.findAllocationsByEid(id);
		return allocation;
	}
}
// @RequestMapping(value="/fetchAllAllocations",method = RequestMethod.GET)
// public <Employee> Allocation[] fetchAllEmployees(Employee employee){
// ResponseEntity<Allocation>restTemplate.exchange(url+employee.getId

// return allocationService.fetchAllAllocations();

// }
