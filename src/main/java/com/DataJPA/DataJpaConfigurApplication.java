package com.DataJPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DataJPA.Entity.Address;
import com.DataJPA.Entity.Mobile;
import com.DataJPA.Entity.category;
import com.DataJPA.Entity.employe;
import com.DataJPA.Entity.product;
import com.DataJPA.Repository.addressRepo;
import com.DataJPA.Repository.categoryRepo;
import com.DataJPA.Repository.empRepo;
import com.DataJPA.Repository.mobileRepo;
import com.DataJPA.Repository.productRepo;

@SpringBootApplication
public class DataJpaConfigurApplication implements CommandLineRunner {
	@Autowired
	private empRepo empRepo;
	
	@Autowired
	private mobileRepo mobileRepo;
	
	@Autowired
	private addressRepo addressRepo;
	
	@Autowired
	private categoryRepo caregoryRepo;
	
	@Autowired 
	private productRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(DataJpaConfigurApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
//	
//		employe emp = new employe();
//		emp.setEmpname("ujjwal");
//		
//		Mobile mobile = new Mobile();
//		mobile.setMobilename("iPhone 12");
//		
//		emp.setMobile(mobile);
//		mobile.setEmp(emp);
//		
//		empRepo.save(emp);
//		mobileRepo.save(mobile);
//		
//		employe emp1 = new employe();
//		emp1.setEmpname("Satyam");
//		
//		Mobile mobile1 = new Mobile();
//		mobile1.setMobilename("Android");
		
		
		
		
//		emp1.setMobile(mobile1);
//		mobile1.setEmp(emp1);
//		
//		empRepo.save(emp1);
//		mobileRepo.save(mobile1);
//		
//		System.out.println("data save successfully ");
////		
		
////		
//		 employe em = empRepo.findById(2).get();
// 		// Mobile mob= mobileRepo.findById(1).get();
//		 System.out.println("name = "+ em.getEmpname());
//		 System.out.println("mobile= "+em.getMobile().getMobilename());
////		 
		
		
		
		// OneToMany and ManyToOne
		
//		employe emp = new employe();
//		emp.setEmpname("Rajan");
//		
		
		
		
//		Address add= new Address();
//		add.setAddress(" Salempur,deoria");
//		add.setType("permanent");
//		add.setEmp(emp);
//		
//		Address add2= new Address();
//		add2.setAddress(" new ashok nagar,delhi");
//		add2.setType("current address");
//		add2.setEmp(emp);
		
		
//		List<Address> adList= Arrays.asList(add,add2);
//	      emp.setAddress(adList);
//	      
//	      empRepo.save(emp);
//	      
//	      
//	      System.out.println("save success");
	      
	      // fetch data 
		
//		 employe emp=empRepo.findById(6).get();
//	      
//	      System.out.println("employe name : " + emp.getEmpname());
//	       emp.getAddress().forEach(e-> System.out.println(e.getAddress()+"="+e.getType()));
//		
//		
//	    Address add=  addressRepo.findById(1).get();
//	    
//	    System.out.println(" address ="+add.getAddress());
//	    
//	    System.out.println("employe name  = " + add.getEmp().getEmpname());
//	
		
		
		category cal= new category();
		cal.setCategoryName("Electronic");
		
		category cal2= new category();
		cal2.setCategoryName("Mobile");
		
		
		product pd = new product();
		pd.setProductName("torch");
		
		product pd2 = new product();
		pd2.setProductName(" iPhone 12 ");
		
		product pd3 = new product();
		pd3.setProductName(" iPhone 14 ");
		
		
		// relationship mapping ManyToMany 
		
		cal.getProduct().add(pd);
		cal.getProduct().add(pd2);
		cal.getProduct().add(pd3);
		
		cal2.getProduct().add(pd2);
		cal2.getProduct().add(pd3);
		
		
		pd.getCategories().add(cal);
		pd2.getCategories().add(cal);
		pd3.getCategories().add(cal);
		
		pd2.getCategories().add(cal2);
		pd3.getCategories().add(cal2);
		
		caregoryRepo.save(cal);
		caregoryRepo.save(cal2);
		
		
		
//		 
	}
}