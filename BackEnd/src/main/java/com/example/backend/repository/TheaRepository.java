package com.example.backend.repository;

import com.example.backend.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaRepository extends JpaRepository<Theater, Long> {
//    Optional<Thea> findByMoviecd(Long moviecd);

//    Page<Thea> findAllByMoviecdContaining(Long moviecd, Pageable pageable);
}
