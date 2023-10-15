package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
class Userservice{
	@Autowired
		private UserRepository userrepository;
	public User saveDetails(User user) {
		
		return userrepository.save(user);
		
	}
		
	
}
