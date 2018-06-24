package com.example.hibernate.services;

import com.example.hibernate.entity.Course;
import com.example.hibernate.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public Course findCourse(int id) {
        return courseRepository.findById(id).get();
    }

    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }
}