package com.example.backend.repository;

import com.example.backend.model.Reservation;
import com.example.backend.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Page<Reservation> findAll(Pageable pageable);
    Page<Reservation> findAllByUser(User user, Pageable pageable);

    List<Reservation> findByReservno(Long reservno);
}
