package com.example.hibernate.controller;

import com.example.hibernate.dto.TeacherDto;
import com.example.hibernate.entity.Teacher;
import com.example.hibernate.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/teacher")
    public void addTeacher(@Valid @RequestBody TeacherDto teacherDto) {
        Teacher teacher = new Teacher();
        teacher.setName(teacherDto.getName());
        teacherService.save(teacher);
    }
}