package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;
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
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.entity.Seeker;
import com.example.demo.service.SeekerService;

@RestController
@RequestMapping("/seeker")
public class SeekerController {
	
	@Autowired
	SeekerService seekerService;
		
	@GetMapping("/getbyid/{uuid}")
	public  ResponseEntity<?> getSeeker(@PathVariable UUID uuid) 
	{
	  Optional<Seeker> retrievedSeeker=seekerService.seekerGetById(uuid);
	  return new ResponseEntity<>(retrievedSeeker,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public  ResponseEntity<Seeker> addSeeker(@RequestBody Seeker seeker) 
	{
		Seeker seekerSaved= seekerService.seekerAdd(seeker);
		return new ResponseEntity<Seeker>(seekerSaved,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteseeker/{uuid}")
	public ResponseEntity<String> deleteSeeker(@PathVariable UUID uuid)
	{
		String msg=seekerService.seekerDeleteById(uuid);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	@GetMapping("/show")
	public  List<Seeker> showSeeker()
	{
		return seekerService.showSeeker();
	}

}
