package com.scb.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.scb.bank.dto.AccountRequestDto;
import com.scb.bank.service.AccountService;



@RestController
@RequestMapping("transfer")

public class BankingAmoutTransactionController {
	Logger logger = LoggerFactory.getLogger(BankingAmoutTransactionController.class);
	
	 @Autowired 
	 AccountService accountServiceImpl;
	  
	 
	  @PostMapping(value = "bank", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )

	  public void addBankAccount(@RequestBody AccountRequestDto
	  accountRequestDto) { 
		  logger.debug("inside the add banking account"  );
		  accountServiceImpl.saveAccount(accountRequestDto);
	  
	  }
	 
}
