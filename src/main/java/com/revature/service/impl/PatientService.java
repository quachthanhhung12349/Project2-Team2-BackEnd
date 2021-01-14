package com.revature.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.IRequestDao;
import com.revature.pojo.RequestTable;
import com.revature.service.IPatientService;

@Service
public class PatientService implements IPatientService{

	
	private IRequestDao irdao;
	
	@Autowired
	public PatientService(IRequestDao irdao) {
		this.irdao = irdao;
	}

	
	@Override
	public List<RequestTable> getRequestsByPatientId(int patientid) {
		
		return irdao.getRequestsByPatientId(patientid);
	}

}
