package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	private Integer customerId;
	//@OneToMany(targetEntity = Cardetails.class, mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private String customername;


	public Integer getCustomerid() {
		return customerId;
	}

	public void setCustomerid(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
}
