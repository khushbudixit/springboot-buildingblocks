package com.stacksimplify.restservices.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.stacksimplify.restservices.entities.*;
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
	
	public Optional<User> getUserById(Long id) {
		Optional<User> user = userrepo.findById(id);
		return user;
	}
	
	//update user by id
	
	public User updateUserById(Long id,User user) {
		
		user.setId(id);
		return userrepo.save(user);
		
	}
	
	//deleteuserbyid
	
	public void deleteUserById(long id) {
		
		if(userrepo.findById(id).isPresent()) {
			userrepo.deleteById(id);
		}
		
		
	}
	
	
	

}
