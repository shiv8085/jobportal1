package com.example.demo.serviceimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public User addUser(User user) {
		
		LocalDate localDate= LocalDate.now();
		user.setDate_joined(localDate);
		/*
		localdatetime localdatetime = localdatetime.now();
	    datetimeformatter format = datetimeformatter.ofpattern("dd-mm-yyyy hh:mm:ss");
	    string formatteddatetime = localdatetime.format(format);
	    user.setlast_login(formatteddatetime);
	    */
		
	    LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        user.setLast_login(formattedDateTime);
        
	   
		
		return userDao.save(user);
	}

	@Override
	public List<User> getAllUser() {
		
		return userDao.findAll();
	}

	@Override
	public Optional<User> getByIdUser(Integer id) {
		
		return userDao.findById(id);
	}

}
