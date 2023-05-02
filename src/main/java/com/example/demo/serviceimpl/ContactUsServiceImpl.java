package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactUsDao;
import com.example.demo.entity.ContactUs;
import com.example.demo.service.ContactUsService;

@Service
public class ContactUsServiceImpl implements ContactUsService {
	
	@Autowired
	ContactUsDao contactUsDao;

	@Override
	public ContactUs addContactUs(ContactUs contactUs) {
		
		return contactUsDao.save(contactUs);
	}

	@Override
	public List<ContactUs> showContactUs() {
		
		return contactUsDao.findAll();
	}

	@Override
	public Optional<ContactUs> getByIdContactUs(Integer id) {
	
		return contactUsDao.findById(id);
	}
	

}
