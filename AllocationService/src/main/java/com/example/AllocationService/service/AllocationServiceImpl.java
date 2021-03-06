package com.example.AllocationService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AllocationService.dao.AllocationDao;
import com.example.AllocationService.model.Allocation;

@Service
@Transactional
public class AllocationServiceImpl implements AllocationService {

	@Autowired

	AllocationDao allocationDao;

	@Override
	public Allocation saveAllocation(Allocation allocation) {
		return allocationDao.save(allocation);

	}

	@Override
	public List<Allocation> findAllocationsByEid(Integer id) {
		return allocationDao.findAll();
	}

}
