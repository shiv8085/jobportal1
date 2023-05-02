package com.example.demo.serviceimpl;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.hibernate.type.descriptor.java.LocalDateJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.custom.exception.BusinessException;
import com.example.demo.dao.JobPostDao;
import com.example.demo.entity.JobPost;
import com.example.demo.service.JobPostService;
import jakarta.persistence.EntityNotFoundException;


@Service
public class JobPostServiceImpl implements JobPostService {

	
	@Autowired
	JobPostDao jobPostServiceDao;
	
	@Override
	public JobPost jobPostAdd(Integer id,JobPost jobPost) {
		try {
			LocalDate localDate= LocalDate.now();
			jobPost.setRecruiter_id(id);     // for recruter_id   jobpost/7
			
		if(jobPost.getJob_title().isEmpty())
		{
			throw new BusinessException("pls enter title");
		}
		jobPost.setCreated_at(localDate);
		return jobPostServiceDao.save(jobPost);
		}catch(IllegalArgumentException e)
		{
			throw new BusinessException("fill all the field is mendatory");
		}
	}

	@Override
	public String jobPostDeleteById(Integer id) {
		try {
		jobPostServiceDao.deleteById(id);
		return "Successfully Deleted";
		}
		catch (EntityNotFoundException e) {
		     throw new BusinessException("No Object Found For Deletion");
		}
		
	}

	@Override
	public List<JobPost> showJobPost() {
	    try {
	    	List<JobPost> postJobList=jobPostServiceDao.findAll();
	    return postJobList;
	    }
	    catch (NoSuchElementException  e) {
	      throw new BusinessException("No Job Found");
		}
	}

	@Override
	public JobPost JobPostGetById(Integer id) {
		try {
		Optional<JobPost> jobPost=jobPostServiceDao.findById(id);
	     return jobPost.get();
		}catch (EntityNotFoundException e) {
			throw new BusinessException("No Job Found");
		}
	}
	
}


