package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@RequestMapping("/")
	@ResponseBody
	public String welcome(){
		return "Welcome ---- It works: SpringBootDemo2016";
	}
}
