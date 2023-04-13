package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JobPostDao;
import com.example.demo.entity.JobPost;
import com.example.demo.service.JobPostService;

@Service
public class JobPostServiceImpl implements JobPostService {

	
	@Autowired
	JobPostDao jobPostServiceDao;
	
	@Override
	public JobPost jobPostAdd(JobPost jobPost) {
		if(jobPost.getTitle().isEmpty())
		{
			throw new NullPointerException();
		}
		JobPost jobPost1=jobPostServiceDao.save(jobPost);
		return jobPost;
	}

	@Override
	public String jobPostDeleteById(UUID uuid) {
		jobPostServiceDao.deleteById(uuid);
		return "Successfully Deleted";
	}

	@Override
	public List<JobPost> showJobPost() {
		return (List<JobPost>) jobPostServiceDao.findAll();
	}

	@Override
	public Optional<JobPost> JobPostGetById(UUID uuid) {
		return jobPostServiceDao.findById(uuid);
	}

}
