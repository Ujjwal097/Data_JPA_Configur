package com.DataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DataJPA.Entity.Address;

public interface addressRepo extends JpaRepository<Address, Integer> {

}
