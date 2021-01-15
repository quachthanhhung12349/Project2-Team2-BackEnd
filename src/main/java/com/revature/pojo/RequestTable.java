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

    @Column(name = "timestamp")
    private Date timeStamp;

    @Column(name ="isresponsed" )
    private boolean isresponsed;
    
    @Column(name ="prescription" )
    private String prescription;
    
    @Column(name ="doctorresponse" )
    private String doctorresponse;
    
    @Column(name ="hasappointment" )
    private boolean hasappointment;

    @ManyToOne
    @JoinColumn(name = "patientid")
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name ="doctorid")
    private Doctor doctorid;

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

	public boolean isIsresponsed() {
		return isresponsed;
	}

	public void setIsresponsed(boolean isresponsed) {
		this.isresponsed = isresponsed;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getDoctorresponse() {
		return doctorresponse;
	}

	public void setDoctorresponse(String doctorresponse) {
		this.doctorresponse = doctorresponse;
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

	public Doctor getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(Doctor doctorid) {
		this.doctorid = doctorid;
	}

	@Override
	public String toString() {
		return "RequestTable [requestId=" + requestId + ", problem=" + problem + ", timeStamp=" + timeStamp
				+ ", isresponsed=" + isresponsed + ", prescription=" + prescription + ", doctorresponse="
				+ doctorresponse + ", hasappointment=" + hasappointment + ", patientId=" + patientId + ", doctorid="
				+ doctorid + "]";
	}


}


