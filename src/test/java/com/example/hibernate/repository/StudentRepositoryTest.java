package com.example.hibernate.repository;

import com.example.hibernate.entity.Passport;
import com.example.hibernate.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;


import javax.validation.ConstraintViolationException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.example.hibernate.repository")
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test(expected = ConstraintViolationException.class)
    public void testThatInsertStudentThrowsConstraintViolationExceptionWhenNameAndPassportIsNull() {
        studentRepository.saveAndFlush(new Student());
    }

    @Test(expected = ConstraintViolationException.class)
    public void testThatInsertStudentThrowsConstraintViolationExceptionWhenNameIsNull() {
        Student student = new Student();
        Passport passport = new Passport();
        passport.setNo("test1234");
        student.setPassport(passport);
        studentRepository.saveAndFlush(student);
    }

    @Test
    public void testThatSaveIsSuccessfulWhenStudentDataIsValid() {
        Student student = new Student();
        student.setName("testStudent");
        Passport passport = new Passport();
        passport.setNo("12345");
        student.setPassport(passport);

        studentRepository.saveAndFlush(student);
        List<Student> list = studentRepository.findAll();
        assertThat(list.size()).isEqualTo(1);
        Student retrievedStudent = list.get(0);
        assertThat(retrievedStudent.getName()).isEqualTo("testStudent");
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void testThatSaveThrowsExceptionWhenWeTryToInsertTwoStudentsWithSamePassportNo() {
        Student student1 = new Student();
        student1.setName("test1");

        Student student2 = new Student();
        student2.setName("test2");

        Passport passport1 = new Passport();
        passport1.setNo("123");

        Passport passport2 = new Passport();
        passport2.setNo("123");

        student1.setPassport(passport1);
        student2.setPassport(passport2);

        studentRepository.saveAndFlush(student1);
        studentRepository.saveAndFlush(student2);
    }
}