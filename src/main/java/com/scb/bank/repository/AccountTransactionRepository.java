package com.scb.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 

@Repository
public interface AccountTransactionRepository extends JpaRepository<com.scb.bank.entity.AccountTransaction, Long>{

	
}
