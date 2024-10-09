package com.DataJPA.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
 private String address;
 
 private String type;
 @ManyToOne(cascade = CascadeType.PERSIST , fetch = FetchType.EAGER)
 private employe emp;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Address(int id, String address, String type) {
	super();
	this.id = id;
	this.address = address;
	this.type = type;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public employe getEmp() {
	return emp;
}

public void setEmp(employe emp) {
	this.emp = emp;
}

public Address(int id, String address, String type, employe emp) {
	super();
	this.id = id;
	this.address = address;
	this.type = type;
	this.emp = emp;
}
 
}
