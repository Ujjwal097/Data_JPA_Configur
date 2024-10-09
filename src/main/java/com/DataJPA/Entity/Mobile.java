package com.DataJPA.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Mobile {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(unique = true) 
private String mobilename;
@OneToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name="emp_id" )
private employe emp;

public employe getEmp() {
	return emp;
}

public void setEmp(employe emp) {
	this.emp = emp;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMobilename() {
	return mobilename;
}

public void setMobilename(String mobilename) {
	this.mobilename = mobilename;
}

public Mobile(int id, String mobilename) {
	super();
	this.id = id;
	this.mobilename = mobilename;
}

public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Mobile [id=" + id + ", mobilename=" + mobilename + ", emp=" + emp + "]";
}

}
