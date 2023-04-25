package com.example.demo.entity;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.Max;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recruiter {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(length = 50)
	private String fName;
	@Column( length = 50)
	private String lName;
	@Column(length = 55)
	private String email;
	@Column(length = 12)
	private Integer mobileNo;
	@Column(length = 100)
	private String collegeCompName;
	private String address;
	private String collegeComplogo;
	private LocalDate createdAt;
	private String profileUrl;
	
	
    
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCollegeCompName() {
		return collegeCompName;
	}
	public void setCollegeCompName(String collegeCompName) {
		this.collegeCompName = collegeCompName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollegeComplogo() {
		return collegeComplogo;
	}
	public void setCollegeComplogo(String collegeComplogo) {
		this.collegeComplogo = collegeComplogo;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	
	
	
}
