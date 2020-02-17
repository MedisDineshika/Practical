package com.example.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeService.model.Telephone;
@Repository
public interface TelephoneDao extends JpaRepository<Telephone, Integer>{

}
