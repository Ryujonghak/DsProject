package com.example.backend.service;

import com.example.backend.model.Seat;
import com.example.backend.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    SeatRepository seatRepository;

    public List<Seat> findAll() {
        List<Seat> seatList = seatRepository.findAll();

        return seatList;
    }

    public Seat findAllBySeatpositionAndScno(String seatposition, Long scno) {
        Seat aimSeat = seatRepository.findAllBySeatpositionAndScno(seatposition, scno);
        return aimSeat;
    }


    public List<Seat> findBySeatStatus(String seatyn) {
        List<Seat> statuslist = seatRepository.findAllBySeatyn(seatyn);
        return statuslist;
    }

    public List<Seat> findAllByScno(Long scno) {
        List<Seat> statuslist = seatRepository.findAllByScno(scno);
        return statuslist;
    }

    public Seat updateSeat(String seatposition, Long scno, String seatyn) {
        Seat targetSeat = seatRepository.findBySeatpositionAndScno(seatposition, scno);
        targetSeat.setSeatyn(seatyn);
        return seatRepository.save(targetSeat);
    }

    public Seat createSeat(Seat seat) {
        Seat newSeat = seatRepository.save(seat);

        return newSeat;
    }

}
