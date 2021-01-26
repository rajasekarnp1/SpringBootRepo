package com.scb.bank.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class CustomerDto implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long custId;
	 @NotNull
	    @Size(min = 2, max = 10 , message="must be equal or greater than 2")
	    private String name;
	    @NotNull
	    @Min(value=100, message="must be equal or greater than 99999")
	    private Long salary;
	    @NotNull
	    @Size(min=5, max=10)
	    private String email;
	    @NotNull
	    @Size(min =5, max = 10)
	    private Long phone;
	    
         
	    public void setPhone(Long phone) {
			this.phone = phone;
		}

		public long getCustId() {
			return custId;
		}

		public void setCustId(long custId) {
			this.custId = custId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getSalary() {
			return salary;
		}

		public void setSalary(Long salary) {
			this.salary = salary;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getPhone() {
			return phone;
		}



}
