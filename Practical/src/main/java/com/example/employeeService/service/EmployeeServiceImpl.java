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
import com.example.employeeService.model.Telephone;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

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

	@SuppressWarnings("unused")
	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> employee = employeeDao.findById((long) id);

        if (employee.isPresent()) {
            HttpEntity<String> httpEntity = new HttpEntity<>("", new HttpHeaders());

            Employee employee1 = employee.get();
            ResponseEntity<Allocation[]> responseEntity = restTemplate().exchange("" + id, HttpMethod.GET, httpEntity, Allocation[].class);
            return employee1;
        }
        return null;
	}

}
