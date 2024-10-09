package com.DataJPA.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
 private int id;
	@Column(unique = true) 
 private String empname;
 
 @OneToOne(cascade = CascadeType.PERSIST) // Add CascadeType.PERSIST
 @JoinColumn(name = "mobile_id")
 private Mobile mobile;
 @OneToMany(mappedBy = "emp", cascade = CascadeType.PERSIST , fetch = FetchType.EAGER)
// @JoinColumn(name="add_id")
 private List<Address> address;
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
@Override
public String toString() {
	return "employe [id=" + id + ", empname=" + empname + ", mobile=" + mobile + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public Mobile getMobile() {
	return mobile;
}
public void setMobile(Mobile mobile) {
	this.mobile = mobile;
}
public employe(int id, String empname, Mobile mobile) {
	super();
	this.id = id;
	this.empname = empname;
	this.mobile = mobile;
}
public employe() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
