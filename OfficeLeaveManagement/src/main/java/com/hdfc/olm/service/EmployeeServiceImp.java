package com.hdfc.olm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.olm.dto.EmployeeDTO;
import com.hdfc.olm.entity.Employee;
import com.hdfc.olm.repository.EmployeeRepository;
@Service
public class EmployeeServiceImp implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(EmployeeDTO empDto) {
		Employee employee = new Employee();
		employee.setEmployeeId(empDto.getEmployeeId());
		employee.setName(empDto.getName());
		employee.setEmail(empDto.getEmail());
		employee.setPhoneNumber(empDto.getPhoneNumber());
		employee.setDepartment(empDto.getDepartment());
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(EmployeeDTO empDto) {
		Employee employee = new Employee();
		employee.setEmployeeId(empDto.getEmployeeId());
		employee.setName(empDto.getName());
		employee.setEmail(empDto.getEmail());
		employee.setPhoneNumber(empDto.getPhoneNumber());
		employee.setDepartment(empDto.getDepartment());
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=employeeRepository.findAll();
		return employees;
	}

}
