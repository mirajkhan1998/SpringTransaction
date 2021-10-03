package com.dectx.service;

import com.dectx.bo.AppoitmentBo;
import com.dectx.bo.PatientBo;
import com.dectx.dao.AppointmentDao;
import com.dectx.dao.PatientDao;
import com.dectx.form.AppointmentForm;

public class ManageAppointmentService {
	private PatientDao patientDao;
	private AppointmentDao appointmentDao;

	public void newAppointment(AppointmentForm appointmentForm) {
		PatientBo patientBo = null;
		AppoitmentBo appoitmentBo = null;

		patientBo = new PatientBo();
		patientBo.setPatientNo(0);
		patientBo.setPatienName(appointmentForm.getPatientName());
		patientBo.setAge(appointmentForm.getAge());
		patientBo.setContactNo("9546837806");
		patientBo.setDisease(appointmentForm.getDisease());
		patientBo.setGender(appointmentForm.getGender());
		int patientNo = patientDao.savePatient(patientBo);
		System.out.println("Patient save successfully");

		appoitmentBo = new AppoitmentBo();
		appoitmentBo.setAppointmentNo(3);
		appoitmentBo.setPatientName(appointmentForm.getPatientName());
		appoitmentBo.setDoctorName("Rick");
		appoitmentBo.setFees(appointmentForm.getFees());
		appoitmentBo.setAppointmentDate(appointmentForm.getAppointmentDate());
		appoitmentBo.setPatientNo(patientNo);
		appointmentDao.saveAppointment(appoitmentBo);

	}

	public void setPatientDao(PatientDao patientDao) {
		this.patientDao = patientDao;
	}

	public void setAppointmentDao(AppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
	}

}
