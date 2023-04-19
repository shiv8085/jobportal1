package com.example.demo.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.custom.exception.BusinessException;
import com.example.demo.dao.SeekerDao;
import com.example.demo.entity.Seeker;
import com.example.demo.service.SeekerService;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.EntityNotFoundException;

@Service
public class SeekerServiceImpl implements SeekerService {

	@Autowired
	SeekerDao seekerDao;

	@Override
	public Seeker seekerAdd(Seeker seeker) {
		
		try {
		if (StringUtils.isBlank(seeker.getName())) {
			throw new BusinessException("Name Field is empty");
		}
			Seeker seekerReturn = seekerDao.save(seeker);
			return seekerReturn;
			}
		
			catch (IllegalArgumentException e) {
			    throw new BusinessException(" whole entity is empty  "+e.getMessage());
			}
		
		    catch (Exception e) {
			throw new BusinessException("something went wrong 2 ");
		}		
	}
    	
	
	
//	try {
//		if (StringUtils.isBlank(seeker.getName())) {
//			throw new BusinessException("Name Field is empty");
//		}
	
	
	
	@Override
	public Seeker seekerGetById(Integer id) {
		try {
		Optional<Seeker> seeker = seekerDao.findById(id);
          return seeker.get();
		}
		catch(IllegalArgumentException e)
		{
			throw new BusinessException("901","pls put valid arguments in the block"+e.getMessage());
		}
		catch(NoSuchElementException e)
		{
			throw new BusinessException("902","No any object is present "+ e.getMessage());
		}
		catch(Exception e)
		{
			throw new BusinessException("903","something went wrong in buissnes layer"+e.getMessage());
		}
		
	}
	
	
//	@Override
//	public Seeker seekerGetById(Integer id) {
//		try {
//		Optional<Seeker> seeker = seekerDao.findById(id);
//		if (seeker.isPresent()) {
//			throw new EntityNotFoundException();
//		}
//		return seeker.get();
//	}
	

	@Override
	public List<Seeker> showSeeker() {
		try {
		List<Seeker> seekerList = seekerDao.findAll();
		if (CollectionUtils.isEmpty(seekerList)) {
			throw new BusinessException("204","whole list is empty");
		}
         return seekerList;
		}catch (Exception e) {
			throw new BusinessException("500","Something went wrong show seeker");
		}
	}
	
	@Override
	public String seekerDeleteById(Integer id) {
		try {
		Optional<Seeker> seeker = seekerDao.findById(id);
		if (seeker.isPresent()) {
			seekerDao.deleteById(id);
		}
		return "Successfully Deleted";
		}
		catch(NoSuchElementException e){
			throw new BusinessException("204","NO Seeker Found on this Id");
		}
		catch(IllegalArgumentException e)
		{
			throw new BusinessException("402","pls input right element");
		}
		catch(Exception e)
		{
			throw new BusinessException("500","Something went wrong");
		}

	}

}
