package com.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping(value = "/home")
	public String home() {
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping(value = "/valueTest")
	public String valueTest() {
		String value = "Testing String ..";
		return value;
	}
}