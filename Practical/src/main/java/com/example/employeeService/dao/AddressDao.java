package com.example.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeService.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
