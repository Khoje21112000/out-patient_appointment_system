package com.spring.project.OutpatientAppointmentSystem.DTO;

public class AppointmentDTO {
	private Long id;
	private String patientName;
	private String appointmentDate;

	// Constructors, getters, and setters

	public AppointmentDTO() {
	}

	public AppointmentDTO(Long id, String patientName, String appointmentDate) {
		this.id = id;
		this.patientName = patientName;
		this.appointmentDate = appointmentDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	// Getters and Setters

}
