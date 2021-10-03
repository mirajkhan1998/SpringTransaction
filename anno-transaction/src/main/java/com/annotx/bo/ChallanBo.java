package com.annotx.bo;

import java.io.Serializable;
import java.util.Date;

public class ChallanBo implements Serializable {
	protected int challanNo;
	protected double fine;
	protected String violationType;
	protected Date challanDate;

	public int getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(int challanNo) {
		this.challanNo = challanNo;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public String getViolationType() {
		return violationType;
	}

	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}

	public Date getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(Date challanDate) {
		this.challanDate = challanDate;
	}

	@Override
	public String toString() {
		return "ChallanBo [challanNo=" + challanNo + ", fine=" + fine + ", violationType=" + violationType
				+ ", challanDate=" + challanDate + "]";
	}

}
