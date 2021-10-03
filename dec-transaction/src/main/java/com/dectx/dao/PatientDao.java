package com.dectx.dao;

import java.sql.PreparedStatement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.dectx.bo.PatientBo;

public class PatientDao {
	private final String SQL_INSERT_PATIENT = "insert into patient(patient_nm,age,gender,disease,contact_no)values(?,?,?,?,?) ";
	private JdbcTemplate jdbcTemplate;

	public PatientDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int savePatient(PatientBo patientBo) {
		KeyHolder kg = null;
		int patientNo = 0;

		kg = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(SQL_INSERT_PATIENT, new String[] { "patient_no" });
			pstmt.setString(1, patientBo.getPatienName());
			pstmt.setInt(2, patientBo.getAge());
			pstmt.setString(3, patientBo.getGender());
			pstmt.setString(4, patientBo.getDisease());
			pstmt.setString(5, patientBo.getContactNo());

			return pstmt;
		}, kg);
		patientNo = kg.getKey().intValue();
		return patientNo;
	}

}
