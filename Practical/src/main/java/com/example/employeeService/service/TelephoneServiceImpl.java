package com.example.employeeService.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeService.dao.TelephoneDao;
import com.example.employeeService.model.Telephone;

@Service
@Transactional()
public class TelephoneServiceImpl implements TelephoneService {

	@Autowired
	TelephoneDao telephoneDao;

	public List<Telephone> getAllTelephones() {

		List<Telephone> telephones = new ArrayList<>();
		telephoneDao.findAll().forEach(telephones::add);
		return telephones;
	}

	public void addTel(Telephone telephone) {
		telephoneDao.save(telephone);

	}

}
