package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Subscribe {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	
	
	@NotBlank(message = "email is required")
	@Email(message = "Invalid email address")
	private String email;
	
	
	
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
	public Subscribe(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	public Subscribe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
