package com.example.backend.service;

import com.example.backend.model.Reserv;
import com.example.backend.repository.ResrvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservService {
    @Autowired
    ResrvRepository resrvRepository;

    public List<Reserv> findAllList() {
        List<Reserv> reservList = resrvRepository.findAll();

        return reservList;
    }

    public Page<Reserv> findByMoviecdContaining(Integer moviecd, Pageable pageable) {
        Page<Reserv> reservPage = resrvRepository.findByMoviecdContaining(moviecd, pageable);

        return reservPage;
    }

    public Optional<Reserv> findbyReservno(Long reservno) {
        Optional<Reserv> reservOptional = resrvRepository.findbyReservno(reservno);

        return reservOptional;
    }
}
