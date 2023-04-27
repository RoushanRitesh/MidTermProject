package com.hdfc.olm.dto;



import com.hdfc.olm.entity.Employee;



import com.hdfc.olm.entity.LeaveType;

public class LeaveBalanceDTO {
	private int leaveBalanceId;
	private Employee employee;
	private LeaveType type;
	private int balance;
	public LeaveBalanceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveBalanceDTO(int leaveBalanceId, Employee employee, LeaveType type, int balance) {
		super();
		this.leaveBalanceId = leaveBalanceId;
		this.employee = employee;
		this.type = type;
		this.balance = balance;
	}
	public int getLeaveBalanceId() {
		return leaveBalanceId;
	}
	public void setLeaveBalanceId(int leaveBalanceId) {
		this.leaveBalanceId = leaveBalanceId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public LeaveType getType() {
		return type;
	}
	public void setType(LeaveType type) {
		this.type = type;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}