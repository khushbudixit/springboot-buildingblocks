package com.stacksimplify.restservices.controller;

import java.util.List;

import java.util.Optional;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.stacksimplify.restservices.repository.OrderRepo;
import com.stacksimplify.restservices.repository.userrepo;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.entities.order;
import com.stacksimplify.restservices.exception.UserNotFoundException;

@RestController
@RequestMapping(value="/users")
public class OrderController {
	
	@Autowired
	private userrepo userrepo;


	
	//get all orders
	@GetMapping("/{userid}/orders")
    public List<order> getAllOrders(@PathVariable Long userid) throws UserNotFoundException
    {
    	
    	Optional<User> user = userrepo.findById(userid);
    	
    	if(!user.isPresent()) {
    		
    		throw new UserNotFoundException("user not found");
    		
    	}
    	
    	return user.get().getOrder();
    }
    
 
    
    // create all orders
   
    /**
    public void createOrder(@PathVariable Long userid,@RequestBody Order order) {
    	
    	Optional<User> user1 = userrepo.findById(userid);
    	
    	if(!user1.isPresent()) {
    		
    		throw new UserNotFoundException("user not found");
    		
    		
    		User user = user1.get();
    		((com.stacksimplify.restservices.entities.order) order).setUser(user);
    		return OrderRepo.save((S) order);
    }

**/
    
    
















}


    
    
	
	
	
	
	
	

