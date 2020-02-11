package com.example.practical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practical.model.Address;


public interface AddressDao extends JpaRepository<Address, Integer> {

}
