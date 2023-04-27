package com.hdfc.olm.dto;

import java.time.LocalDate;

import com.hdfc.olm.entity.Employee;
import com.hdfc.olm.entity.LeaveStatusType;
import com.hdfc.olm.entity.LeaveType;

public class LeaveRequestDTO {
	private int leaveRequestId;
	private Employee employee;
	private LocalDate startDate;
	private LocalDate endDate;
	private String comments;
	private LeaveType type;
	private  LeaveStatusType status;
	public int getLeaveRequestId() {
		return leaveRequestId;
	}
	public void setLeaveRequestId(int leaveRequestId) {
		this.leaveRequestId = leaveRequestId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LeaveType getType() {
		return type;
	}
	public void setType(LeaveType type) {
		this.type = type;
	}
	public LeaveStatusType getStatus() {
		return status;
	}
	public void setStatus(LeaveStatusType status) {
		this.status = status;
	}
	public LeaveRequestDTO(int leaveRequestId, Employee employee, LocalDate startDate, LocalDate endDate,
			String comments, LeaveType type, LeaveStatusType status) {
		super();
		this.leaveRequestId = leaveRequestId;
		this.employee = employee;
		this.startDate = startDate;
		this.endDate = endDate;
		this.comments = comments;
		this.type = type;
		this.status = status;
	}
	public LeaveRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}