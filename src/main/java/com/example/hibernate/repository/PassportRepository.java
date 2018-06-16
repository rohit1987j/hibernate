package com.example.hibernate.repository;

import com.example.hibernate.entity.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class PassportRepository {
    @Autowired
    private EntityManager entityManager;
    public Passport findById(int id) {
        return entityManager.find(Passport.class, id);
    }
}