package com.covid.model;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class IdCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCardId;
	private String name;
	private LocalDate dob;
	private String gender;
	private String address;
	private String state;
	private String city;
	private String pincode;
	@Embedded
	private  PanCard pancard;
}
