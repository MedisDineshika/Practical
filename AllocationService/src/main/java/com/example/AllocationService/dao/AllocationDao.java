package com.example.AllocationService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AllocationService.model.Allocation;


public interface AllocationDao extends JpaRepository<Allocation, Integer> {

}
