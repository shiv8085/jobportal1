package com.example.demo.serviceimpl;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.custom.exception.BusinessException;
import com.example.demo.dao.JobPostDao;
import com.example.demo.dao.RecruiterDao;
import com.example.demo.entity.JobPost;
import com.example.demo.entity.Recruiter;
import com.example.demo.entity.Seeker;
import com.example.demo.entity.User;
import com.example.demo.service.JobPostService;
import com.example.demo.service.RecruiterService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RecruiterServiceImpl implements RecruiterService{

	@Autowired
	RecruiterDao recruiterDao;
	
	@Autowired
	JobPostService jobPostService;
	
	
	
	@Override
	public Recruiter addRecruiter(Recruiter recruiter) {
//		try {
//		if(recruiter.getfName()==null || recruiter.getfName().isEmpty())
//		{
//			throw new BusinessException("name field is empty"); 
//		}
//		LocalDate localDate= LocalDate.now();
//		recruiter.setCreatedAt(localDate);
//		return recruiterDao.save(recruiter);
//		}catch (IllegalArgumentException  e) {
//			throw new BusinessException("all field is empty");
//		}
		
		
		
			if(recruiter.getF_name()!=null || !recruiter.getF_name().isEmpty())
			{
				LocalDate localDate= LocalDate.now();
				recruiter.setCreatedAt(localDate);
			    Recruiter newRecruiter=recruiterDao.save(recruiter);
				return newRecruiter;
			}
			return null;
	
	}
	

	@Override
	public String deleteRecruiter(Integer id) {
		try {
		Optional<Recruiter> recruiter= recruiterDao.findById(id);
		if(recruiter.isEmpty())
		{
			throw new BusinessException("Object is not present in database");
		}
		recruiterDao.deleteById(id);
		return "Successfully deleted";
		}catch (IllegalArgumentException  e) {
			throw new BusinessException("your input field is empty");
		}
		catch(Exception e)
		{
			throw new BusinessException("Something went wrong");
		}
		
	}
	
	@Override
	public Recruiter getRecruiterById(Integer id) {
		
		return recruiterDao.findById(id).get();
	}
	
	
	@Override
	public List<JobPost> getRecruiterjobPost(Integer rec_id) {
		
           List<JobPost> list= jobPostService.showJobPost();
           List<JobPost> list2=new LinkedList<>();
           for(JobPost jobPost: list)
           {
        	   if(jobPost.getRecruiter_id()==rec_id)
        	   {
        		   list2.add(jobPost);
        	   }
           }
           return list2;
	}


	@Override
	public List<Recruiter> getAllRecruiter() {
		
		return recruiterDao.findAll();
	}

// ****
	/*
	@Override
	public List<JobPost> getAllJobpostRec_id() {
	List<JobPost> jobpost_data =jobPostService.showJobPost();
	List<Recruiter> recruiter_data = recruiterDao.findAll();
		if(jobpost_data.getRecruiter_id() == ((Recruiter) recruiter_data).getRecruiter_id()) {
			
			List<JobPost> result = jobPos;
		}

	}

	*/

}
