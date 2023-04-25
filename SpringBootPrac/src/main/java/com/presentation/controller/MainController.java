package com.presentation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
//	@RequestMapping(value = "/home")
//	public String home() {
//		return "index.html";
//	}
	
	@ResponseBody
	@RequestMapping(value = "/valueTest", method = RequestMethod.GET)
	public String valueTest() {
		String value = "Testing String ..";
		
		System.out.println( "Log at Controller" + value);

		return value;
	}
}