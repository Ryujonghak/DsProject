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

    public Page<MoviedetailReservationDto> ResPage(Long reservno, Pageable pageable){
        Page<MoviedetailReservationDto> moviedetailReservationDtoPage = reservationRepository.ResPage(reservno, pageable);

        return moviedetailReservationDtoPage;
    }

    public Reservation save( Reservation reservation) {
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
