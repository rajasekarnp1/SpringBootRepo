package com.scb.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.bank.entity.Bank;


@Repository
public interface BankRepository extends JpaRepository<Bank, Long>{

	
}
