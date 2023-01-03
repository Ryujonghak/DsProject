package com.example.backend.repository;

import com.example.backend.model.Reservtion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResrvRepository extends JpaRepository<Reservtion, Long> {
    Optional<Reservtion> findByReservno(Long reservno);
    Page<Reservtion> findByMoviecdContaining(Integer moviecd, Pageable pageable);

}
