package com.hdfc.olm.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LeaveBalance")
public class LeaveBalance {
	@Id
	private int leaveBalanceId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id",referencedColumnName="employeeId")
	private Employee employee;
	@Enumerated(EnumType.STRING)
	private LeaveType type;
	private int balance;
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
	public LeaveBalance(int leaveBalanceId, Employee employee, LeaveType type, int balance) {
		super();
		this.leaveBalanceId = leaveBalanceId;
		this.employee = employee;
		this.type = type;
		this.balance = balance;
	}
	public LeaveBalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
