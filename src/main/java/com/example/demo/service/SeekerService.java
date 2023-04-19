package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.example.demo.entity.Seeker;

public interface SeekerService {
	
	    //add Seeker
		public Seeker seekerAdd(Seeker service) throws Exception;
		
		//Delete Seeker
		public String seekerDeleteById(Integer id);
		
		//get Seeker
		public List<Seeker> showSeeker();
		
		//get by id Seeker
		public Seeker seekerGetById(Integer id);

		
		

}
