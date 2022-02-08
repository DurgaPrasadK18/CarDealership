package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Salesperson;
import com.example.demo.repository.Salespersonrepository;
@Service
public class Salespersonservice {
@Autowired
Salespersonrepository SalespersonRepository;
	public Iterable<Salesperson> getSalersDetails() {
		
		return SalespersonRepository.findAll();
	}

	public void saveSalerDetail(@Valid Salesperson saler) {
		SalespersonRepository.save(saler);
	}


	
}