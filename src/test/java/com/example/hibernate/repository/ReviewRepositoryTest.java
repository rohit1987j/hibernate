package com.example.hibernate.repository;


import com.example.hibernate.entity.Review;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.hibernate.example.repository")
public class ReviewRepositoryTest {
    @Autowired
    private ReviewRepository reviewRepository;

    @Test(expected = DataIntegrityViolationException.class)
    public void testThatReviewRepositorySaveThrowsDataIntegrityViolationExceptionWhenCourseIsNull() {
        Review review = new Review();
        review.setDescription("");
        review.setRating(1);
        reviewRepository.saveAndFlush(review);
    }
}