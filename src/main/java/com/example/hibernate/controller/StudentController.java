package com.example.hibernate.controller;

import com.example.hibernate.dto.StudentDto;
import com.example.hibernate.entity.Passport;
import com.example.hibernate.entity.Student;
import com.example.hibernate.services.PassportService;
import com.example.hibernate.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private PassportService passportService;

    @PostMapping("/student")
    public void save(@Valid @RequestBody StudentDto studentDto) {
        Student student = new Student();
        Passport passport = new Passport();
        passport.setNo(studentDto.getPassportNo());
        student.setName(studentDto.getName());
        student.setPassport(passport);
        studentService.save(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student findById(@PathVariable("id") int id) {
        Student student = studentService.findById(id);
        return student;
    }

    @DeleteMapping(value = "/student/{id}")
    public void delete(@PathVariable("id") int id) {
        studentService.deleteById(id);
    }

    @RequestMapping(value = "/passport/{id}", method = RequestMethod.GET)
    public Passport getPassport(@PathVariable("id") int id) {
        Passport passport = passportService.getPassport(id);
        //passport.getStudent();
        return passport;
    }
}