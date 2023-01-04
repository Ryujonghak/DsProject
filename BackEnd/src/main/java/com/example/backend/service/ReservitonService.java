package com.example.backend.service;

import com.example.backend.model.Reservtion;
import com.example.backend.repository.ReservtionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReservitonService {
    @Autowired
    ReservtionRepository reservtionRepository;

    public Page<Reservtion> findAll(Pageable pageable) {
        Page<Reservtion> reservtionPage = reservtionRepository.findAll(pageable);

        return reservtionPage;
    }

    public Reservtion save(Reservtion reservtion) {
        Reservtion newReservtion = reservtionRepository.save(reservtion);

        return newReservtion;
    }

    public boolean removeById(Integer reservno) {
        if (reservtionRepository.existsById(reservno)) {
            reservtionRepository.deleteById(reservno);
            return true;
        } else {
            return false;
        }
    }
}
