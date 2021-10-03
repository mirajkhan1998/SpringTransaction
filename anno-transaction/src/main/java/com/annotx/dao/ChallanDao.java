package com.annotx.dao;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.annotx.bo.ChallanBo;

@Repository
public class ChallanDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String INSERT_CHALLAN = "insert into challan(challan_dt,violation_type,fine)values(?,?,?)";

	public int saveChallan(ChallanBo challanBo) {
		int challanNo = 0;
		KeyHolder holder = null;
		holder = new GeneratedKeyHolder();
		jdbcTemplate.update((con) -> {
			Date utilDate = null;
			utilDate = challanBo.getChallanDate();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(INSERT_CHALLAN, new String[] { "challan_no" });
			pstmt.setDate(1, sqlDate);
			pstmt.setString(2, challanBo.getViolationType());
			pstmt.setDouble(3, challanBo.getFine());

			return pstmt;

		}, holder);

		challanNo = holder.getKey().intValue();

		return challanNo;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
