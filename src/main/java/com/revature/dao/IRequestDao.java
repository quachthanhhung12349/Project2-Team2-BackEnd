package com.revature.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.pojo.RequestTable;

public interface IRequestDao extends JpaRepository<RequestTable, Integer>{
	
	@Query(value = "select * from requesttable where patientid = 1", nativeQuery= true)
	public List<RequestTable> getRequestsByPatientId(int patientid);

}
