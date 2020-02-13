package com.example.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeService.model.Address;


public interface AddressDao extends JpaRepository<Address, Integer> {

}