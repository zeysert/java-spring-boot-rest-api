package com.rest.example.medium.restful_web_services.firstapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApiController {


	@GetMapping(path = "/hello-rest")
	public String helloREST() {
		return "Hello it's my first rest api"; 
	}
	
	@GetMapping(path = "/hello-rest-two")
	public String helloRESTTwo() {
		return "Hello it's my second rest api"; 
	}
	
	@GetMapping(path = "/hello-rest-WithClass")
	public WithClass helloRESTWithClass() {
		return new  WithClass("Hello it's my  rest api that created with class"); 
	}
	
	@GetMapping(path = "/hello-rest-WithMethod")
	public String helloRESTWithMethod() {
		return WithMethod("Hello it's my  rest api that created with method"); 
	}

	private String WithMethod(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
