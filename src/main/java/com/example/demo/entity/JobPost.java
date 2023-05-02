package com.example.demo.entity;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer jobpost_id;
	@Column(nullable = false)
	private String address;
	@Column(length=10, nullable = false)
	private long contact_no;
	@Column(length=50, nullable = false)
	private String company_name;
	@Column(nullable = false)
	private String company_description;
	private LocalDate created_at;
	@Column(nullable = false)
	private String description;
	@Column(length=50, nullable = false)
	private String email;
	@Column(nullable = false)
	private String experience_required;
	@Column(nullable = false)
	private String education_qualification;
	@Column(nullable = false)
	private boolean filled;
	@Column(length=100, nullable = false)
	private String job_category;
	@Column(length=100, nullable = false)
	private String job_title;
	@Column(length=50, nullable = false)
	private String job_location;
	@Column(nullable = false)
	
	private String last_date;
	@Column(nullable = false)
	private Integer recruiter_id;
	@Column(nullable = false)
	private String qualification;
	@Column(length=50, nullable = false)
	private int salary_range_1;
	@Column(length=50, nullable = false)
	private int salary_range_2;
	@Column(nullable = false)
	private int vacancies;
	@Column(length=50, nullable = false)
	private String website;
	@Column(length=50, nullable = false)
	private String company_logo;
	public Integer getJobpost_id() {
		return jobpost_id;
	}
	public void setJobpost_id(Integer jobpost_id) {
		this.jobpost_id = jobpost_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_description() {
		return company_description;
	}
	public void setCompany_description(String company_description) {
		this.company_description = company_description;
	}
	public LocalDate getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience_required() {
		return experience_required;
	}
	public void setExperience_required(String experience_required) {
		this.experience_required = experience_required;
	}
	public String getEducation_qualification() {
		return education_qualification;
	}
	public void setEducation_qualification(String education_qualification) {
		this.education_qualification = education_qualification;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getJob_category() {
		return job_category;
	}
	public void setJob_category(String job_category) {
		this.job_category = job_category;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public String getLast_date() {
		return last_date;
	}
	public void setLast_date(String last_date) {
		this.last_date = last_date;
	}
	public Integer getRecruiter_id() {
		return recruiter_id;
	}
	public void setRecruiter_id(Integer recruiter_id) {
		this.recruiter_id = recruiter_id;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getSalary_range_1() {
		return salary_range_1;
	}
	public void setSalary_range_1(int salary_range_1) {
		this.salary_range_1 = salary_range_1;
	}
	public int getSalary_range_2() {
		return salary_range_2;
	}
	public void setSalary_range_2(int salary_range_2) {
		this.salary_range_2 = salary_range_2;
	}
	public int getVacancies() {
		return vacancies;
	}
	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCompany_logo() {
		return company_logo;
	}
	public void setCompany_logo(String company_logo) {
		this.company_logo = company_logo;
	}
	public JobPost(Integer jobpost_id, String address, long contact_no, String company_name, String company_description,
			LocalDate created_at, String description, String email, String experience_required,
			String education_qualification, boolean filled, String job_category, String job_title, String job_location,
			String last_date, Integer recruiter_id, String qualification, int salary_range_1, int salary_range_2,
			int vacancies, String website, String company_logo) {
		super();
		this.jobpost_id = jobpost_id;
		this.address = address;
		this.contact_no = contact_no;
		this.company_name = company_name;
		this.company_description = company_description;
		this.created_at = created_at;
		this.description = description;
		this.email = email;
		this.experience_required = experience_required;
		this.education_qualification = education_qualification;
		this.filled = filled;
		this.job_category = job_category;
		this.job_title = job_title;
		this.job_location = job_location;
		this.last_date = last_date;
		this.recruiter_id = recruiter_id;
		this.qualification = qualification;
		this.salary_range_1 = salary_range_1;
		this.salary_range_2 = salary_range_2;
		this.vacancies = vacancies;
		this.website = website;
		this.company_logo = company_logo;
	}
	public JobPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}