package com.spring.project.OutpatientAppointmentSystem.Component;
import org.springframework.stereotype.Component;

import com.spring.project.OutpatientAppointmentSystem.DTO.DoctorDTO;
import com.spring.project.OutpatientAppointmentSystem.model.Doctor;

@Component
public class DoctorMapper {

    public static DoctorDTO toDTO(Doctor doctor) {
        return new DoctorDTO(
            doctor.getId(),
            doctor.getName(),
            doctor.getSpecialty(),
            doctor.getConsultationCapacity()
        );
    }
}
