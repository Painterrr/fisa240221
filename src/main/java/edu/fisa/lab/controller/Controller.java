package edu.fisa.lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("getdata")
	public String get() {
		System.out.println("** This is get method.");
		return "get method worked";
	}
}
