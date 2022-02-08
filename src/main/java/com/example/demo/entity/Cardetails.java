package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cardetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer carid;
	private String carnumber;
	private String serviceticket;
	private String mechanicname;
	private String services;

	Customer customer;
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarplatenumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public String getServiceticket() {
		return serviceticket;
	}
	public void setServiceticket(String serviceticket) {
		this.serviceticket = serviceticket;
	}
	public String getMechanicname() {
		return mechanicname;
	}
	public void setMechanicname(String mechanicname) {
		this.mechanicname = mechanicname;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}

}
