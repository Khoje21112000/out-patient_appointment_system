package com.spring.project.OutpatientAppointmentSystem.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.OutpatientAppointmentSystem.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
   
}
