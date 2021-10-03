package com.annotx.bo;

import java.util.Date;

public class VehicleBo {
	protected int vehicleNo;
	protected double price;
	protected String modelNo;
	protected Date registrationDate;
	protected String chassisNo;
	protected int challanNo;

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public int getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(int challanNo) {
		this.challanNo = challanNo;
	}

	@Override
	public String toString() {
		return "VehicleBo [vehicleNo=" + vehicleNo + ", price=" + price + ", modelNo=" + modelNo + ", registrationDate="
				+ registrationDate + ", chassisNo=" + chassisNo + ", challanNo=" + challanNo + "]";
	}

}
