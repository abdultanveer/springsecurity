package com.harman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	//functionality -- resource
	//data -- resource
	
	@GetMapping("/")
	public String home() {
		return ("<h1>welcome<h1/>");
	}

}
