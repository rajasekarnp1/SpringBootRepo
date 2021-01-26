package com.scb.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.bank.dto.BankRequestDto;
import com.scb.bank.service.BankService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("deposit")
public class BankingDepositController {
	Logger logger = LoggerFactory.getLogger(BankingDepositController.class);
	
	@Autowired
	BankService bankService;
	
	/*
	 * //Creates a new User
	 * 
	 * @PostMapping("save") public ResponseEntity<Void> addBank(@RequestBody
	 * BankRequestDto bankRequestDto ) { bankService.saveBank(bankRequestDto);
	 * HttpHeaders headers = new HttpHeaders(); return new
	 * ResponseEntity<Void>(headers, HttpStatus.CREATED); }
	 */

}
