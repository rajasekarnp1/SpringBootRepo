package com.scb.bank.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.bank.dto.BankRequestDto;
import com.scb.bank.dto.BankResponseDto;
import com.scb.bank.entity.Bank;
import com.scb.bank.entity.Book;
import com.scb.bank.entity.Page;
import com.scb.bank.exception.BankingBusinessException;
import com.scb.bank.exception.BankingTransactionTechnicalException;
import com.scb.bank.repository.BankRepository;
import com.scb.bank.repository.BookRepository;
import com.scb.bank.repository.PageRepository;
import com.scb.bank.service.BankService;

@Service
public class BankServiceImpl implements BankService{

	Logger logger = LoggerFactory.getLogger(BankServiceImpl.class);
	
	@Autowired
	BankRepository bankRepository;
	@Autowired
	PageRepository pageRepository;
	@Autowired
	BookRepository bookRepository;
	//@Autowired Bank bank;
	@Override
	public String saveBank(BankRequestDto bankReq) throws BankingBusinessException, BankingTransactionTechnicalException{
		
	 

		logger.debug("inside the bank service impl file");
		 Bank bank = new Bank();
		  BeanUtils.copyProperties(bankReq, bank); 
		  bank = bankRepository.save(bank);
		  if( StringUtils.isNotEmpty(bank.getBankName())){
			  return "scuess";
		  }
		  else {
			  return "false";
		  }
		 
	}
	@Override
	public List<BankResponseDto> getAllBanks() {
			List<BankResponseDto> responseList = new ArrayList<>();
			List<Bank> bankResponse = bankRepository.findAll();
			
			BeanUtils.copyProperties(bankResponse, responseList);
			return responseList;
	}
	@Override
	public Bank getBankById(Long BankId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteBankById(Long BankId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateBankById(Bank Bank) {
		// TODO Auto-generated method stub
		
	}
	
}
