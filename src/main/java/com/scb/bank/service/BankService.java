package com.scb.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scb.bank.dto.BankRequestDto;
import com.scb.bank.dto.BankResponseDto;
import com.scb.bank.entity.Bank;
import com.scb.bank.exception.BankingBusinessException;
import com.scb.bank.exception.BankingTransactionTechnicalException;

@Service
public interface BankService {
	
	public String saveBank(BankRequestDto Bank) throws BankingBusinessException, BankingTransactionTechnicalException;
	
	public List<BankResponseDto> getAllBanks();
	
	public Bank getBankById(Long BankId);
	
	
	void deleteBankById(Long BankId);
	
	void updateBankById(Bank Bank);


}
