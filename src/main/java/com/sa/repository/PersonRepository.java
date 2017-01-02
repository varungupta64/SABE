package com.sa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.sa.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	Page<Person> findAll(Pageable pageable);
}
