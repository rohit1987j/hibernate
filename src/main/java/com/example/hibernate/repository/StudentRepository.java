package com.example.hibernate.repository;

import com.example.hibernate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@Repository
@Transactional
public class StudentRepository {

    @Autowired
    private EntityManager entityManager;

    public void insert(Student student) {
        entityManager.persist(student);
    }

    public void update(Student student){
        entityManager.merge(student);
    }

    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }
}
