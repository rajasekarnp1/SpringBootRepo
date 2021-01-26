package com.scb.bank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

 
@Entity
@Table(name = "Employee")

public class Employee implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;

    private String name;

    private Double salary;

    private String email;

    private String phone;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User username;

    public Employee() {
    }

    public Employee(long id, String name, Double salary, String email, String phone, User username) {
        this.employeeId = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
        this.username = username;
    }

   

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
