package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.SeekerDao;
import com.example.demo.entity.Seeker;
import com.example.demo.service.SeekerService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SeekerServiceImpl implements SeekerService {

	@Autowired
	SeekerDao seekerDao;	
	
	@Override
	public Optional<Seeker> seekerGetById(UUID uuid) {
		Optional<Seeker> seeker=seekerDao.findById(uuid);
		System.out.println(seeker);
		if(seeker.isEmpty())
		{
			throw new EntityNotFoundException();
		}
		return seeker;
	}
	
	@Override
	public Seeker seekerAdd(Seeker seeker) {
		if(seeker.getFname().isEmpty())
		{
			throw new NullPointerException(); 
		}
		Seeker seekerReturn=seekerDao.save(seeker);
		return seekerReturn;
	}

	@Override
	public String seekerDeleteById(UUID uuid) {
		Optional<Seeker> seeker=seekerDao.findById(uuid);
		 if(seeker.isEmpty())
		 {
			 throw new EntityNotFoundException();
		 }
		 else
		 {
		 seekerDao.deleteById(uuid);
	      return "Successfully Deleted new";
		 }
 	
}

	@Override
	public List<Seeker> showSeeker() {
		List<Seeker> seekerList= seekerDao.findAll();
		if(seekerList.isEmpty())
		{
			throw new EntityNotFoundException();
		}
		else
		{
			return seekerList;
		}
		
	}

}
