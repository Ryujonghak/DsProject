package com.example.backend.service;

import com.example.backend.model.Schedule;
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

    public List<Schedule> findAllList() {
        List<Schedule> scheduleList = scheRepository.findAll();

        return scheduleList;
    }

    public Page<Schedule> findAllPage(Pageable pageable) {
        Page<Schedule> schePage = scheRepository.findAll(pageable);

        return schePage;
    }

    public Optional<Schedule> findByScno(Long id) {
        Optional<Schedule> scheOptional = scheRepository.findByScno(id);

        return scheOptional;
    }

    public Page<Schedule> findAllByMoviecdContaining(Integer moviecd, Pageable pageable) {
        Page<Schedule> scheMovieDtoPage = scheRepository.findAllByMoviecdContaining(moviecd, pageable);

        return scheMovieDtoPage;
    }
}
