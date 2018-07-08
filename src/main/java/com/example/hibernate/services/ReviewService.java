package com.example.hibernate.services;

import com.example.hibernate.entity.Review;
import com.example.hibernate.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public void save(Review review) {
        reviewRepository.save(review);
    }

    public Review findById(int id) {
        return reviewRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
    }
}
