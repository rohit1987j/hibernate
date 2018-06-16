package com.example.hibernate.repository;

import com.example.hibernate.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class ReviewRepository {
    @Autowired
    private EntityManager entityManager;

    public void addReview(Review review) {
        entityManager.persist(review);
    }
}
