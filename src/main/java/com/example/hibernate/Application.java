package com.example.hibernate;

import com.example.hibernate.entity.Person;
import com.example.hibernate.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PersonService personService;

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Override public void run(String... args) throws Exception {
		Person person = new Person();
		person.setName("rohit");
		personService.insert(person);

		Person person1 = personService.findById(1);
		System.out.println(person1.getName());
	}
}
