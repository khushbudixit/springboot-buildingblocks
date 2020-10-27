package com.stacksimplify.restservices.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.stacksimplify.restservices.services.UserService;
import com.stacksimplify.restservices.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class UserController {

	@Autowired
	private UserService UserService;
	
	@GetMapping("/users")
	
	public List<User> getAllUsers(){
		
		return UserService.getAllUsers();
		
	}
	
	//create user
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return UserService.createUser(user);
	 	
	}
	
	
	// getUserById
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id){
		return UserService.getUserById(id);
		
		
	}
	
	//updateuserbyID
	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable("id") Long id, @RequestBody User user ) {
		
		return UserService.updateUserById(id, user);
		
		
	}
	
	
	//deleteuserbyid
	
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		UserService.deleteUserById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
