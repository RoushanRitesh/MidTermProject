package com.hdfc.olm.service;

import java.util.List;

import com.hdfc.olm.dto.LeaveBalanceDTO;
import com.hdfc.olm.entity.LeaveBalance;

public interface ILeaveBalanceService {
	
	public LeaveBalance addLeaveBalance(LeaveBalanceDTO leaveBalanceDTO);
	
	public LeaveBalance updateLeaveBalance(LeaveBalanceDTO leaveBalanceDTO);
	
	public LeaveBalance getLeaveBalanceById(int leaveBalanceId) throws Exception;
	
	public LeaveBalance updateBalance(int leaveBalanceId, int balance) throws Exception;
	
	public LeaveBalance updateEmployeeAbsenteeism(int employeeId) throws Exception;
	
	public List<LeaveBalance> getAllLeaveBalances();
}