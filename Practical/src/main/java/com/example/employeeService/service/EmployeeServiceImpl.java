package com.example.employeeService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.AllocationService.model.Allocation;
import com.example.employeeService.dao.EmployeeDao;
import com.example.employeeService.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<>();
		employeeDao.findAll().forEach(employees::add);
		return employees;
	}

	@Override
	public Employee fethAllAllocationsByID(Integer id) {
		Optional<Employee> employee = employeeDao.findById(id);
		if (employee.isPresent()) {

			HttpEntity<String> stringHttpEntity = new HttpEntity<>("", new HttpHeaders());

			Employee employee1 = employee.get();

			ResponseEntity<Allocation[]> responseEntity = restTemplate.exchange(
					"http://localhost:9033/findAllocationById/" + id, HttpMethod.GET, stringHttpEntity,
					Allocation[].class);

			employee1.setAllocations(responseEntity.getBody());
			return employee1;
		} else
			return null;
	}

	@Override
	public Employee add(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

}
