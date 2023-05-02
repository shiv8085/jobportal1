package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@NotBlank(message = "User name is required")
	private String username;
	
	@NotBlank(message = "User name is required")
	@Size(min = 6, message = "Password should have at least 6 characters")
	private String password;
	
	@NotBlank(message = "first name is required")
	private String first_name;
	
	@NotBlank(message = "last name is required")
	private String last_name;
	
	private String last_login;
	
	
	private LocalDate date_joined;
	
	private boolean is_superuser;
	private boolean is_active;
	
	@NotBlank(message = "role is required")
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String string) {
		this.last_login = string;
	}
	public LocalDate getDate_joined() {
		return date_joined;
	}
	public void setDate_joined(LocalDate date_joined) {
		this.date_joined = date_joined;
	}
	public boolean isIs_superuser() {
		return is_superuser;
	}
	public void setIs_superuser(boolean is_superuser) {
		this.is_superuser = is_superuser;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(int id, String username, String password, String first_name, String last_name, String last_login,
			LocalDate date_joined, boolean is_superuser, boolean is_active, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.last_login = last_login;
		this.date_joined = date_joined;
		this.is_superuser = is_superuser;
		this.is_active = is_active;
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
