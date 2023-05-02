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

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<User> adUser(@Valid @RequestBody User user) {
		User user1 = userService.addUser(user);
		
		return new ResponseEntity<>(user1,HttpStatus.CREATED);									
	}
	
	@GetMapping("/")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getByIdUser(@PathVariable int id){
		return userService.getByIdUser(id);
	}

	
	
	
	
}
