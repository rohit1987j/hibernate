package com.example.hibernate.services;

import com.example.hibernate.PersonRepository;
import com.example.hibernate.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person findById(int id) {
		return personRepository.findById(id);
	}

	public void insert(Person person) {
		personRepository.insert(person);
	}
}
