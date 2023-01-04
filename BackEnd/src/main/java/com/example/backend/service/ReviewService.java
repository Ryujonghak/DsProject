package com.example.backend.service;

import com.example.backend.model.Review;
import com.example.backend.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public Page<Review> findAllByMovienmContainingOrderByInsertTime(String movienm, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findAllByMovienmContainingOrderByInsertTime(movienm, pageable);

        return reviewPage;
    }

    public Page<Review> findAllByRwuserContainingOrderByInsertTime(String rwuser, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findAllByRwuserContainingOrderByInsertTime(rwuser, pageable);

        return reviewPage;
    }

    public Page<Review> findByMoviecd(String moviecd, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findByMoviecd(moviecd, pageable);

        return reviewPage;
    }

    public Review save(Review review) {
        Review newReview = reviewRepository.save(review);

        return newReview;
    }

    public boolean removeById(Integer rid) {
        if (reviewRepository.existsById(rid)) {
            reviewRepository.deleteById(rid);

            return true;
        } else {
            return false;
        }
    }
}
