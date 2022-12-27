package com.example.backend.service;

import com.example.backend.dto.response.ScheMovieDto;
import com.example.backend.model.Sche;
import com.example.backend.repository.ScheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheService {
    @Autowired
    ScheRepository scheRepository;

    public List<Sche> findAllList() {
        List<Sche> scheList = scheRepository.findAll();

        return scheList;
    }

    public Page<Sche> findAllPage(Pageable pageable) {
        Page<Sche> schePage = scheRepository.findAll(pageable);

        return schePage;
    }

    public Optional<Sche> findByScno(Long id) {
        Optional<Sche> scheOptional = scheRepository.findByScno(id);

        return scheOptional;
    }

    public Page<ScheMovieDto> findAllByMoviecdContaining(Integer moviecd, Pageable pageable) {
        Page<ScheMovieDto> scheMovieDtoPage = scheRepository.findAllByMoviecdContaining(moviecd, pageable);

        return scheMovieDtoPage;
    }
}
