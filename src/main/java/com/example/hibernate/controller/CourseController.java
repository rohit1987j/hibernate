package com.example.hibernate.controller;

import com.example.hibernate.entity.Course;
import com.example.hibernate.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(path = "/course", method = RequestMethod.POST)
    public void addCourse(){
        Course course = new Course();
        course.setName("java");
        courseService.addCourse(course);
    }
}
