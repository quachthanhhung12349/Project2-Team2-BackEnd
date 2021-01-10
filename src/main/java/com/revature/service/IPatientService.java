package com.revature.service;

import java.util.List;

import com.revature.pojo.RequestTable;

public interface IPatientService {
	
	public List<RequestTable> getRequestsByPatientId(int patientid);

}
