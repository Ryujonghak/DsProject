package com.example.backend.service;

import com.example.backend.model.Seat;
import com.example.backend.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatService {
    @Autowired
    SeatRepository seatRepository;

    public List<Seat> findAllList() {
        List<Seat> seatList = seatRepository.findAll();

        return seatList;
    }

    public Page<Seat> findAllByTHEATERIDContaining(String theaterid, Pageable pageable) {
        Page<Seat> seatPage = seatRepository.findAllByTHEATERIDContaining(theaterid, pageable);

        return seatPage;
    }

    public Optional<Seat> findByTHEATERID(String theaterid) {
        Optional<Seat> seatOptional = seatRepository.findByTHEATERID(theaterid);

        return seatOptional;
    }

}
