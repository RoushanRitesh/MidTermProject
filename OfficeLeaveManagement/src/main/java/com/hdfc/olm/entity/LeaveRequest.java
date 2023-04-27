package com.hdfc.olm.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="LeaveRequests")

public class LeaveRequest {
	@Id
	private int leaveRequestId;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="employee_id",referencedColumnName="employeeId")
	private Employee employee;
	private LocalDate startDate;
	private LocalDate endDate;
	private String comments;
	@Enumerated(EnumType.STRING)
	private LeaveType type;
	@Enumerated(EnumType.STRING)
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
	public LeaveRequest(int leaveRequestId, Employee employee, LocalDate startDate, LocalDate endDate, String comments,
			com.hdfc.olm.entity.LeaveType type, LeaveStatusType status) {
		super();
		this.leaveRequestId = leaveRequestId;
		this.employee = employee;
		this.startDate = startDate;
		this.endDate = endDate;
		this.comments = comments;
		this.type = type;
		this.status = status;
	}
	public LeaveRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}