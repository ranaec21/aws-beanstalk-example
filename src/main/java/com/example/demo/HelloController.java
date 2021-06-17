package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/ec2demo")
	public String sayHello(){
		return "demo for spring boot and EC2 ";
	}

}
