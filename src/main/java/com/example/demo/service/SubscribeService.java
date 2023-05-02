package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Subscribe;

public interface SubscribeService {
	
	//ad data
	public Subscribe adSubscribe(Subscribe subscribe);
	
	//get all
	public List<Subscribe> showSubscribe();
	
	//get by id
	public Optional<Subscribe> getByIdSubscribe(Integer id);

}
