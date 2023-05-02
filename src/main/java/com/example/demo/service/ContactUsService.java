package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.ContactUs;

public interface ContactUsService {
	
	//ad ContactUs
	public ContactUs addContactUs(ContactUs contactUs);
	
	// get All
	public List<ContactUs> showContactUs();
	
	//get by id
	public Optional<ContactUs> getByIdContactUs(Integer id);
}
