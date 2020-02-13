package com.example.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeService.model.Telephone;

public interface TelephoneDao extends JpaRepository<Telephone, Integer>{

}
