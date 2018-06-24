package com.example.hibernate.repository;

import com.example.hibernate.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolationException;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.example.hibernate.repository")
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test(expected = ConstraintViolationException.class)
    public void testThatSaveCourseThrowsConstraintViolationExceptionWhenNameIsNull() {
        Course course = new Course();
        courseRepository.saveAndFlush(course);
    }
}