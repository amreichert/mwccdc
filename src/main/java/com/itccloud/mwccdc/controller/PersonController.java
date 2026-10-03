package com.itccloud.mwccdc.controller;

import org.springframework.stereotype.Controller;
import java.io.FileReader;
import java.util.*;
import java.io.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.commons.csv.*;

@Controller
public class PersonController {

	
@GetMapping("/persons-table")
public String display(Model model) throws IOException {
	
	List<Person> persons = new ArrayList<Person>();
	
	String root = "/home/ubuntu120/projects/mwccdc/src/main/resources/";		//file handling c:\\itc475Dev\\filehandling\\ for windows
	String filePath = root + "persons2.csv";					
	FileReader reader = new FileReader(filePath);
	
	CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT.withIgnoreSurroundingSpaces());  //commas separate the words into different groups
	for(CSVRecord record: parser) {    														
		Address address = new Address(record.get(3));                							
		Person person = new Person(record.get(0), record.get(1), record.get(2), address);
		
		persons.add(person);   //adds to person list object
		}
	
	model.addAttribute("persons", persons);
	
	return "persons-table";		//display html template 
	
	
}

@GetMapping("/persons")  			//this function processes any request that types in / at end of url
public String personsTable(Model model) {
	
	return "persons-home";
	
}

@GetMapping("/persons-about")  			//this function processes any request that types in / at end of url
public String personsAbout(Model model) {
	
	return "persons-about";
	
}

}
