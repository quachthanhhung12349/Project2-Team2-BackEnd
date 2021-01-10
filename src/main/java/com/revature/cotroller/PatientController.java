package com.revature.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.RequestTable;
import com.revature.service.IPatientService;

@RestController

public class PatientController {

	
	
	private IPatientService ips;
	
	@Autowired
	public PatientController(IPatientService ips) {
		this.ips = ips;
	}
	
	@GetMapping("/patient")
	public ResponseEntity<List<RequestTable>> getPatientRequestsById(){
		System.out.println("called patient servlet");
		return new ResponseEntity<List<RequestTable>>(ips.getRequestsByPatientId(1), HttpStatus.OK);
	}
}
