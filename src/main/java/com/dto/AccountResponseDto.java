package com.scb.bank.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AccountResponseDto {
	 private long accountId;

	    private String acctType;

	    public long getAccountId() {
			return accountId;
		}

		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}

		private double balance;

	    private Date openingAcctDate;
	    
	    private Date lastUpdateAcctDate;

		 

		public String getAcctType() {
			return acctType;
		}

		public void setAcctType(String acctType) {
			this.acctType = acctType;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Date getOpeningAcctDate() {
			return openingAcctDate;
		}

		public void setOpeningAcctDate(Date openingAcctDate) {
			this.openingAcctDate = openingAcctDate;
		}

		public Date getLastUpdateAcctDate() {
			return lastUpdateAcctDate;
		}

		public void setLastUpdateAcctDate(Date lastUpdateAcctDate) {
			this.lastUpdateAcctDate = lastUpdateAcctDate;
		}
	    
	    

}
