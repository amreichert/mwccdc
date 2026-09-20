package com.itccloud.mwccdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 					//tells spring boot that this is a special class called controller class
public class HomeController {
	
	//processing request http://localhost:8080/
	@GetMapping("/")  			//this function processes any request that types in / at end of url
	public String index() {
		return "index-form";
		
	}

}
