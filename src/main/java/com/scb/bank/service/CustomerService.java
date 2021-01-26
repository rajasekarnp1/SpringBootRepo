package com.scb.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scb.bank.dto.CustomerRequestDto;
import com.scb.bank.dto.CustomerResponseDto;
import com.scb.bank.entity.Customer;
import com.scb.bank.exception.BankingBusinessException;
import com.scb.bank.exception.BankingTransactionTechnicalException;

@Service
public interface CustomerService {
	
	public String saveCustomer(CustomerRequestDto Customer) throws BankingBusinessException, BankingTransactionTechnicalException;
	
	public List<CustomerResponseDto> getAllCustomers();
	
	public CustomerResponseDto getCustomerById(Long CustomerId);
	
	
	void deleteCustomerById(Long CustomerId);
	
	void updateCustomerById(Customer Customer);


}
