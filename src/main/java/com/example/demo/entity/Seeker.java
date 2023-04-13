package com.example.demo.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seeker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID uuid;
	@Column(length = 50)
	private String fname;
	@Column( length = 50)
	private String lname;
	@Column(length = 55)
	private String email;
	@Column(length = 12)
	private Integer mobileno;
	@Column(length = 2)
	private String gender;
	@Column(length = 50)
	private String title;
	@Column(length = 255)
	private String address;
	private String education;
	@Column(length = 50)
	private String degree;
	@Column(length = 55)
	private String institute;
	private String year;
	@Column(length = 12)
	private Integer marks;
	@Column(length = 250)
	private String skill;
	@Column(length = 50)
	private String name;
	private Integer ratepercent;
	private Integer experience;
	@Column(length = 50)
	private String comname;
	private String startdate;
	private String enddate;
	@Column(length = 250)
	private String jobdescription;
	private String sociallink;
	private String resume;
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMobileno() {
		return mobileno;
	}
	public void setMobileno(Integer mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRatepercent() {
		return ratepercent;
	}
	public void setRatepercent(Integer ratepercent) {
		this.ratepercent = ratepercent;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getSociallink() {
		return sociallink;
	}
	public void setSociallink(String sociallink) {
		this.sociallink = sociallink;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
   
}
