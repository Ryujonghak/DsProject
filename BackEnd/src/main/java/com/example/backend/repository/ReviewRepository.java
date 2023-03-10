package com.example.backend.repository;

import com.example.backend.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Page<Review> findAllByMovienmContainingOrderByRidDesc(String movienm, Pageable pageable);
    Page<Review> findAllByRwuserContainingOrderByRid(String rwuser, Pageable pageable);

    Page<Review> findAllByMoviecdOrderByRidDesc(String moviecd, Pageable pageable);
    Page<Review> findAllByRwuserOrderByRidDesc(String rwuser, Pageable pageable);
    Page<Review> findAll(Pageable pageable);

    Page<Review> findAllByRwuserAndMoviecdOrderByInsertTime(String rwuser, String moviecd, Pageable pageable);

    Page<Review> findAllByMovienmOrderByRid(String movienm, Pageable pageable);
}
