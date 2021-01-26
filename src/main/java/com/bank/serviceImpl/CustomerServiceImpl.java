package com.scb.bank.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.bank.dto.AccountRequestDto;
import com.scb.bank.dto.CustomerRequestDto;
import com.scb.bank.dto.CustomerResponseDto;
import com.scb.bank.entity.Account;
import com.scb.bank.entity.Bank;
import com.scb.bank.entity.Customer;
import com.scb.bank.exception.BankingBusinessException;
import com.scb.bank.exception.BankingTransactionTechnicalException;
import com.scb.bank.service.CustomerService;
import com.scb.bank.repository.*;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	BankRepository bankRepository;
	@Autowired
	CustomerResponseDto customerResponseDto;
	

	Customer customer;
	
	Account account;
	
	Bank bank;
	
	@Transactional
	@Override
	public String saveCustomer(CustomerRequestDto CustomerReq) throws BankingBusinessException, BankingTransactionTechnicalException{
		
		
			logger.debug("inside the bank service impl file");
		
		//BeanUtils.copyProperties(CustomerReq, customer);
		customer = new Customer();
		
		
		BeanUtils.copyProperties(CustomerReq.getCustomerDto(), customer);
		
		
		
		customer = customerRepository.save(customer);
		Optional<Bank> bankObj = bankRepository.findById(CustomerReq.getBankId());
		Set<AccountRequestDto> accountSet = CustomerReq.getAccountDTO();
		if(ObjectUtils.isNotEmpty(customer) && bankObj.isPresent()) {
        for(AccountRequestDto accountReq : accountSet) {
        	account = new Account();
			BeanUtils.copyProperties(accountReq, account);
			account.setCustomer(customer);
			account.setBank(bankObj.get());
			account = accountRepository.save(account);
			System.out.println("sucessfully saved");
		}
		}
		else {
			throw new BankingBusinessException("the object is null");
		}
		
		 return "sucess";
	}	
	
	 
	
	@Override
	public List<CustomerResponseDto> getAllCustomers() {
		List<CustomerResponseDto> customerDtoLst = new ArrayList<>();
		List<Customer> customerList = customerRepository.findAll();
		
		customerList.forEach(customer -> {
		customerResponseDto.setName(customer.getName());
		customerResponseDto.setPhone(customer.getPhone());
		customerResponseDto.setEmail(customer.getEmail());
		customerResponseDto.setSalary(customer.getSalary());
		customerDtoLst.add(customerResponseDto);
		
		}
		
		);  

        return customerDtoLst;
	}
	@Override
	public CustomerResponseDto getCustomerById(Long CustomerId) {
		Customer customer = customerRepository.getOne(CustomerId);
		BeanUtils.copyProperties(customer, customerResponseDto);
		
		return customerResponseDto;
	}
	@Override
	public void deleteCustomerById(Long CustomerId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateCustomerById(Customer Customer) {
		// TODO Auto-generated method stub
		
	}
	
}
