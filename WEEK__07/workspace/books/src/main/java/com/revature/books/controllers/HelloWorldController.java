package com.revature.books.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.books.models.Genre;

@Controller
public class HelloWorldController {
	
	/**
	 * Write a string to a ResponseEntity, which is then returned
	 * 
	 * This writes that String to the Response body
	 * @return A ResponseEntity containing the String 'Hello from Servlet!'
	 */
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public ResponseEntity<String> sayHello() {
		
		return new ResponseEntity<String>("Hello from Servlet!", HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/responsebodystring", method=RequestMethod.GET)
	@ResponseBody
	public String writeStringAsResponse() {
		return "Written as just a String";
	}
	
	@GetMapping("/listresp")
	@ResponseBody
	public List<String> writeListAsResp() {
		return Arrays.asList("HI", "FROM", "CONTROLLER");
	}
	
	@RequestMapping(value = "/writegenreresp", method=RequestMethod.GET)
	@ResponseBody
	public Genre writeGenreAsResp() {
		Genre genre = new Genre();
		genre.setName("test");
		genre.setRating(40);
		genre.setId(1);
		return genre;
	}
	
	@GetMapping("/redirectme")
	public String redirectExample() {
		return "redirect:/static/index.html";
	}
	
	//PathVariable example
	@ResponseBody
	@GetMapping("/pathvar/{myvar}")
	public String echo(@PathVariable String myvar) {
		return "You var: " + myvar;
	}

}
