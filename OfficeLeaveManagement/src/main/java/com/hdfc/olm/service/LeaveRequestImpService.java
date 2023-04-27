package com.hdfc.olm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.olm.dto.LeaveRequestDTO;
import com.hdfc.olm.entity.Employee;
import com.hdfc.olm.entity.LeaveRequest;
import com.hdfc.olm.exception.EmployeeNotFoundException;
import com.hdfc.olm.exception.LeaveRequestNotFoundException;
import com.hdfc.olm.repository.EmployeeRepository;
import com.hdfc.olm.repository.LeaveRequestRepository;
@Service
public class LeaveRequestImpService implements ILeaveRequestService {

	@Autowired
	private LeaveRequestRepository leaveRequestRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public LeaveRequest createLeave(LeaveRequestDTO leaveDto) {
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setLeaveRequestId(leaveDto.getLeaveRequestId());
		leaveRequest.setStartDate(leaveDto.getStartDate());
		leaveRequest.setEndDate(leaveDto.getEndDate());
		leaveRequest.setType(leaveDto.getType());
		leaveRequest.setStatus(leaveDto.getStatus());
		leaveRequest.setEmployee(leaveDto.getEmployee());
		leaveRequest.setComments(leaveDto.getComments());
		return leaveRequestRepository.save(leaveRequest);
	}

	@Override
	public LeaveRequest updateLeave(LeaveRequestDTO leaveDto) {
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setLeaveRequestId(leaveDto.getLeaveRequestId());
		leaveRequest.setStartDate(leaveDto.getStartDate());
		leaveRequest.setEndDate(leaveDto.getEndDate());
		leaveRequest.setType(leaveDto.getType());
		leaveRequest.setStatus(leaveDto.getStatus());
		leaveRequest.setEmployee(leaveDto.getEmployee());
		leaveRequest.setComments(leaveDto.getComments());
		return leaveRequestRepository.save(leaveRequest);
	}

	@Override
	public LeaveRequest getLeaveRequestById(int leaveRequestId) throws LeaveRequestNotFoundException {
		LeaveRequest leaveRequest=leaveRequestRepository.findById(leaveRequestId).orElseThrow(()->new LeaveRequestNotFoundException("leave request not found"));
		return leaveRequest;
	}

	@Override
	public List<LeaveRequest> getLeaveRequestByEmployeeId(int employeeId) throws Exception {
		Employee employee=employeeRepository.findById(employeeId).orElseThrow(()-> new EmployeeNotFoundException("employee not found"));
		List<LeaveRequest> leaveRequests=leaveRequestRepository.findByEmployee(employee);
		return leaveRequests;
	}

	@Override
	public List<LeaveRequest> getLeaveHistoryAll() {
		List<LeaveRequest> leaveRequests=leaveRequestRepository.findAll();
		return leaveRequests;
	}
	
	
}