package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ContactUs;
import com.example.demo.service.ContactUsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/contactus")
public class ContactUsController {
	
	@Autowired
	ContactUsService contactUsService;

	@PostMapping("/")
	public ContactUs addContactUs(@Valid @RequestBody ContactUs contactUs) {
		
		return contactUsService.addContactUs(contactUs);
	}
	
	@GetMapping("/")
	public List<ContactUs> showContactUs(){
		return contactUsService.showContactUs();
	}
	
	@GetMapping("/{id}")
	public Optional<ContactUs> getByIdContactUs(@PathVariable int id) {
		return contactUsService.getByIdContactUs(id);
	}
	

}
