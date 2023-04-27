package com.hdfc.olm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hdfc.olm.entity.Employee;
import com.hdfc.olm.entity.LeaveRequest;
@Repository
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {
	
	@Query("select l from LeaveRequest l where l.employee=?1")
	public List<LeaveRequest> findByEmployee(Employee employee);
}
