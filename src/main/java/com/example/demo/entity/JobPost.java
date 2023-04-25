package com.example.demo.entity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobPost {
	
	@Id
	@Column(length=16)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(length=50, nullable = false)
	private String title;
	@Column(length=50, nullable = false)
	private String category;
	@Column(length=50, nullable = false)
	private String companyName;
	private String companyLogo;
	@Column(length=12, nullable = false)
	private Integer noOfVacancies;
	@Column(length=255, nullable = false)
	private String address;
	@Column(length=50, nullable = false)
	private String jobType;
    private Integer offeredSalary;
	@Column(length=500, nullable = false)
	private String requireKnowledgeSkills;
	@Column(length=100, nullable = false)
	private String educationQualification;
	private String status;
	@Column(length=250, nullable = false)
	private String description;
	@Column(length=12, nullable = false)
	private Integer contactNumber;
	private String emailAddress;
	@Column(length=250, nullable = false )
	private Integer createdByRecruiterId;
	private LocalDate createdAt;
	
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}
	public Integer getNoOfVacancies() {
		return noOfVacancies;
	}
	public void setNoOfVacancies(Integer noOfVacancies) {
		this.noOfVacancies = noOfVacancies;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public Integer getOfferedSalary() {
		return offeredSalary;
	}
	public void setOfferedSalary(Integer offeredSalary) {
		this.offeredSalary = offeredSalary;
	}
	public String getRequireKnowledgeSkills() {
		return requireKnowledgeSkills;
	}
	public void setRequireKnowledgeSkills(String requireKnowledgeSkills) {
		this.requireKnowledgeSkills = requireKnowledgeSkills;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public String getEducationQualification() {
		return educationQualification;
	}
	public void setEducationQualification(String educationQualification) {
		this.educationQualification = educationQualification;
	}
	public Integer getCreatedByRecruiterId() {
		return createdByRecruiterId;
	}
	public void setCreatedByRecruiterId(Integer createdByRecruiterId) {
		this.createdByRecruiterId = createdByRecruiterId;
	}

	
	
	
	
	
}
