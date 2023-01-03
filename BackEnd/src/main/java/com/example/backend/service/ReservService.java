package com.example.backend.service;

import com.example.backend.model.Reservtion;
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

    public List<Reservtion> findAllList() {
        List<Reservtion> reservtionList = resrvRepository.findAll();

        return reservtionList;
    }

    public Page<Reservtion> findByMoviecdContaining(Integer moviecd, Pageable pageable) {
        Page<Reservtion> reservPage = resrvRepository.findByMoviecdContaining(moviecd, pageable);

        return reservPage;
    }

    public Optional<Reservtion> findByReservno(Long reservno) {
        Optional<Reservtion> reservOptional = resrvRepository.findByReservno(reservno);

        return reservOptional;
    }
}
