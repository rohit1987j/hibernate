package com.example.hibernate.controller;

import com.example.hibernate.dto.CourseDto;
import com.example.hibernate.entity.Course;
import com.example.hibernate.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(path = "/course", method = RequestMethod.POST)
    public void addCourse(@Valid @RequestBody CourseDto courseDto) {
        Course course = new Course();
        course.setName(courseDto.getName());
        courseService.save(course);
    }

    @RequestMapping(path = "/course/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        Course course = courseService.findById(id);
        course.addReview(null);
        courseService.save(course);
    }
}
