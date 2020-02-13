package com.example.employeeService.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int ID;

	    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "projects",cascade = CascadeType.ALL)
	    List<Employee> employees;

	    String name;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
}
