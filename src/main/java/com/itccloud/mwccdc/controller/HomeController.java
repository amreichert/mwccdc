package com.itccloud.mwccdc.controller;

import org.springframework.stereotype.Controller;
import java.util.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.commons.csv.*;

@Controller 					//tells spring boot that this is a special class called controller class
public class HomeController {
	
	//processing request http://localhost:8080/
	@GetMapping("/")  			//this function processes any request that types in / at end of url
	public String index(Model model) {
		model.addAttribute("message", "Hello Alex");
		
		User user = new User("John Doe");       //create new user with the name John Doe
		model.addAttribute("user", user);
		
		return "index-form";
		
	}
	
	@GetMapping("/advance")  			//this function processes any request that types in / at end of url
	public String advance(Model model) {
		List<User> users1 = new ArrayList<User>(); 		//list
		users1.add(new User("John Doe"));
		users1.add(new User("Bob Doe"));
		users1.add(new User("Mary Kent"));
		
				//Map<String, User> users2 = new HashMap<String, User>();	//map
				//users2.put("John Doe", new User("John Doe"));
				//users2.put("Bob Doe", new User("Bob Doe"));
		
				//User[] users3 = new User[] {new User("John Doe"), new User("Bob Doe")};  //array
		
		model.addAttribute("users1", users1);		//sends list to the html page. ("name", list).  name is what you put in the html page
				//model.addAttribute("users2", users2);
				//model.addAttribute("users3", users3);
		return "advance-form";
		
	}
	
	@GetMapping("/home")  			//this function processes any request that types in / at end of url
	public String home(Model model) {
		
		return "home-form";
		
	}
	
	@GetMapping("/business1")  			//this function processes any request that types in / at end of url
	public String business1(Model model) {
		
		return "business1-form";
		
	}

	@GetMapping("bootstrap-home")  			//this function processes any request that types in / at end of url
	public String bootstrapHome(Model model) {
		
		return "bootstrap-home-form";
		
	}
	
	@GetMapping("bootstrap-feature1")  			//this function processes any request that types in / at end of url
	public String bootstrapFeature1(Model model) {
		
		return "bootstrap-feature1-form";
		
	}
}
