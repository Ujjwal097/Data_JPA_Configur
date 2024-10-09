package com.DataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DataJPA.Entity.product;

public interface productRepo extends JpaRepository<product, Integer> {

}
