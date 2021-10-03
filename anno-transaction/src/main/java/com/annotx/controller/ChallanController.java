package com.annotx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.annotx.form.ChallanForm;
import com.annotx.service.ChallanManageService;

@Controller
public class ChallanController {
	@Autowired
	private ChallanManageService challanManageService;

	public int createChallan(ChallanForm challanForm) {
		int challanNo = 0;
		challanNo = challanManageService.createChallan(challanForm);
		return challanNo;
	}

	public void setChallanManageService(ChallanManageService challanManageService) {
		this.challanManageService = challanManageService;
	}

}
