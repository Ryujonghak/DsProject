package com.example.backend.repository;

import com.example.backend.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : com.example.dscine.repository
 * fileName : SeatRepository
 * author : Moon
 * date : 2023-01-05-005
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-01-05-005         Moon          최초 생성
 */
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    Seat findAllBySeatpositionAndScno(String seatposition, Long scno);

    List<Seat> findAllBySeatyn(String seatyn);

    Seat findBySeatpositionAndScno(String seatposition, Long scno);

    List<Seat> findAllByScno(Long scno);
}
