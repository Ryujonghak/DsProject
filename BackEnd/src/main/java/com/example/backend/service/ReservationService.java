package com.example.backend.service;

import com.example.backend.dto.MoviedetailReservationDto;
import com.example.backend.model.Reservation;
import com.example.backend.model.User;
import com.example.backend.repository.ReservationRepository;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    UserRepository userRepository;


    public Page<Reservation> findAllRes(Pageable pageable) {
        Page<Reservation> reservationPage = reservationRepository.findAll(pageable);

        return reservationPage;
    }

    public Page<Reservation> findAllByUsername(String username, Pageable pageable) {
        Page<Reservation> reservationPage = reservationRepository.findAllByUsername(username, pageable);

        return reservationPage;
    }

    public List<Reservation> findByReservno(Long reservno) {
        List<Reservation> reservationList = reservationRepository.findByReservno(reservno);

        return reservationList;
    }

    public List<MoviedetailReservationDto> ResList(Long reservno){
        List<MoviedetailReservationDto> moviedetailReservationDtoList = reservationRepository.ResList(reservno);

        return moviedetailReservationDtoList;
    }

    public Page<MoviedetailReservationDto> ResPage(String username, Pageable pageable){
        Page<MoviedetailReservationDto> moviedetailReservationDtoPage = reservationRepository.ResPageTime(username, pageable);

        return moviedetailReservationDtoPage;
    }

    public Reservation save( Reservation reservation) {
        // 현재 날짜 구하기
        LocalDate now = LocalDate.now();

        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 포맷 적용
        String formatedNow = now.format(formatter);
        String rno =  formatedNow +reservation.getReservno();
        reservation.setRno(rno);

//        현재 로그인중인 계정 정보를 상입
        Reservation newReservation = reservationRepository.save(reservation);

        return newReservation;
    }

    public Boolean removeById(Long reservno) {
        if (reservationRepository.existsById(reservno)) {
            reservationRepository.deleteById(reservno);
            return true;
        } else {
            return false;
        }
    }
}
