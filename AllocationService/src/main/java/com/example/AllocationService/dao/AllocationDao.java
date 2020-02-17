package com.example.AllocationService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AllocationService.model.Allocation;

@Repository
public interface AllocationDao extends JpaRepository<Allocation, Integer> {

}
