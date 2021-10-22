package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/service1")
@RestController
public class Service1Controller {
	
	@GetMapping("/test1")
	public String test1() {
		return "Test1 method of service1";
	}

	@GetMapping("/test2")
	public String test2() {
		return "Test2 method of service1";
	}

}
