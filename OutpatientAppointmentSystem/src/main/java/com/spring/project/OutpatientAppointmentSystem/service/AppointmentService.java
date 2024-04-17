package com.spring.project.OutpatientAppointmentSystem.service;
import java.util.List;

import com.spring.project.OutpatientAppointmentSystem.DTO.AppointmentDTO;

public interface AppointmentService {
    List<AppointmentDTO> getAllAppointments();
    
}
