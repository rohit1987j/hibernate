package com.example.hibernate.services;

import com.example.hibernate.entity.Student;
import com.example.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }

    public void update(Student student) {
        studentRepository.save(student);
    }

    public Student findById(int id) {
        return studentRepository.findById(id).orElseThrow(() ->new RuntimeException(""));
    }
}
