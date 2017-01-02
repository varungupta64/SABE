package com.sa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.entity.Person;
import com.sa.service.PersonService;

@RestController
public class WelcomeController {

	@Autowired
	PersonService personService;
	
	@RequestMapping(value = "/")
	public String welcome(){
		return "Hello World!";
	}
	
	@RequestMapping(value = "/list")
	public List<Person> list(){
		return personService.findAll();
	}
}
