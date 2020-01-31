package com.revature.appuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/v2/hello")
	public String helloWorld() {
		return "Hi from Spring Boot!";
	}
	
}
