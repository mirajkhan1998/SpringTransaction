package com.dectx.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dectx.bo.AppoitmentBo;

public class AppointmentDao {
	private final String SQL_INSERT_APPOINTMENT = "insert into appointment(appointment_no,patient_nm,doctor_nm,fees,appointment_dt,patient_no)values(?,?,?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public void saveAppointment(AppoitmentBo appoitmentBo) {
		if (appoitmentBo.getDoctorName().equals("Narayan")) {
             System.out.println("exception");
			throw new IllegalArgumentException("doctor name is wrong");
		}
			jdbcTemplate.update(SQL_INSERT_APPOINTMENT, appoitmentBo.getAppointmentNo(), appoitmentBo.getPatientName(),
					appoitmentBo.getDoctorName(), appoitmentBo.getFees(), appoitmentBo.getAppointmentDate(),
					appoitmentBo.getPatientNo());

	

	}

	public AppointmentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
