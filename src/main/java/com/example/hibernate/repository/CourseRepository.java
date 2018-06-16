package com.example.hibernate.repository;

import com.example.hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {
    @Autowired
    private EntityManager entityManager;

    public void addCourse(Course course) {
        entityManager.persist(course);
    }

    public Course findById(int id) {
        return entityManager.find(Course.class, id);
    }
}
