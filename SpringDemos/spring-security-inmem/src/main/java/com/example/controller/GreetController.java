package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetController {

	@GetMapping("/greet")
	public String greet() {
		return "Have a good day";
	}
	
// for user and admin
//http://localhost:8080/user/books/show
	@GetMapping("/user/books/show")
	public List<String> showbooks() {
		return Arrays.asList("java","jsp");
	}
	
	//for admin
	@GetMapping("/admin/books/in")
	public String addBooks() {
		return"added";
	}
}
	
