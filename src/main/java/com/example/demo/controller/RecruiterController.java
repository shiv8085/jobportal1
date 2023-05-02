package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RecruiterDao;
import com.example.demo.entity.JobPost;
import com.example.demo.entity.Recruiter;
import com.example.demo.entity.User;
import com.example.demo.service.RecruiterService;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
	
	@Autowired
	RecruiterService recruiterService;
	
	
	@PostMapping("/")
	public ResponseEntity<Recruiter> recruiterAdd(@RequestBody Recruiter recruiter)
	{
		Recruiter saveRecruiter= recruiterService.addRecruiter(recruiter);
		return new ResponseEntity<Recruiter>(saveRecruiter, HttpStatus.CREATED);
			
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRecruiter(@PathVariable Integer id)
	{
	    String msg=recruiterService.deleteRecruiter(id);
	    return new ResponseEntity<String>(msg, HttpStatus.OK);
				
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Recruiter> recruiterGetById(@PathVariable Integer id)
	{
		Recruiter recruiter= recruiterService.getRecruiterById(id);
		return new ResponseEntity<Recruiter>(recruiter, HttpStatus.CREATED);
			
	}
	
	@GetMapping("/")
	public List<Recruiter> getAllRecruiter(){
		return recruiterService.getAllRecruiter();
	}
	
	
	@GetMapping("/{id}/jobpost")
	public ResponseEntity<List<JobPost>> recruiterAcJob(@PathVariable Integer id)
	{
		List<JobPost> list= recruiterService.getRecruiterjobPost(id);
		return new ResponseEntity<List<JobPost>>(list, HttpStatus.CREATED);
			
	}
	
	
}
