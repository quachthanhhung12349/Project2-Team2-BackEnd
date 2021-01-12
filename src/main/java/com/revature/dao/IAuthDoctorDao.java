package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.pojo.Doctor;

public interface IAuthDoctorDao extends JpaRepository<Doctor, Integer>{

	
	@Query(value = "select d from Doctor d where d.username=?1 and d.password=?2")
	Doctor findDoctorbyUsername(String username, String password);
}
