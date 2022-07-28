package com.simplilearn.project.service;

import java.util.List;

import com.simplilearn.project.model.User;

public interface UserService {
	
	public User findById(long theId);
	
	public User findByUsername(String theUsername);
	
	public User findByEmailAddress(String theEmailAddress);

	public List<User> findByHasSignedUp(Boolean theSignUpState);
	
	public List<User> findAll();
}
