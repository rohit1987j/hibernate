package com.example.hibernate.services;

import com.example.hibernate.entity.Teacher;
import com.example.hibernate.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher findById(int id) {
        return teacherRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
    }

    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
