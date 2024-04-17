package com.spring.project.OutpatientAppointmentSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.project.OutpatientAppointmentSystem.DTO.AppointmentDTO;
import com.spring.project.OutpatientAppointmentSystem.DTO.AvailabilityDTO;
import com.spring.project.OutpatientAppointmentSystem.DTO.DoctorDTO;
import com.spring.project.OutpatientAppointmentSystem.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@GetMapping
	public ResponseEntity<List<DoctorDTO>> getAllDoctors() {
		List<DoctorDTO> doctors = doctorService.getAllDoctors();
		return ResponseEntity.ok(doctors);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable Long id) {
		DoctorDTO doctor = doctorService.getDoctorById(id);
		return ResponseEntity.ok(doctor);
	}

	@GetMapping("/{id}/availability")
	public ResponseEntity<List<AvailabilityDTO>> getDoctorAvailability(@PathVariable Long id,
			@RequestParam("date") String date) {
		List<AvailabilityDTO> availability = doctorService.getDoctorAvailability(id, date);
		return ResponseEntity.ok(availability);
	}

	@PostMapping("/{id}/appointments")
	public ResponseEntity<String> bookAppointment(@PathVariable Long id, @RequestBody AppointmentDTO appointmentDTO) {
		doctorService.bookAppointment(id, appointmentDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Appointment booked successfully.");
	}
}
