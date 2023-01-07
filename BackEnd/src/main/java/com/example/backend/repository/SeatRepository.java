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

//    public List<Seat> countByTidEquals(long tid);
//
//    @Query(value="select count(*) from tb_seat s where s.seatstatus like %:seatcondition% and s.tid = %:tid%",nativeQuery = true )
//    public List<Seat> countByTidAndSeatstatusEquals(long tid, String seatcondition);

//    public List<Seat> CountByTid(long tid);

//    Optional<Seat> findByTid(long tid);

    List<Seat> findAllBySeatyn(long tid);

    public Seat findAllBySeatposition(String seatposition);





}
