package com.scb.bank.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class BankRequestDto {
	
	
	private long bankId;
	@NotNull
	@Size(min = 4, max = 20)
    private String branch;

    private String IFSC;
    @NotNull
    @Size(min = 4, max = 20,message="Bank name must be greate 20 char and less than 20")
    private String bankName;
    @Min(value = 1000000, message = "phone values can't bigger than 999999 less tan 1000000")
    @Max(999999999)
    //@NotEmpty
    private Long phone;

    private String email;
    @NotNull
    private String address;

	
	  public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

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
