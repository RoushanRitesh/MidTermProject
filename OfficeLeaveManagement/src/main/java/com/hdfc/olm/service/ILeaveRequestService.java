package com.hdfc.olm.service;

import java.util.List;





import com.hdfc.olm.dto.LeaveRequestDTO;
import com.hdfc.olm.entity.LeaveRequest;

public interface ILeaveRequestService {
 
	public LeaveRequest createLeave(LeaveRequestDTO leaveDto); 
	
	public LeaveRequest updateLeave(LeaveRequestDTO leaveDto);
	
	public LeaveRequest getLeaveRequestById(int leaveRequestId) throws Exception;
	
	public List<LeaveRequest>getLeaveRequestByEmployeeId(int employeeId) throws Exception;
	 
	public List<LeaveRequest>getLeaveHistoryAll();
}

