package com.example.hibernate.controller;

import com.example.hibernate.dto.ReviewDto;
import com.example.hibernate.entity.Course;
import com.example.hibernate.entity.Review;
import com.example.hibernate.entity.Student;
import com.example.hibernate.services.CourseService;
import com.example.hibernate.services.ReviewService;
import com.example.hibernate.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @RequestMapping(path = "/review", method = RequestMethod.POST)
    private void save(@Valid @RequestBody ReviewDto reviewDto) {
        Review review = new Review();
        review.setDescription(reviewDto.getDescription());
        review.setRating(reviewDto.getRating());
        Course course = courseService.findById(reviewDto.getCourseId());
        Student student = studentService.findById(reviewDto.getStudentId());
        review.setCourse(course);
        review.setStudent(student);
        reviewService.save(review);
    }
}
