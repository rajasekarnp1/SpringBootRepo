package com.scb.bank.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;



public class EmployeeLamdaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int employeeID;
	private String employeeName;
	private long salary;
	
	private LocalDate JoiningDate;
	private LocalDate lastWorkingDate;
	private LocalDateTime joiningDateTime;
	private boolean isManager;
	private int exp;
	private double band;
	
	
	public LocalDate getLastWorkingDate() {
		return lastWorkingDate;
	}
	public void setLastWorkingDate(LocalDate lastWorkingDate) {
		this.lastWorkingDate = lastWorkingDate;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getBand() {
		return band;
	}
	public void setBand(double band) {
		this.band = band;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return JoiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		JoiningDate = joiningDate;
	}
	public EmployeeLamdaDTO(int employeeID, String employeeName, long salary, LocalDate joiningDate,
			LocalDate lastWorkingDate) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
		JoiningDate = joiningDate;
		this.lastWorkingDate = lastWorkingDate;
	}
	public EmployeeLamdaDTO(int employeeID, String employeeName, long salary, LocalDate joiningDate, LocalDate lastWorkingDate,
			boolean isManager, int exp, double band, LocalDateTime  joiningDateTime) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
		JoiningDate = joiningDate;
		this.lastWorkingDate = lastWorkingDate;
		this.isManager = isManager;
		this.exp = exp;
		this.band = band;
		this.joiningDateTime=joiningDateTime;
	}
	@Override
	public String toString() {
		return "EmployeeLamdaDTO [employeeID=" + employeeID + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", JoiningDate=" + JoiningDate + ", lastWorkingDate=" + lastWorkingDate + ", isManager=" + isManager
				+ ", exp=" + exp + ", band=" + band + "]";
	}
	 
	
	

}
