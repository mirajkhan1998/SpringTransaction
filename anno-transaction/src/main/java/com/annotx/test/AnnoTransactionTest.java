package com.annotx.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotx.controller.ChallanController;
import com.annotx.form.ChallanForm;

public class AnnoTransactionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/annotx/common/root-application-context.xml");
		ChallanForm form = new ChallanForm();
		form.setChallanDate(new Date());
		form.setChassisNo("ch12222");
		form.setFine(1500);
		form.setModelNo("m155655");
		form.setRegistrationDate(new Date());
		form.setVehicleNo(2);
		form.setVehiclePrice(1000000);
		form.setViolationType("helmet missed");
		ChallanController controller = context.getBean("challanController", ChallanController.class);
		int challanNo = controller.createChallan(form);
		System.out.println("challanNo:" + challanNo);

	}

}
