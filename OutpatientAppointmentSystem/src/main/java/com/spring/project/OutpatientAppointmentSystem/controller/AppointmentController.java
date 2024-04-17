package com.spring.project.OutpatientAppointmentSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.project.OutpatientAppointmentSystem.DTO.AppointmentDTO;
import com.spring.project.OutpatientAppointmentSystem.service.AppointmentService;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	@GetMapping
	public ResponseEntity<List<AppointmentDTO>> getAllAppointments() {
		List<AppointmentDTO> appointments = appointmentService.getAllAppointments();
		return ResponseEntity.ok(appointments);
	}

	
}
