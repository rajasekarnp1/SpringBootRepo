package com.scb.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.scb.bank.dto.EmployeeResponseDto;
import com.scb.bank.entity.Employee;

@Service
public interface EmployeeService {
	
	public void saveEmployee(Employee Employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(Long EmployeeId);
	
	public List<Employee> getEmployeesByFirstName(String firstName);
	
	public List<Employee> getEmployeesByName(String firstName, String lastName);
	
	public List<EmployeeResponseDto> getCustomEmployee(String firstName);
	
	void deleteEmployeeById(Long EmployeeId);
	
	void updateEmployeeById(Employee Employee);


}
