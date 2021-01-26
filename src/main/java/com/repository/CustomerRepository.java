package com.scb.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scb.bank.dto.UserResponseDto;
import com.scb.bank.entity.Customer;
import com.scb.bank.entity.User;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
}
