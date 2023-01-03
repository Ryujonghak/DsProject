package com.example.backend.service;

import com.example.backend.model.Theater;
import com.example.backend.repository.TheaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaService {
    @Autowired
    TheaRepository theaRepository;

    public List<Theater> findAllList() {
        List<Theater> theaterList = theaRepository.findAll();

        return theaterList;
    }

//    public Page<Thea> findAllByMoviecdContaining(Long moviecd, Pageable pageable) {
//        Page<Thea> theaPage = theaRepository.findAllByMoviecdContaining(moviecd, pageable);
//
//        return theaPage;
//    }
//
//    public Optional<Thea> findByMoviecd(Long moviecd) {
//        Optional<Thea> theaOptional = theaRepository.findByMoviecd(moviecd);
//
//        return theaOptional;
//    }

}
