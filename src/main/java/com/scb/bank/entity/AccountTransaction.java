package com.scb.bank.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="AccountTransactionRepository")
public class AccountTransaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transActionID;

    private long fromAcct;

    private long toAcct;
    
    private double balance;

    private Date openingAcctDate;
    
    private Date lastUpdateAcctDate;
    
    private long custId;
    
    private long bankId;
    
    private String transactionType;

	public long getTransActionID() {
		return transActionID;
	}

	public void setTransActionID(long transActionID) {
		this.transActionID = transActionID;
	}

	public long getFromAcct() {
		return fromAcct;
	}

	public void setFromAcct(long fromAcct) {
		this.fromAcct = fromAcct;
	}

	public long getToAcct() {
		return toAcct;
	}

	public void setToAcct(long toAcct) {
		this.toAcct = toAcct;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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
