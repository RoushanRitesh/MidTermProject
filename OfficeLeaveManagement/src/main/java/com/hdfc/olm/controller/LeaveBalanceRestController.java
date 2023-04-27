package com.hdfc.olm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.olm.dto.LeaveBalanceDTO;
import com.hdfc.olm.entity.LeaveBalance;
import com.hdfc.olm.service.ILeaveBalanceService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/olm/leaveBalance")
public class LeaveBalanceRestController {
	
	@Autowired
	private ILeaveBalanceService leaveBalanceService;
	
	@PostMapping("/add")
	public LeaveBalance addLeaveBalance(@RequestBody LeaveBalanceDTO leaveBalanceDTO) {
		return leaveBalanceService.addLeaveBalance(leaveBalanceDTO);
	}
	
	@PutMapping("/update")
	public LeaveBalance updateLeaveBalance(@RequestBody LeaveBalanceDTO leaveBalanceDTO) {
return leaveBalanceService.updateLeaveBalance(leaveBalanceDTO);
	}
	
	@GetMapping("/get/{leaveBalanceId}")
	public LeaveBalance getLeaveBalanceById(@PathVariable int leaveBalanceId) throws Exception{
		return leaveBalanceService.getLeaveBalanceById(leaveBalanceId);
	}
	
	@PutMapping("/balance/{leaveBalanceId}/{balanceId}")
	public LeaveBalance updateBalance(@PathVariable int leaveBalanceId,@PathVariable int balanceId) throws Exception{
		return leaveBalanceService.updateBalance(leaveBalanceId, balanceId);
	}
	
	@PutMapping("/absenteism/{employeeId}")
	public LeaveBalance updateEmployeeAbsenteeism(@PathVariable int employeeId) throws Exception{
		return leaveBalanceService.updateEmployeeAbsenteeism(employeeId);
	}
	
	@GetMapping("/getAll")
	public List<LeaveBalance> getAllLeaveBalances(){
		return leaveBalanceService.getAllLeaveBalances();
	}
}