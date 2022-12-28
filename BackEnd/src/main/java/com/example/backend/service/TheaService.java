package com.example.backend.service;

import com.example.backend.model.Thea;
import com.example.backend.repository.TheaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheaService {
    @Autowired
    TheaRepository theaRepository;

    public List<Thea> findAllList() {
        List<Thea> theaList = theaRepository.findAll();

        return theaList;
    }

    public Page<Thea> findAllByMoviecdContaining(Long moviecd, Pageable pageable) {
        Page<Thea> theaPage = theaRepository.findAllByMoviecdContaining(moviecd, pageable);

        return theaPage;
    }

    public Optional<Thea> findByMoviecd(Long moviecd) {
        Optional<Thea> theaOptional = theaRepository.findByMoviecd(moviecd);

        return theaOptional;
    }

}
