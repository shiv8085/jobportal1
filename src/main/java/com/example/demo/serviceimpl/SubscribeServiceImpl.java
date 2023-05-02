package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SubscribeDao;
import com.example.demo.entity.Subscribe;
import com.example.demo.service.SubscribeService;

@Service
public class SubscribeServiceImpl implements SubscribeService {
	
	@Autowired
	SubscribeDao subscribeDao;

	@Override
	public Subscribe adSubscribe(Subscribe subscribe) {
		
		return subscribeDao.save(subscribe);
	}

	@Override
	public List<Subscribe> showSubscribe() {
		
		return subscribeDao.findAll();
	}

	@Override
	public Optional<Subscribe> getByIdSubscribe(Integer id) {
		
		return subscribeDao.findById(id);
	}

}
