package com.sa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.entity.Person;
import com.sa.repository.PersonRepository;

@Service("personService")
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	public List<Person> findAll(){
		List<Person> target = new ArrayList<>();
		personRepository.findAll().forEach(target::add);
		return target;
	}
}
