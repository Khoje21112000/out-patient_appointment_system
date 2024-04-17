package com.spring.project.OutpatientAppointmentSystem.Component;
import org.springframework.stereotype.Component;

import com.spring.project.OutpatientAppointmentSystem.DTO.AppointmentDTO;
import com.spring.project.OutpatientAppointmentSystem.model.Appointment;

@Component
public class AppointmentMapper {

    public static AppointmentDTO toDTO(Appointment appointment) {
        return new AppointmentDTO(
            appointment.getId(),
            appointment.getPatientName(),
            appointment.getAppointmentDate()
        );
    }

    public static Appointment toEntity(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment();
        appointment.setPatientName(appointmentDTO.getPatientName());
        appointment.setAppointmentDate(appointmentDTO.getAppointmentDate());
        // You may need to set other properties depending on your entity
        return appointment;
    }
}
