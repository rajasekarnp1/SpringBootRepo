package com.scb.bank.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;

    private String acctType;

    private double balance;

    private Date openingAcctDate;
    
    private Date lastUpdateAcctDate;
    
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "custId", nullable = false)
    private Customer customer;
    
    @OneToOne  
    private Bank bank;  
    
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

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

 

	 
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Account(long accountId, String acctType, double balance, Date openingAcctDate, Date lastUpdateAcctDate,
			Bank bank, Customer customer) {
		super();
		this.accountId = accountId;
		this.acctType = acctType;
		this.balance = balance;
		this.openingAcctDate = openingAcctDate;
		this.lastUpdateAcctDate = lastUpdateAcctDate;
		this.bank = bank;
		this.customer = customer;
	}

	public Account() {
		super();
		 
	}


	    
    
}
