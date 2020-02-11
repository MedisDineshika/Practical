package com.example.practical.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practical.dao.TelephoneDao;

import com.example.practical.model.Telephone;

@Service
@Transactional()
public class TelephoneService {

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
