package com.scb.bank.dto;

import org.springframework.stereotype.Component;

import com.scb.bank.entity.User;

@Component
public class EmployeeResponseDto {
	
	 private long employeeId;

	    private String name;

	    private Double salary;

	    private String email;

	    private String phone;
	    private User username;
		public long getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(long employeeId) {
			this.employeeId = employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public User getUsername() {
			return username;
		}
		public void setUsername(User username) {
			this.username = username;
		}
	

}
