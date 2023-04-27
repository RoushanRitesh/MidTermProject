package com.hdfc.olm.service;

import java.util.List;

import com.hdfc.olm.dto.EmployeeDTO;
import com.hdfc.olm.entity.Employee;

public interface IEmployeeService {
	
	public Employee addEmployee(EmployeeDTO empDto) ;
	
	public Employee updateEmployee(EmployeeDTO empDto) ;
	
	public List<Employee> getAllEmployees();
}
