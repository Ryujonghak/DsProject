package com.example.backend.repository;

import com.example.backend.dto.MoviedetailReservationDto;
import com.example.backend.model.Reservation;
import com.example.backend.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Page<Reservation> findAll(Pageable pageable);
    Page<Reservation> findAllByUsername(String username, Pageable pageable);

    List<Reservation> findByReservno(Long reservno);

    @Query(value = "SELECT R.RESERVNO, R.RCOUNT, R.LOCATION, R.PRICE, R.SEAT, R.STARTTIME, " +
            "R.ENDTIME, DM.MOVIECD, DM.MOVIENM, DM.RAITING, DM.POSTERURLN, DM.OPENDT, DM.DIRECTORS, " +
            "DM.SHOWTM, DM.WATCHGRADENM " +
            "FROM DETAIL_MOVIE DM, TB_RESERVATION R " +
            "WHERE " +
            "DM.moviecd = r.moviecd AND r.reservno = :reservno ", nativeQuery = true)
    List<MoviedetailReservationDto> ResList(@Param("reservno") Long reservno);

    @Query(value = "SELECT R.RESERVNO, R.RCOUNT, R.LOCATION, R.PRICE, R.SEAT, R.STARTTIME, " +
            "R.ENDTIME, DM.MOVIECD, DM.MOVIENM, DM.RAITING, DM.POSTERURLN, DM.OPENDT, DM.DIRECTORS, " +
            "DM.SHOWTM, DM.WATCHGRADENM " +
            "FROM DETAIL_MOVIE DM, TB_RESERVATION R " +
            "WHERE " +
            "DM.moviecd = r.moviecd AND r.reservno = :reservno ", nativeQuery = true)
    Page<MoviedetailReservationDto> ResPage(@Param("reservno") Long reservno, Pageable pageable);

    @Query(value = "SELECT R.RESERVNO, R.RCOUNT, R.LOCATION, R.PRICE, R.SEAT, R.STARTTIME, " +
            "R.ENDTIME, DM.MOVIECD, DM.MOVIENM, DM.RAITING, DM.POSTERURLN, DM.OPENDT, DM.DIRECTORS, " +
            "DM.SHOWTM, DM.WATCHGRADENM " +
            "FROM DETAIL_MOVIE DM, TB_RESERVATION R " +
            "WHERE " +
            "DM.moviecd = r.moviecd AND r.username = :username ", nativeQuery = true)
    Page<MoviedetailReservationDto> ResPageTime(@Param("username") String username, Pageable pageable);
}
