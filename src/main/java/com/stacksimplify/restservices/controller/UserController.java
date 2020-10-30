package com.stacksimplify.restservices.controller;

import java.util.List;

import java.util.Optional;
//hi
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.stacksimplify.restservices.services.UserService;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exception.UserNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RequestMapping(value="/users")
@RestController
public class UserController {

	@Autowired
	private UserService UserService;
	
	@GetMapping
	
	public List<User> getAllUsers(){
		
		return UserService.getAllUsers();
		
	}
	
	//create user
	@PostMapping
	public User createUser(@RequestBody User user) {
		return UserService.createUser(user);
	 	
	}
	
	
	// getUserById
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id){
		try {
			return UserService.getUserById(id);
		} catch (UserNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
		
		
	}
	
	//updateuserbyID
	@PutMapping("/{id}")
	public User updateUserById(@PathVariable("id") Long id, @RequestBody User user ) {
		
		try {
			
			return UserService.updateUserById(id, user);
			
		} catch (UserNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
		}
		
		
	}
	
	
	//deleteuserbyid
	
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		UserService.deleteUserById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
