package com.dectx.bo;

import java.io.Serializable;
import java.util.Date;

public class AppoitmentBo implements Serializable {

	protected int appointmentNo;
	protected String doctorName;
	protected Date appointmentDate;
	protected double fees;
	protected String patientName;
	protected int patientNo;

	public int getAppointmentNo() {
		return appointmentNo;
	}

	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}

	@Override
	public String toString() {
		return "AppoitmentBo [appointmentNo=" + appointmentNo + ", doctorName=" + doctorName + ", appointmentDate="
				+ appointmentDate + ", fees=" + fees + ", patientName=" + patientName + ", patientNo=" + patientNo
				+ "]";
	}

}
