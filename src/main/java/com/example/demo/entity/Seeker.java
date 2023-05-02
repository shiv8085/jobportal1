package com.example.demo.entity;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Seeker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long seeker_id;
	
	private String name;
	
	/*
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity =Skill.class)
	@JoinTable(name="SEEKER_SKILL",
	joinColumns = {
			@JoinColumn(name="Seeker_id")
	},
	inverseJoinColumns = {
			@JoinColumn(name="Skill_id")
	}
)
    private Set<Skill> skill=new HashSet<>();
	*/
	
	private String skills;
	@Column(nullable = false)
	private String profile;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private Long phone;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = true)
	private String date_of_birth;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private LocalDate created_at;
	@Column(nullable = false)
	private String education_details;
	@Column(nullable = false)
	private String role;
	@Column(nullable = false)
	private String research;
	@Column(nullable = false)
	private String resume_link;
	@Column(nullable = false)
	private String resume_name;
	@Column(nullable = false)
	private String profile_pic_link;
	
	@NotBlank(message = "password is required") // new field add
	private String password;

	public long getSeeker_id() {
		return seeker_id;
	}

	public void setSeeker_id(long seeker_id) {
		this.seeker_id = seeker_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public String getEducation_details() {
		return education_details;
	}

	public void setEducation_details(String education_details) {
		this.education_details = education_details;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getResearch() {
		return research;
	}

	public void setResearch(String research) {
		this.research = research;
	}

	public String getResume_link() {
		return resume_link;
	}

	public void setResume_link(String resume_link) {
		this.resume_link = resume_link;
	}

	public String getResume_name() {
		return resume_name;
	}

	public void setResume_name(String resume_name) {
		this.resume_name = resume_name;
	}

	public String getProfile_pic_link() {
		return profile_pic_link;
	}

	public void setProfile_pic_link(String profile_pic_link) {
		this.profile_pic_link = profile_pic_link;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Seeker(long seeker_id, String name, String skills, String profile, String email, Long phone,
			String address, String gender, String date_of_birth, String description, LocalDate created_at,
			String education_details, String role, String research, String resume_link, String resume_name,
			String profile_pic_link, @NotBlank(message = "password is required") String password) {
		super();
		this.seeker_id = seeker_id;
		this.name = name;
		this.skills = skills;
		this.profile = profile;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.description = description;
		this.created_at = created_at;
		this.education_details = education_details;
		this.role = role;
		this.research = research;
		this.resume_link = resume_link;
		this.resume_name = resume_name;
		this.profile_pic_link = profile_pic_link;
		this.password = password;
	}

	public Seeker() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
	
	
	
}