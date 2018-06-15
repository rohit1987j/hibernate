package com.example.hibernate.services;

import com.example.hibernate.entity.Student;
import com.example.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void insert(Student student){
        studentRepository.insert(student);
    }

    public void update(Student student) {
        studentRepository.update(student);
    }

    public Student findById(int id) {
        return studentRepository.findById(id);
    }
}
