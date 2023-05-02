package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {

	// add data
	public User addUser(User user);
	
	// get all data
	public List<User> getAllUser();
	
	// get by id
	public Optional<User> getByIdUser(Integer id);
}
