package com.revature.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.pojo.RequestTable;

public interface IRequestDao extends JpaRepository<RequestTable, Integer>{
	
	@Query(value = "select r from RequestTable r left join Patient p on r.patientId = p.patientId  where p.patientId = ?1")
	public List<RequestTable> getRequestsByPatientId(int patient_id);

}
