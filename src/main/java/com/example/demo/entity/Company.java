package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {
    
	@Id
	@Column(length=16)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "Company_Logo")
	private String companyLogo;
	@Column(length=250)
	private String companyBriefDescription;
	private String jobCategory;
	private String jobLocation;
	private String companySocialLink;
	@Column(length=255)
	private String companyAddress;
	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Company(Integer id, String companyLogo, String companyBriefDescription, String jobCategory,
			String jobLocation, String companySocialLink, String companyAddress) {
		super();
		this.id = id;
		this.companyLogo = companyLogo;
		this.companyBriefDescription = companyBriefDescription;
		this.jobCategory = jobCategory;
		this.jobLocation = jobLocation;
		this.companySocialLink = companySocialLink;
		this.companyAddress = companyAddress;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}
	public String getCompanyBriefDescription() {
		return companyBriefDescription;
	}
	public void setCompanyBriefDescription(String companyBriefDescription) {
		this.companyBriefDescription = companyBriefDescription;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getCompanySocialLink() {
		return companySocialLink;
	}
	public void setCompanySocialLink(String companySocialLink) {
		this.companySocialLink = companySocialLink;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	
	
		
}
