package com.annotx.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.annotx.bo.ChallanBo;
import com.annotx.bo.VehicleBo;
import com.annotx.dao.ChallanDao;
import com.annotx.dao.VehicleDao;
import com.annotx.form.ChallanForm;

@Service
public class ChallanManageService {
	@Autowired
	private ChallanDao challanDao;
	@Autowired
	private VehicleDao vehicleDao;

	@Transactional(readOnly = false)
	public int createChallan(ChallanForm challanForm) {
		ChallanBo challanBo = null;
		VehicleBo vehicleBo = null;
		int challanNo = 0;
		challanBo = new ChallanBo();
		challanBo.setChallanNo(0);
		challanBo.setChallanDate(challanForm.getChallanDate());
		challanBo.setFine(challanForm.getFine());
		challanBo.setViolationType(challanForm.getViolationType());

		challanNo = challanDao.saveChallan(challanBo);

		vehicleBo = new VehicleBo();
		vehicleBo.setVehicleNo(challanForm.getVehicleNo());
		vehicleBo.setChassisNo(challanForm.getChassisNo());
		vehicleBo.setPrice(challanForm.getVehiclePrice());
		vehicleBo.setRegistrationDate(challanForm.getRegistrationDate());
		vehicleBo.setModelNo(challanForm.getModelNo());
		vehicleBo.setChallanNo(challanNo);

		vehicleDao.saveVehicle(vehicleBo);
		return challanNo;
	}

	public void setChallanDao(ChallanDao challanDao) {
		this.challanDao = challanDao;
	}

	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
	}

}
