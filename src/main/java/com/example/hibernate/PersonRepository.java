package com.example.hibernate;

import com.example.hibernate.entity.Person;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public void update(Person person) {
		entityManager.merge(person);
	}

	public void insert(Person person) {
		entityManager.merge(person);
	}
}
