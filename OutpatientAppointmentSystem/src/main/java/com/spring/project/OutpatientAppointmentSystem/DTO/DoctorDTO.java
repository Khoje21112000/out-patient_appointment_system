package com.spring.project.OutpatientAppointmentSystem.DTO;

public class DoctorDTO {
	private Long id;
	private String name;
	private String specialty;
	private int consultationCapacity;

	// Constructors, getters, and setters

	public DoctorDTO() {
	}

	public DoctorDTO(Long id, String name, String specialty, int consultationCapacity) {
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.consultationCapacity = consultationCapacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getConsultationCapacity() {
		return consultationCapacity;
	}

	public void setConsultationCapacity(int consultationCapacity) {
		this.consultationCapacity = consultationCapacity;
	}

	// Getters and Setters

}
