package com.scb.bank.exception;

public class BankingTransactionTechnicalException extends Exception{
	public BankingTransactionTechnicalException(String errorMessage) {
        super(errorMessage);
    }

}
