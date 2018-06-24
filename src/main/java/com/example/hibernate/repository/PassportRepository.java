package com.example.hibernate.repository;

import com.example.hibernate.entity.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Id;

@Repository
@Transactional
public interface PassportRepository extends JpaRepository<Passport, Id> {
}