package com.spring.project.OutpatientAppointmentSystem.ExceptionHandling;
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
