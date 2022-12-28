package com.example.backend.service;

import com.example.backend.model.Review;
import com.example.backend.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public List<Review> findAllList() {
        List<Review> reviewList = reviewRepository.findAll();

        return reviewList;
    }

    public Page<Review> findAllByMoviecdContaining(Integer moviecd, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findAllByMoviecdContaining(moviecd, pageable);

        return reviewPage;
    }

    public Page<Review> findAllByUsernameContaining(String username, Pageable pageable) {
        Page<Review> reviewPage = reviewRepository.findAllByUsernameContaining(username, pageable);

        return reviewPage;
    }

    public Optional<Review> findByMoviecd(Integer moviecd) {
        Optional<Review> reviewOptional = reviewRepository.findByMoviecd(moviecd);

        return reviewOptional;
    }

    public Optional<Review> findByUsername(String username) {
        Optional<Review> reviewOptional = reviewRepository.findByUsername(username);

        return reviewOptional;
    }
}
