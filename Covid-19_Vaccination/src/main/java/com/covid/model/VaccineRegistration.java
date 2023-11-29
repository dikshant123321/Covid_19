package com.covid.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class VaccineRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer VaccineRegistrationId;
	private Long mobileNumber;
	private LocalDate dateOfRegistration=LocalDate.now();
	
}
