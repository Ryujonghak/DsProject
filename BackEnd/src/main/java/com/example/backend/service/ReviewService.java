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

    public Page<Review> findAllByMovienmContainingOrderByRid(String movienm, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findAllByMovienmContainingOrderByRid(movienm, pageable);

        return reviewPage;
    }

    public Page<Review> findAllByRwuserContainingOrderByRid(String rwuser, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findAllByRwuserContainingOrderByRid(rwuser, pageable);

        return reviewPage;
    }

    public Page<Review> findByMoviecd(String moviecd, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findByMoviecd(moviecd, pageable);

        return reviewPage;
    }

    public Page<Review> findAllByMovienmOrderByRid(String moviecd, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findAllByMovienmOrderByRid(moviecd, pageable);

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
