package com.DataJPA.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
	
 private String categoryName;
 
 @ManyToMany( mappedBy = "categories",cascade = CascadeType.MERGE )
 private List<product> product = new ArrayList<>();

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCategoryName() {
	return categoryName;
}

public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}

public List<product> getProduct() {
	return product;
}

public void setProduct(List<product> product) {
	this.product = product;
}

public category(int id, String categoryName, List<com.DataJPA.Entity.product> product) {
	super();
	this.id = id;
	this.categoryName = categoryName;
	this.product = product;
}

public category() {
	// TODO Auto-generated constructor stub
}
 
}

