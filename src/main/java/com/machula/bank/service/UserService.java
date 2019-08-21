package com.machula.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.machula.bank.entity.User;
import com.machula.bank.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAll(){
		return this.userRepository.findAll();
	}
	
	public void save(User user) {
		this.userRepository.save(user);
	}
	
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
