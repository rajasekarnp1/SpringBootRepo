package com.scb.bank.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.bank.entity.Account;


@Repository("accountRepository")
public interface AccountRepository extends JpaRepository<Account, Long>{

	
	
}
