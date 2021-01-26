package com.scb.bank.serviceImpl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.scb.bank.dto.EmployeeLamdaDTO;
import com.scb.bank.service.LamdaEmployeeService;

public class LamdaTest implements LamdaEmployeeService{
	
	public void lamdaOperation() {
		System.out.println(" -----");
		IntStream.range(1, 100).forEach(System.out::println);
		List<EmployeeLamdaDTO> empList =constructEmp();
		List<EmployeeLamdaDTO> empList1 =constructEmp();
		List<EmployeeLamdaDTO> managerList =constructEmp();
		List<EmployeeLamdaDTO> employeeList =constructEmp();
		List<EmployeeLamdaDTO> empExpList =constructEmp();
		System.out.println("top 10 values");
		empList1= empList.stream().sorted((e1,e2) -> e2.getJoiningDate().compareTo(e1.getJoiningDate())).collect(Collectors.toList()).subList(1, 10);
		empList1.forEach(e->System.out.println(e));
		System.out.println(" -----");
		System.out.println("DNACandidate for Employees having experience >7 yrs");
		empExpList = empList.stream().filter(e->e.getExp()>7).collect(Collectors.toList());
		System.out.println("Manager list ");
		empExpList.forEach(e->System.out.println(e));
		managerList = empList.stream().filter(e->e.isManager()).collect(Collectors.toList());
		managerList.forEach(e->System.out.println(e));

		
	}
	
	public List<EmployeeLamdaDTO> constructEmp() {
		List<EmployeeLamdaDTO> employeeList = new ArrayList<>();
		LocalDate date = LocalDate.now();  
		LocalDateTime localDateJoiingTIme = LocalDateTime.now();  
		EmployeeLamdaDTO emp = new EmployeeLamdaDTO(1, "rajasekar", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(12).minusMonths(36));
		EmployeeLamdaDTO emp1 = new EmployeeLamdaDTO(2, "sathish", 10000, date.minusDays(1000), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(12).minusMonths(11));
		EmployeeLamdaDTO emp2 = new EmployeeLamdaDTO(3, "baskar", 10000, date.minusDays(1000), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(10).minusMonths(11));
		EmployeeLamdaDTO emp3 = new EmployeeLamdaDTO(4, "satheeh", 10000, date.minusMonths(4), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(15).minusMonths(11));
		EmployeeLamdaDTO emp4 = new EmployeeLamdaDTO(5, "kiran", 10000, date.minusMonths(34), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(18).minusMonths(5));
		EmployeeLamdaDTO emp5 = new EmployeeLamdaDTO(6, "kurijiji", 10000, date.minusMonths(54), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(1).minusSeconds(30));
		EmployeeLamdaDTO emp6 = new EmployeeLamdaDTO(7, "booby", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(5).minusYears(10));
		EmployeeLamdaDTO emp7 = new EmployeeLamdaDTO(8, "venkat", 10000, LocalDate.now(), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(3).minusDays(300));
		EmployeeLamdaDTO emp8 = new EmployeeLamdaDTO(9, "kalai", 10000, LocalDate.now(), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(2).minusYears(5));
		
		
		EmployeeLamdaDTO emp9 = new EmployeeLamdaDTO(16, "madha", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(12).minusDays(500));
		EmployeeLamdaDTO emp10 = new EmployeeLamdaDTO(16, "srini", 10000, date.minusMonths(20), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(52).minusMonths(55));
		EmployeeLamdaDTO emp11 = new EmployeeLamdaDTO(15, "sathya", 10000, date.minusYears(4), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(7).minusMinutes(66));
		EmployeeLamdaDTO emp12 = new EmployeeLamdaDTO(14, "mono", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(9).minusHours(37));
		EmployeeLamdaDTO emp13 = new EmployeeLamdaDTO(13, "mohan", 10000, date.minusYears(8), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(9).minusYears(5));
		EmployeeLamdaDTO emp14 = new EmployeeLamdaDTO(12, "viki", 10000, date.minusMonths(24), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(8).minusMonths(22));
		EmployeeLamdaDTO emp15 = new EmployeeLamdaDTO(11, "vimalan", 10000,date.minusYears(10), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(7).minusYears(10));
		EmployeeLamdaDTO emp16 = new EmployeeLamdaDTO(10, "vikram", 10000, date.minusYears(3), LocalDate.now(),false ,10, 3.1,localDateJoiingTIme.minusHours(7).minusYears(12));
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);
		employeeList.add(emp9);
		employeeList.add(emp10);
		
		employeeList.add(emp11);
		employeeList.add(emp12);
		employeeList.add(emp13);
		employeeList.add(emp14);
		employeeList.add(emp15);
		employeeList.add(emp16);
		
		return employeeList;
	}
	


}
