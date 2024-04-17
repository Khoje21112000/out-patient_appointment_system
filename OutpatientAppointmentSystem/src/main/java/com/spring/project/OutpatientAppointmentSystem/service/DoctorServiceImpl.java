package com.spring.project.OutpatientAppointmentSystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.OutpatientAppointmentSystem.Component.AppointmentMapper;
import com.spring.project.OutpatientAppointmentSystem.Component.DoctorMapper;
import com.spring.project.OutpatientAppointmentSystem.DTO.AppointmentDTO;
import com.spring.project.OutpatientAppointmentSystem.DTO.AvailabilityDTO;
import com.spring.project.OutpatientAppointmentSystem.DTO.DoctorDTO;
import com.spring.project.OutpatientAppointmentSystem.ExceptionHandling.ResourceNotFoundException;
import com.spring.project.OutpatientAppointmentSystem.model.Appointment;
import com.spring.project.OutpatientAppointmentSystem.model.Doctor;
import com.spring.project.OutpatientAppointmentSystem.repo.AppointmentRepository;
import com.spring.project.OutpatientAppointmentSystem.repo.DoctorRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<DoctorDTO> getAllDoctors() {
        return doctorRepository.findAll().stream()
                .map(DoctorMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorDTO getDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
        return DoctorMapper.toDTO(doctor);
    }

    @Override
    public List<AvailabilityDTO> getDoctorAvailability(Long id, String dateStr) {
        LocalDate date = LocalDate.parse(dateStr);
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
        // Implement logic to Scheck doctor's availability on the given date
        // You may need to check existing appointments for the doctor on that date
        // and compare with the doctor's consultation capacity
        // This is just a placeholder, actual implementation depends on your business logic
        // For simplicity, let's return a dummy availability list
        return List.of(new AvailabilityDTO("Morning", true), new AvailabilityDTO("Afternoon", false));
    }

    @Override
    public void bookAppointment(Long id, AppointmentDTO appointmentDTO) {
        // You need to implement logic to book an appointment for the given doctor
        // This involves creating a new appointment entity and saving it to the database
        // You may need to check doctor's availability and other constraints
        // This is just a placeholder, actual implementation depends on your business logic
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + id));
        Appointment appointment = AppointmentMapper.toEntity(appointmentDTO);
        appointment.setDoctor(doctor);
        appointmentRepository.save(appointment);
    }

	
}
