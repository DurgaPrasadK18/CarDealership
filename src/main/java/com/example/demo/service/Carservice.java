package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cardetails;
import com.example.demo.repository.Carrepository;
@Service
public class Carservice {
@Autowired
Carrepository carRepository;
	public void saveCarDetails(Cardetails car) {
		carRepository.save(car);
	}

}