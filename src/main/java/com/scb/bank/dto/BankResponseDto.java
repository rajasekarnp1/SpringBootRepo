package com.scb.bank.dto;


import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Component
@Getter
@Setter
public class BankResponseDto {
	
	 private String branch;

	    private String IFSC;

	    private String bankName;

	    private Long phone;

	    private String email;

	    private String address;

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getIFSC() {
			return IFSC;
		}

		public void setIFSC(String iFSC) {
			IFSC = iFSC;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	

}
