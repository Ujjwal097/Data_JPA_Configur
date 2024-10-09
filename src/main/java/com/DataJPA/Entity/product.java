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
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private  int id;
	
private String productName;

@ManyToMany( cascade = CascadeType.MERGE)
private List<category>  categories = new ArrayList<>();

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public List<category> getCategories() {
	return categories;
}

public void setCategories(List<category> categories) {
	this.categories = categories;
}

public product(int id, String productName, List<category> categories) {
	super();
	this.id = id;
	this.productName = productName;
	this.categories = categories;
}

public product() {
	// TODO Auto-generated constructor stub
}

}

