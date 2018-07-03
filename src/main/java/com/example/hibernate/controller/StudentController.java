package com.example.hibernate.controller;

import com.example.hibernate.dto.StudentDto;
import com.example.hibernate.entity.Passport;
import com.example.hibernate.entity.Student;
import com.example.hibernate.services.PassportService;
import com.example.hibernate.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private PassportService passportService;

    @PostMapping("/student")
    public void insert(@RequestBody StudentDto studentDto) {
        Student student = new Student();
        Passport passport = new Passport();
        passport.setNo(studentDto.getPassportNo());
        student.setName(studentDto.getName());
        student.setPassport(passport);
        studentService.insert(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") int id) {
        Student student = studentService.findById(id);
        System.out.println("1111");
        //student.getPassport();
        System.out.println("2222");
        return student;
    }

    @RequestMapping(value = "/passport/{id}", method = RequestMethod.GET)
    public Passport getPassport(@PathVariable("id") int id) {
        Passport passport = passportService.getPassport(id);
        System.out.println("1111");
        //passport.getStudent();
        System.out.println("2222");
        return passport;
    }
}