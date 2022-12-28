package com.example.backend.repository;

import com.example.backend.model.Thea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TheaRepository extends JpaRepository<Thea, Long> {
    Optional<Thea> findByMoviecd(Long moviecd);

    Page<Thea> findAllByMoviecdContaining(Long moviecd, Pageable pageable);
}
