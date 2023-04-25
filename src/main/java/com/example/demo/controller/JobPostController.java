package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

import com.example.demo.entity.JobPost;
import com.example.demo.service.JobPostService;

@RestController
@RequestMapping("/jobpost")
public class JobPostController {
	
	@Autowired
	private JobPostService jobPostService;
	
	@PostMapping("/")
	public ResponseEntity<JobPost> jobPostAdd(@RequestBody JobPost jobPost)
	{
	  JobPost jobPost1=jobPostService.jobPostAdd(jobPost);
	  return new ResponseEntity<JobPost>(jobPost1,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> jobpostDel(@PathVariable Integer id)
	{
		String msg= jobPostService.jobPostDeleteById(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<JobPost>> showJobPost()
	{
	    List<JobPost> list=jobPostService.showJobPost(); 
	    return new ResponseEntity<List<JobPost>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<JobPost> getJobPost(@PathVariable Integer id)
	{
		JobPost jobPost=jobPostService.JobPostGetById(id);
		return new ResponseEntity<>(jobPost,HttpStatus.OK);
	}	

}
