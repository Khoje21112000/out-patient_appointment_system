package com.spring.project.OutpatientAppointmentSystem.service;

import java.util.List;

import com.spring.project.OutpatientAppointmentSystem.DTO.AppointmentDTO;
import com.spring.project.OutpatientAppointmentSystem.DTO.AvailabilityDTO;
import com.spring.project.OutpatientAppointmentSystem.DTO.DoctorDTO;

public interface DoctorService {
	List<DoctorDTO> getAllDoctors();

	DoctorDTO getDoctorById(Long id);

	List<AvailabilityDTO> getDoctorAvailability(Long id, String date);

	void bookAppointment(Long id, AppointmentDTO appointmentDTO);
}
