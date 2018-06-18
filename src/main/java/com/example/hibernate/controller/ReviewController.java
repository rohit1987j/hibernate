package com.example.hibernate.controller;

import com.example.hibernate.entity.Review;
import com.example.hibernate.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @RequestMapping(path = "/review", method = RequestMethod.POST)
    private void addReview() {
        Review review = new Review();
        review.setDescription("very good course");
        review.setRating(1);
        reviewService.addReview(review);
    }
}
