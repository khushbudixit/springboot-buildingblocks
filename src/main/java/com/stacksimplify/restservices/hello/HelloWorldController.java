package com.stacksimplify.restservices.hello;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
//controller
@RestController
public class HelloWorldController {

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
	
}
