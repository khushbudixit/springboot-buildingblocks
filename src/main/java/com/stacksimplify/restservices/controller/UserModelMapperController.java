package com.stacksimplify.restservices.controller;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.stacksimplify.restservices.DTOS.UserMnDto;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exception.UserNotFoundException;
import com.stacksimplify.restservices.services.UserService;

@RestController
@RequestMapping("/modelmapper/users")
public class UserModelMapperController {

	
	
	@Autowired
	private UserService UserService;
	@Autowired
	private ModelMapper modelMapper;
	@GetMapping("/{id}")
	public UserMnDto getUserById(@PathVariable("id") Long id) throws UserNotFoundException{
		Optional<User> user1 = UserService.getUserById(id);
		
		if(!user1.isPresent()) {
			throw new UserNotFoundException("user not found");
		}
		
		User user=user1.get();
		
		UserMnDto userMnDto = modelMapper.map(user, UserMnDto.class);
		return userMnDto;
	}
}
