package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import com.example.demo.entity.JobPost;
import com.example.demo.entity.Recruiter;
import com.example.demo.entity.User;

public interface RecruiterService {
	
	//add recruiter
	public Recruiter addRecruiter(Recruiter recruiter);
	
	//Delete Recruiter
	public String deleteRecruiter(Integer id);
	
	// get all data
	public List<Recruiter> getAllRecruiter();
	
	//get by id
	public Recruiter getRecruiterById(Integer id);
		
			
	//get jobpost from specific recruiter id
	public List<JobPost> getRecruiterjobPost(Integer rec_id);
	
	
}
