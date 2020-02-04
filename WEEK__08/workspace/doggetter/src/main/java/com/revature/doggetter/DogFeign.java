package com.revature.doggetter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "appdog")
public interface DogFeign {

	//(The GetMapping here will SEND an HTTP request rather than
	// setup an endpoint to receive HTTP requests)
	@GetMapping("/dogs")
	public String getDogs();
	
}
