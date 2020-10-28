package com.stacksimplify.restservices.services;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.stacksimplify.restservices.entities.*;
import com.stacksimplify.restservices.exception.UserNotFoundException;
import com.stacksimplify.restservices.repository.userrepo;
@Service
public class UserService {

	@Autowired
	
	private userrepo userrepo;
	
	//getAllusers method
	public List<User> getAllUsers(){
		
		return userrepo.findAll();
	}
	
	//createuser method
	public User createUser(User user) {
		
		return userrepo.save(user);
		
	}
	
	//getuserbyid
	
	public Optional<User> getUserById(Long id) throws UserNotFoundException{
		Optional<User> user = userrepo.findById(id);
		if(!user.isPresent()) {
			
			throw new UserNotFoundException("User Not found");
			
		}
		
		return user;
	}
	
	//update user by id
	
	public User updateUserById(Long id,User user) throws UserNotFoundException {
		
		
		Optional<User> optionalUser = userrepo.findById(id);
		if(!optionalUser.isPresent()) {
			
			throw new UserNotFoundException("User Not found , Provide valid details");
			
		}
		
		user.setId(id);
		return userrepo.save(user);
		
	}
	
	//deleteuserbyid
	
	public void deleteUserById(long id) {
	
		Optional<User> optionalUser = userrepo.findById(id);
		if(!optionalUser.isPresent()) {
			
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"user not found in the repo");
			
		}
		
		userrepo.deleteById(id);
		
		
	}
	
	
	

}
