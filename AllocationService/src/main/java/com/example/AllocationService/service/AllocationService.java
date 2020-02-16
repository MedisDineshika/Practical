package com.example.AllocationService.service;

import java.util.List;

import com.example.AllocationService.model.Allocation;

public interface AllocationService {

	Allocation saveAllocation(Allocation allocation);

	List<Allocation> findAllocationsByEid(Integer id);

}
