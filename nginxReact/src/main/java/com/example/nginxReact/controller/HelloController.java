package com.example.nginxReact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/api/test")
	public String test() {
		return "test api ";
	}
	
	@GetMapping("/api/test2")
	public String test2() { 
		return " test2 api ";
	}
}
