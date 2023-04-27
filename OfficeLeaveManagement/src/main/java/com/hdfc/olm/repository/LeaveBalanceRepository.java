package com.hdfc.olm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hdfc.olm.entity.Employee;
import com.hdfc.olm.entity.LeaveBalance;
import com.hdfc.olm.entity.LeaveType;
@Repository
public interface LeaveBalanceRepository extends JpaRepository<LeaveBalance, Integer> {
	
	@Query("select l from LeaveBalance l where l.employee=?1 and l.type=?2")
	public LeaveBalance findByLeaveBalanceByEmployeeAndLeaveType(Employee employee,LeaveType leaveType);
}