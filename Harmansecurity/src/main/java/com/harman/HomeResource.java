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
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome user<h1/>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome admin<h1/>");
	}

}
