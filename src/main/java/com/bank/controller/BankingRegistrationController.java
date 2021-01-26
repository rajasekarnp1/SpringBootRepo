package com.scb.bank.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.bank.dto.AccountRequestDto;
import com.scb.bank.dto.BankRequestDto;
import com.scb.bank.dto.CustomerRequestDto;
import com.scb.bank.dto.TransferRequestDTO;
import com.scb.bank.entity.User;
import com.scb.bank.exception.BankingBusinessException;
import com.scb.bank.exception.BankingTransactionTechnicalException;
import com.scb.bank.service.AccountService;
import com.scb.bank.service.BankService;
import com.scb.bank.service.CustomerService;
import com.scb.bank.service.UserService;

@RestController
@RequestMapping("registration")
@ControllerAdvice
public class BankingRegistrationController {
	Logger logger = LoggerFactory.getLogger(BankingRegistrationController.class);
	@Autowired
	UserService userService;

	@Autowired
	CustomerService customerServiceImpl;

	@Autowired
	BankService bankServiceImpl;
	
	 @Autowired 
	 AccountService accountServiceImpl;
	 
	// Creates a new User
	/*
	 * @PostMapping("User") public ResponseEntity<Void> addUser(@RequestBody User
	 * user) { userService.saveUser(user); HttpHeaders headers = new HttpHeaders();
	 * return new ResponseEntity<Void>(headers, HttpStatus.CREATED); }
	 */
	// Creates a new Customer

	@PostMapping("savecustomeraccount")
	//@ExceptionHandler(BankingBusinessException.class)
	public ResponseEntity<Void> addCustomer(@Valid @RequestBody CustomerRequestDto customerRequest) {
		String errorMessage ="";
		try {
			String response = customerServiceImpl.saveCustomer(customerRequest);
		} catch (BankingBusinessException e) {
			errorMessage = " there is logic exception in this application";
		} catch (BankingTransactionTechnicalException e) {
			errorMessage = " there is logic exception in this application";
		}
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	//Creates a new bank
		@PostMapping("savebank")
	   // @ExceptionHandler(BankingBusinessException.class)

		public ResponseEntity<Void> addBank(@Valid @RequestBody BankRequestDto bankRequestDto ) {
			try {
				bankServiceImpl.saveBank(bankRequestDto);
			} catch (BankingBusinessException e) {
				
				logger.error("there is business issue for saving values in to te banking object");
			} catch (BankingTransactionTechnicalException e) {
				// TODO Auto-generated catch block
				logger.error("there is issue for technical saving values in to te banking object");
			}
				HttpHeaders headers = new HttpHeaders();
				return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}
		
		//Creates a new bank
		/*
		 * @PostMapping("saveAccount") public ResponseEntity<Void> addBank(@RequestBody
		 * AccountRequestDto accountRequestDto ) {
		 * accountServiceImpl.saveAccount(accountRequestDto); HttpHeaders headers = new
		 * HttpHeaders(); return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		 * }
		 */

		@PostMapping("transferamount")
		public ResponseEntity<Void> transferAmount(@RequestBody TransferRequestDTO transferRequest ) {
			logger.debug("inside the transfer amount");
			accountServiceImpl.transactAmount(transferRequest);
				HttpHeaders headers = new HttpHeaders();
				return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}
}
