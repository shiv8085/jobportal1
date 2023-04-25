package com.example.demo.serviceimpl;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.custom.exception.BusinessException;
import com.example.demo.dao.RecruiterDao;
import com.example.demo.entity.Recruiter;
import com.example.demo.entity.Seeker;
import com.example.demo.service.RecruiterService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RecruiterServiceImpl implements RecruiterService{

	@Autowired
	RecruiterDao recruiterDao;
	
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
		
		
		
			if(recruiter.getfName()!=null || !recruiter.getfName().isEmpty())
			{
				LocalDate localDate= LocalDate.now();
				recruiter.setCreatedAt(localDate);
			    Recruiter re=recruiterDao.save(recruiter);
				return re;
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
	

}
