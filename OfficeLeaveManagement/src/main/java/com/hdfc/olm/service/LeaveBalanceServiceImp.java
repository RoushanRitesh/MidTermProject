package com.hdfc.olm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.olm.dto.LeaveBalanceDTO;
import com.hdfc.olm.entity.Employee;
import com.hdfc.olm.entity.LeaveBalance;
import com.hdfc.olm.entity.LeaveType;
import com.hdfc.olm.exception.EmployeeNotFoundException;
import com.hdfc.olm.exception.LeaveBalanceNotFoundException;
import com.hdfc.olm.repository.EmployeeRepository;
import com.hdfc.olm.repository.LeaveBalanceRepository;

@Service
public class LeaveBalanceServiceImp implements ILeaveBalanceService {
	
	@Autowired
	private LeaveBalanceRepository leaveBalanceRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public LeaveBalance addLeaveBalance(LeaveBalanceDTO leaveBalanceDto) {
		LeaveBalance leaveBalance=new LeaveBalance();
		leaveBalance.setLeaveBalanceId(leaveBalanceDto.getLeaveBalanceId());
		leaveBalance.setEmployee(leaveBalanceDto.getEmployee());
		leaveBalance.setBalance(leaveBalanceDto.getBalance());
		leaveBalance.setType(leaveBalanceDto.getType());
		
		return leaveBalanceRepository.save(leaveBalance);
	}

	@Override
	public LeaveBalance updateLeaveBalance(LeaveBalanceDTO leaveBalanceDto) {
		LeaveBalance leaveBalance=new LeaveBalance();
		leaveBalance.setLeaveBalanceId(leaveBalanceDto.getLeaveBalanceId());
		leaveBalance.setEmployee(leaveBalanceDto.getEmployee());
		leaveBalance.setBalance(leaveBalanceDto.getBalance());
		leaveBalance.setType(leaveBalanceDto.getType());
		
		return leaveBalanceRepository.save(leaveBalance);
	}

	@Override
	public LeaveBalance getLeaveBalanceById(int leaveBalanceId) throws Exception {
		LeaveBalance leaveBalance=leaveBalanceRepository.findById(leaveBalanceId).orElseThrow(()-> new LeaveBalanceNotFoundException("leave balance not found"));
		return leaveBalance;
	}

	@Override
	public LeaveBalance updateBalance(int leaveBalanceId, int balance) throws Exception {
		LeaveBalance leaveBalance=leaveBalanceRepository.findById(leaveBalanceId).orElseThrow(()-> new LeaveBalanceNotFoundException("leave balance not found"));
		leaveBalance.setBalance(balance);
		return leaveBalanceRepository.save(leaveBalance);
	}

	@Override
	public LeaveBalance updateEmployeeAbsenteeism(int employeeId) throws Exception {
		Employee employee=employeeRepository.findById(employeeId).orElseThrow(()-> new EmployeeNotFoundException("employee not found"));
		LeaveBalance leaveBalance=leaveBalanceRepository.findByLeaveBalanceByEmployeeAndLeaveType(employee, LeaveType.Casual);
		return updateBalance(leaveBalance.getLeaveBalanceId(),leaveBalance.getBalance()-1);
	}
	
	@Override
	public List<LeaveBalance> getAllLeaveBalances() {
		return leaveBalanceRepository.findAll();
	}

}
