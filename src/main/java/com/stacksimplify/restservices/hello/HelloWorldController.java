package com.stacksimplify.restservices.hello;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
//controller
@RestController
public class HelloWorldController {

	@Autowired
	private ResourceBundleMessageSource messageSource;
	
	//simple method
	//URI -/helloworld
	//GET 
	//@RequestMapping(method = RequestMethod.GET,path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "khushi is mad";
		
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("khush","Dixit","Bangalore");
	}
	
	
	@GetMapping("/hello-int")
	public String getMessagesInI18Format(@RequestHeader(name = "Accept-Language",required=false) String locale) {
		
		return messageSource.getMessage("label.hello",null, new Locale(locale));
		
	}
}
