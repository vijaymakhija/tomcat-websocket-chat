package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/testcont")
	public String getCustomers() {
		return "Burraaaaa";
	}
}
