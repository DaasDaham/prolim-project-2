package com.simplilearn.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.project.model.User;
import com.simplilearn.project.repository.UserRepository;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User findById(long theId) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(theId);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	@Override
	public User findByUsername(String theUsername) {
		return this.userRepository.findByUsername(theUsername);
	}

	@Override
	public User findByEmailAddress(String theEmailAddress) {
		return this.userRepository.findByEmailAddress(theEmailAddress);
	}

	@Override
	public List<User> findByHasSignedUp(Boolean theSignUpState) {
		return this.userRepository.findByHasSignedUp(theSignUpState);
	}

}
