

package com.simplilearn.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.project.errors.UserNotFoundException;
import com.simplilearn.project.model.User;
import com.simplilearn.project.service.UserService;


@RestController
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/saadsportyshoes/user_api")
	public List<User> listAllUsers() {

		return this.userService.findAll();
	}
	
	@GetMapping(path = "/saadsportyshoes/user_api/id/{id}")
	public User findUserByID(@PathVariable long id) {
		
		User theUser = this.userService.findById(id);

		if (theUser == null) {
			throw new UserNotFoundException("User with following details not found - Id"+ id);
		}

		return theUser;
	}

	@GetMapping(path = "/saadsportyshoes/user_api/username/{username}")
	public User findUserByName(@PathVariable String username) {
		
		User theUser = this.userService.findByUsername(username);

		if (theUser == null) {
			throw new UserNotFoundException("User with following details not found - Username"+ username);
		}

		return theUser;
	}

		
	@GetMapping(path = "/saadsportyshoes/user_api/emailAddress/{emailAddress}")
	public User findUserByEmail(@PathVariable String emailAddress) {
	
		User theUser = this.userService.findByEmailAddress(emailAddress);

		if (theUser == null) {
			throw new UserNotFoundException("User with following details not found - emailAddress"+ emailAddress);
		}

		return theUser;
	}
	
	@GetMapping(path = "/saadsportyshoes/user_api/hasSignedUp/{signedUpState}")
	public List<User> findUserByHasSignedUp(@PathVariable Boolean signedUpState) {
	
		List<User> users = this.userService.findByHasSignedUp(signedUpState);

		if (users.size() <= 0) {
			throw new UserNotFoundException("User with following details not found - hasSignedUp"+ signedUpState);
		}

		return users;
	}
}
