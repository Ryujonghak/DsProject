package com.example.backend.repository;

import com.example.backend.model.Reservtion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservtionRepository extends JpaRepository<Reservtion, Integer> {
    Page<Reservtion> findAll(Pageable pageable);
}
