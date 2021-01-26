package com.scb.bank.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.bank.dto.EmployeeResponseDto;
import com.scb.bank.dto.UserResponseDto;
import com.scb.bank.entity.Employee;
import com.scb.bank.service.EmployeeService;
import com.scb.bank.repository.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee Employee) {
		employeeRepository.save(Employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(Long EmployeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeResponseDto> getCustomEmployee(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(Long EmployeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeById(Employee Employee) {
		// TODO Auto-generated method stub
		
	}
	}
