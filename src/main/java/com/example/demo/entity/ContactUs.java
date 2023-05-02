package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ContactUs {
	@Id

	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;

	@Email
	@NotBlank(message = "email is required")
	private String email;
	

	@NotBlank(message = "name is required")
	private String name;
	
	@NotBlank(message = "messege name is required")
	private String message;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ContactUs(int id, String email, String name, String message) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.message = message;
	}

	public ContactUs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
