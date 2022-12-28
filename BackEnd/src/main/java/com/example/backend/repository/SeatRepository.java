package com.example.backend.repository;

import com.example.backend.model.Seat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatRepository extends JpaRepository<Seat, String> {
    Optional<Seat> findByTHEATERID(String theaterid);
    Page<Seat> findAllByTHEATERIDContaining(String theaterid, Pageable pageable);
}
