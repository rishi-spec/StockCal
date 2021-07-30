package com.shree.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/first")
public class WelcomeController {
	
	
@GetMapping("/welcome")
public String welcome( String name) {
		
		
			return "Welcome to Rest Client";
			
		
			
	
		
		
	
	}

}
