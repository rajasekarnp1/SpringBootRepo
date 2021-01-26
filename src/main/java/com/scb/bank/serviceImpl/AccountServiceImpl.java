package com.scb.bank.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.bank.dto.AccountRequestDto;
import com.scb.bank.dto.TransferRequestDTO;

import com.scb.bank.entity.Account;
import com.scb.bank.entity.AccountTransaction;
import com.scb.bank.entity.Customer;
import com.scb.bank.service.AccountService;
import com.scb.bank.repository.*;

@Service
public class AccountServiceImpl implements AccountService{
	Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired(required = true)
	AccountTransactionRepository accountTransactionRepository;
	
	

	@Override
	public Account saveAccount(AccountRequestDto accountReq) {
		Account account = new Account();
		Customer customer = new Customer();
		customer =customerRepository.findById(accountReq.getCustId()).get();
		BeanUtils.copyProperties(accountReq, account);
		account.setCustomer(customer);
		Account account2 =accountRepository.save(account);
		return account2;
	}
	@Override
	@Transactional
	public String transactAmount(TransferRequestDTO transferRequest) {
		Optional<Account> account = accountRepository.findById(transferRequest.getFromAccount());
		Optional<Account> account1 = accountRepository.findById(transferRequest.getToAccount());
		
		
		
		if(account.isPresent() && account1.isPresent() ) {
			AccountTransaction accountTransaction1 = new AccountTransaction();
					
			AccountTransaction accountTransaction2 = new AccountTransaction();
			Account debitAccount = new Account();
			Account creditAccount = new Account();
			debitAccount.setBalance(debitAccount.getBalance()-transferRequest.getAmount());
			creditAccount.setBalance(debitAccount.getBalance()+transferRequest.getAmount());
			accountRepository.save(debitAccount);
			accountRepository.save(creditAccount);
			accountTransaction1.setBalance(debitAccount.getBalance());
			//accountTransaction1.setBankId(debitAccount.getBankId());
			//accountTransaction1.setCustId(debitAccount.getCustId());
			accountTransaction1.setFromAcct(transferRequest.getFromAccount());
			accountTransaction1.setToAcct(transferRequest.getToAccount());
			
			accountTransaction2.setBalance(creditAccount.getBalance());
			//accountTransaction2.setBankId(creditAccount.getBankId());
			//accountTransaction2.setCustId(creditAccount.getCustId());
			accountTransaction2.setFromAcct(transferRequest.getToAccount());
			accountTransaction2.setToAcct(transferRequest.getToAccount());
			accountTransactionRepository.save(accountTransaction1);
			accountTransactionRepository.save(accountTransaction2);
			
			return "sucess";
			
		}else {
			return "failure";
		}
		
		
	}
	@Override
	public void checkbalanceAmount(Account Account) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void withdrawAmount(Account Account) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Account getAccountById(Long AccountId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAccountById(Long AccountId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateAccountById(Account Account) {
		// TODO Auto-generated method stub
		
	}
	
}
