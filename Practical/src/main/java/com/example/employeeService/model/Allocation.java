package com.example.employeeService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;

	private Integer empId;

	private String name;

	private String projectName;

	Allocation Allocation[];

	public Allocation() {

	}

	public Allocation(Integer id, Integer empId, String name, String projectName) {
		super();
		this.id = id;
		this.empId = empId;
		this.name = name;
		this.projectName = projectName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Allocation[] getAllocation() {
		return Allocation;
	}

	public void setAllocation(Allocation[] allocation) {
		Allocation = allocation;
	}

}
