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
	private String company_logo;
	@Column(length=250)
	private String company_brief_description;
	private String job_category;
	private String job_location;
	private String company_social_link;
	@Column(length=255)
	private String company_address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompany_logo() {
		return company_logo;
	}
	public void setCompany_logo(String company_logo) {
		this.company_logo = company_logo;
	}
	public String getCompany_brief_description() {
		return company_brief_description;
	}
	public void setCompany_brief_description(String company_brief_description) {
		this.company_brief_description = company_brief_description;
	}
	public String getJob_category() {
		return job_category;
	}
	public void setJob_category(String job_category) {
		this.job_category = job_category;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public String getCompany_social_link() {
		return company_social_link;
	}
	public void setCompany_social_link(String company_social_link) {
		this.company_social_link = company_social_link;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public Company(Integer id, String company_logo, String company_brief_description, String job_category,
			String job_location, String company_social_link, String company_address) {
		super();
		this.id = id;
		this.company_logo = company_logo;
		this.company_brief_description = company_brief_description;
		this.job_category = job_category;
		this.job_location = job_location;
		this.company_social_link = company_social_link;
		this.company_address = company_address;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
		
}
