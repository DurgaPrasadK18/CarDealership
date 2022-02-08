package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Cardetails;

public interface Carrepository  extends CrudRepository<Cardetails, Integer>{

}