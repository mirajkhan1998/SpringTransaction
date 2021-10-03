package com.annotx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.annotx.bo.VehicleBo;

@Repository
public class VehicleDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String INSERT_VEHICLE = "insert into vehicle(vehicle_no,model_no,price,chassis_no,registration_dt,challan_no)values(?,?,?,?,?,?)";

	public void saveVehicle(VehicleBo vehicleBo) {
		if (vehicleBo.getVehicleNo() == 3) {
			throw new IllegalArgumentException("invalid vehicle_no");
		}
		jdbcTemplate.update(INSERT_VEHICLE, vehicleBo.getVehicleNo(), vehicleBo.getModelNo(), vehicleBo.getPrice(),
				vehicleBo.getChassisNo(), vehicleBo.getRegistrationDate(), vehicleBo.getChallanNo());

	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
