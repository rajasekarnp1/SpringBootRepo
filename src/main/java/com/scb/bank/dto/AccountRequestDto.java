package com.scb.bank.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class AccountRequestDto implements Serializable {
	private static final long serialVersionUID = 1L;
    private long accountId;
    @NotNull
    @Size(min = 2, max = 10)
    private String acctType;
    
    @Min(1)
    private double balance;

    private Date openingAcctDate;
    
    private Date lastUpdateAcctDate;
    @NotNull
    @Size(min = 1, max = 10)
    private long custId;
    @NotNull
    @Size(min = 1, max = 10)
    private long bankId;
    
    

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

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

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
    
}
