package com.scb.bank.dto;

import java.io.Serializable;
import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.scb.bank.entity.Account;
 
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class CustomerRequestDto implements Serializable{
	private static final long serialVersionUID = 1L;
   private CustomerDto customerDto;
   @NotNull
   private Long bankId;
   private Set<AccountRequestDto> accountDTO;
	
	
	public CustomerDto getCustomerDto() {
		return customerDto;
	}
	public void setCustomerDto(CustomerDto customerDto) {
		this.customerDto = customerDto;
	}
	public Set<AccountRequestDto> getAccountDTO() {
		return accountDTO;
	}
	public void setAccountDTO(Set<AccountRequestDto> accountDTO) {
		this.accountDTO = accountDTO;
	}
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	
	
	
}
