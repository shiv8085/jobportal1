package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Subscribe;
import com.example.demo.service.SubscribeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/subscribe")
public class SubscribeController {
	
	@Autowired
	private SubscribeService subscribeService;
	
	
	@PostMapping("/")
	public ResponseEntity<Subscribe> adSubscribe(@RequestBody @Valid Subscribe subscribe) {
		try {
			
			Subscribe saveSubscribe =  subscribeService.adSubscribe(subscribe);
			return new ResponseEntity<Subscribe>(saveSubscribe,HttpStatus.CREATED);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	  
	}
	
	
	@GetMapping("/")
	public List<Subscribe> showSubscribe(){
		return subscribeService.showSubscribe();
	}
	
	@GetMapping("/{id}")
	public Optional<Subscribe> getByIdSubscribe(@PathVariable Integer id) {
	
		return subscribeService.getByIdSubscribe(id);
	}

}
