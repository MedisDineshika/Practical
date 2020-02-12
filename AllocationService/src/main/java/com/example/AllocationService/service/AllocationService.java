package com.example.AllocationService.service;


import java.util.List;

import com.example.AllocationService.model.Allocation;

public interface AllocationService {

	void saveAllocation(Allocation allocation);

	Allocation findAllocationById(Integer id);

	List<Allocation> fetchAllAllocations();
	

	
}
