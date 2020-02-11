package com.example.practical.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.practical.model.Telephone;

public interface TelephoneDao extends JpaRepository<Telephone, Integer>{

}
