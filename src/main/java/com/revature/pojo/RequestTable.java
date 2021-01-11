/**
 * @program: project2
 * @description: entity for request
 * @author: Luke
 * @create: 2021-01-06 14:45
 **/


package com.revature.pojo;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "requesttable")
public class RequestTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "requestid")
    private int requestId;

    @Column(name = "problem")
    private String problem;

    @Column(name = "timecreated")
    private Date timeStamp;

    @Column(name ="isresponded" )
    private boolean isResponsed;
    
    @Column(name = "doctorresponse")
    private String doctorResponse;
    
    @Column(name = "prescription")
    private String prescription;
    
    @Column(name = "timeresponded")
    private Date timeResponded;
    
    @Column(name ="hasappointment" )
    private boolean hasappointment;
    
    @ManyToOne
    @JoinColumn(name = "patientid")
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name ="doctorid")
    private Doctor doctorId;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean isResponsed() {
		return isResponsed;
	}

	public void setResponsed(boolean isResponsed) {
		this.isResponsed = isResponsed;
	}

	public String getDoctorResponse() {
		return doctorResponse;
	}

	public void setDoctorResponse(String doctorResponse) {
		this.doctorResponse = doctorResponse;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public Date getTimeResponded() {
		return timeResponded;
	}

	public void setTimeResponded(Date timeResponded) {
		this.timeResponded = timeResponded;
	}

	public boolean isHasappointment() {
		return hasappointment;
	}

	public void setHasappointment(boolean hasappointment) {
		this.hasappointment = hasappointment;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}

	@Override
	public String toString() {
		return "RequestTable [requestId=" + requestId + ", problem=" + problem + ", timeStamp=" + timeStamp
				+ ", isResponsed=" + isResponsed + ", doctorResponse=" + doctorResponse + ", prescription="
				+ prescription + ", timeResponded=" + timeResponded + ", hasappointment=" + hasappointment
				+ ", patientId=" + patientId + ", doctorId=" + doctorId + "]";
	}
    
   
}


