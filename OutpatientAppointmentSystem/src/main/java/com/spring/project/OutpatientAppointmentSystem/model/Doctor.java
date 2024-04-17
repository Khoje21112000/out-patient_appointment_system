package com.spring.project.OutpatientAppointmentSystem.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String specialty;

	private int consultationCapacity;

	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<Appointment> appointments = new ArrayList<>();

	// Constructors, getters, and setters

	public Doctor() {
	}

	public Doctor(Long id, String name, String specialty, int consultationCapacity, List<Appointment> appointments) {
		super();
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.consultationCapacity = consultationCapacity;
		this.appointments = appointments;
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

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

}