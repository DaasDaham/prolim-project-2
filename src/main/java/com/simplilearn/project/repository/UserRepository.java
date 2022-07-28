package com.simplilearn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.project.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
	public User findById(long theId);
	
	public User findByUsername(String theUsername);
	
	public User findByEmailAddress(String theEmailAddress);

	public List<User> findByHasSignedUp(Boolean theSignUpState);
	
	public List<User> findAll();

}
