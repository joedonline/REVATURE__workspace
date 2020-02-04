package com.revature.dogdiscover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DogdiscoverApplication {
	
	@Autowired
	EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(DogdiscoverApplication.class, args);
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi!";
	}
	
	@GetMapping("/appdogurl")
	public String returnAppDogUrl() {
		return eurekaClient.getNextServerFromEureka("appdog", false).getHomePageUrl();
		//return eurekaClient.getNextServerFromEureka("appdog", false).toString();
	}

}
