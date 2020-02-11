package com.example.practical.model;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;

	private String name;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(mappedBy = "employee")
	private List<Telephone> telephones;

	// @ManyToMany(cascade = CascadeType.ALL)
	// @JoinTable(name="project_employee",
	// joinColumns= @JoinColumn (name="eid", referencedColumnName="id"),
	// inverseJoinColumns=@JoinColumn(name="pid",referencedColumnName="id"))
	// List<Project>projects;

	public List<Telephone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}

	public Employee(long id, String name, Address address, List<Telephone> telephones) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephones = telephones;
	}

	public Employee(long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
