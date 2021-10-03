package com.dectx.controller;

import com.dectx.form.AppointmentForm;
import com.dectx.service.ManageAppointmentService;

public class AppointmentController {
	private ManageAppointmentService manageAppointmentService;

	public void setManageAppointmentService(ManageAppointmentService manageAppointmentService) {
		this.manageAppointmentService = manageAppointmentService;
	}

	public void newAppointment(AppointmentForm appointmentForm) {
		manageAppointmentService.newAppointment(appointmentForm);
		System.out.println("DataSaveSuccessFully");
	}

}
