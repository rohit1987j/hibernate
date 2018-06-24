package com.example.hibernate.repository;

import com.example.hibernate.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}