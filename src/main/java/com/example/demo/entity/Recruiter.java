package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recruiter {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer recruiter_id;
	@Column(length = 50)
	private String f_name;
	@Column( length = 50)
	private String l_name;
	@Column(length = 55)
	private String email;
	@Column(length = 12)
	private Long mobile_no;
	@Column(length = 100)
	private String college_comp_name;
	private String address;
	private String college_comp_logo;
	private LocalDate createdAt;
	private String profile_url;
	public Integer getRecruiter_id() {
		return recruiter_id;
	}
	public void setRecruiter_id(Integer recruiter_id) {
		this.recruiter_id = recruiter_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(Long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getCollege_comp_name() {
		return college_comp_name;
	}
	public void setCollege_comp_name(String college_comp_name) {
		this.college_comp_name = college_comp_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollege_comp_logo() {
		return college_comp_logo;
	}
	public void setCollege_comp_logo(String college_comp_logo) {
		this.college_comp_logo = college_comp_logo;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public String getProfile_url() {
		return profile_url;
	}
	public void setProfile_url(String profile_url) {
		this.profile_url = profile_url;
	}
	public Recruiter(Integer recruiter_id, String f_name, String l_name, String email, Long mobile_no,
			String college_comp_name, String address, String college_comp_logo, LocalDate createdAt,
			String profile_url) {
		super();
		this.recruiter_id = recruiter_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.mobile_no = mobile_no;
		this.college_comp_name = college_comp_name;
		this.address = address;
		this.college_comp_logo = college_comp_logo;
		this.createdAt = createdAt;
		this.profile_url = profile_url;
	}
	public Recruiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
