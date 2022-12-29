package com.example.backend.repository;

import com.example.backend.model.Reserv;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResrvRepository extends JpaRepository<Reserv, Long> {
    Optional<Reserv> findByReservno(Long reservno);
    Page<Reserv> findByMoviecdContaining(Integer moviecd, Pageable pageable);

}
