package com.example.hibernate.controller;

import com.example.hibernate.entity.Passport;
import com.example.hibernate.entity.Student;
import com.example.hibernate.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void insert() {
        Student student = new Student();
        Passport passport = new Passport();
        passport.setNo("123");
        student.setName("udita");
        student.setPassport(passport);
        studentService.insert(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.findById(1);
    }
}
