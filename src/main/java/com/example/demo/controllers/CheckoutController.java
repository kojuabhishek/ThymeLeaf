package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckoutController {
	
	@GetMapping("/checkout")
	public String checkout() {
		return "checkout";
	}
}