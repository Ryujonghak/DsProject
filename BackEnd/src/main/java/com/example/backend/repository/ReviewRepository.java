package com.example.backend.repository;

import com.example.backend.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByMoviecd(Integer moviecd);
    Optional<Review> findByUsername(String username);

    Page<Review> findAllByMoviecdContaining(Integer moviecd, Pageable pageable);
    Page<Review> findAllByUsernameContaining(String username, Pageable pageable);
    Page<Review> findAllByMovienmContainingOrderByRno(String movienm, Pageable pageable);
}
