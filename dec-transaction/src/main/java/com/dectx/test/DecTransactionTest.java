package com.dectx.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dectx.controller.AppointmentController;
import com.dectx.form.AppointmentForm;

public class DecTransactionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dectx/common/application-context.xml");
		AppointmentForm form = new AppointmentForm();
		form.setPatientName("Joe");
		form.setFees(1000);
		form.setAppointmentDate(new Date());
		form.setGender("male");
		form.setDisease("covid19");
		form.setAge(25);
		AppointmentController controller = context.getBean("appointmentController", AppointmentController.class);
		controller.newAppointment(form);
		

	}

}
