package com.annotx.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotx.config.RootJavaConfig;
import com.annotx.controller.ChallanController;
import com.annotx.form.ChallanForm;

public class AnnoTranTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootJavaConfig.class);
		ChallanForm form = new ChallanForm();
		form.setChallanDate(new Date());
		form.setChassisNo("ch156475");
		form.setFine(1100);
		form.setModelNo("m2476");
		form.setRegistrationDate(new Date());
		form.setVehicleNo(4);
		form.setVehiclePrice(1500000);
		form.setViolationType("Drunk & Derive");
		ChallanController controller = context.getBean("challanController", ChallanController.class);
		int challanNo = controller.createChallan(form);
		System.out.println("challanNo:" + challanNo);
	}

}
