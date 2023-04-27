package com.hdfc.olm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.olm.dto.EmployeeDTO;
import com.hdfc.olm.entity.Employee;
import com.hdfc.olm.service.IEmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/olm/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService empService;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody EmployeeDTO empDto) {
		return empService.addEmployee(empDto);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody EmployeeDTO empDto) {
		return empService.updateEmployee(empDto);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();
	}
}