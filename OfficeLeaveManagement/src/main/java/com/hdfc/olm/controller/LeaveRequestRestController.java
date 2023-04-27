package com.hdfc.olm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.olm.dto.LeaveRequestDTO;
import com.hdfc.olm.entity.LeaveRequest;
import com.hdfc.olm.service.ILeaveRequestService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/olm/leaveRequest")
public class LeaveRequestRestController {
	
	@Autowired
	private ILeaveRequestService leaveService;
	
	@PostMapping("/createLeave")
	public LeaveRequest createLeave(@RequestBody LeaveRequestDTO leaveDto) {
		return leaveService.createLeave(leaveDto);
	}
	
	@PutMapping("/updateLeave")
	public LeaveRequest updateLeave(@RequestBody LeaveRequestDTO leaveDto) {
		return leaveService.updateLeave(leaveDto);
	}
	
	@GetMapping("/get/{leaveRequestId}")
	public LeaveRequest getLeaveRequestById(@PathVariable int leaveRequestId) throws Exception{
		return leaveService.getLeaveRequestById(leaveRequestId);
	}
	
	@GetMapping("/get/{employeeId}")
	public List<LeaveRequest>getLeaveRequestByEmployeeId(@PathVariable int employeeId) throws Exception{
		return leaveService.getLeaveRequestByEmployeeId(employeeId);
	}
	
	@GetMapping("/getAll")
	public List<LeaveRequest>getLeaveHistoryAll(){
		return leaveService.getLeaveHistoryAll();
	}

}