package com.example.employeeService.model;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.example.AllocationService.model.Allocation;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;

	private String name;

	private int marks;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Telephone> telephones;

	@ManyToMany(cascade = CascadeType.ALL)
	@Fetch(value = FetchMode.SELECT)
	@JoinTable(name = "EmployeeProjects", joinColumns = {
			@JoinColumn(name = "emp_ID", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "prj_ID", referencedColumnName = "id") })

	List<Project> projects;

	@Transient
	Allocation[] allocations;

	public Allocation[] getAllocations() {
		return allocations;
	}

	public Employee() {
	}

	public Employee(Integer id, String name, int marks, Address address, List<Telephone> telephones,
			List<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.telephones = telephones;
		this.projects = projects;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void setAllocations(Allocation[] allocations) {
		this.allocations = allocations;
	}

}
