package com.revature.doggetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetterController {
	
	@Autowired
	DogFeign dogFeign;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}
	
	@GetMapping("/dogs")
	public String getDogsJsonFromAppDog() {
		return dogFeign.getDogs() + " FROM DOGGETTER";
	}
	
}
