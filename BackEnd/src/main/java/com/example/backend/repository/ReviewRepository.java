package com.example.backend.repository;

import com.example.backend.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Page<Review> findAllByMovienmContainingOrderByInsertTime(String movienm, Pageable pageable);
    Page<Review> findAllByRwuserContainingOrderByInsertTime(String rwuser, Pageable pageable);

    Page<Review> findByMoviecd(String moviecd, Pageable pageable);
}
