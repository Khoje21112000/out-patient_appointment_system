package com.spring.project.OutpatientAppointmentSystem.DTO;

public class AvailabilityDTO {
	private String timeSlot;
	private boolean available;

	// Constructors, getters, and setters

	public AvailabilityDTO() {
	}

	public AvailabilityDTO(String timeSlot, boolean available) {
		this.timeSlot = timeSlot;
		this.available = available;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	// Getters and Setters

}
