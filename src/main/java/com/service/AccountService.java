package com.scb.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scb.bank.dto.AccountRequestDto;
import com.scb.bank.dto.AccountResponseDto;
import com.scb.bank.dto.TransferRequestDTO;
import com.scb.bank.entity.Account;

@Service
public interface AccountService {
	
	public Account saveAccount(AccountRequestDto Account);
	
	public String transactAmount(TransferRequestDTO transferRequest);
	
	public void checkbalanceAmount(Account Account);
	
	public void withdrawAmount(Account Account);
	
	public List<Account> getAllAccounts();
	
	public Account getAccountById(Long AccountId);
	
	void deleteAccountById(Long AccountId);
	
	void updateAccountById(Account Account);


}
