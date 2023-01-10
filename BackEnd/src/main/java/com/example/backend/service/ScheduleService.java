package com.example.backend.service;

import com.example.backend.model.Schedule;
import com.example.backend.repository.ScheduleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;

    public List<Schedule> findAll() {
        List<Schedule> scheduleList = scheduleRepository.findAll();

        return scheduleList;
    }

    public List<Schedule> findAllByMoviecd(String moviecd) {
        List<Schedule> scheduleList = scheduleRepository.findAllByMoviecd(moviecd);

        return scheduleList;
    }

    public List<Schedule> findAllByMoviecdAndStartday(String moviecd, String startday) {
        List<Schedule> scheduleList = scheduleRepository.findAllByMoviecdAndStartday(moviecd, startday);

        return scheduleList;
    }

    public List<Schedule> findByMoviecdAndStartdayAndStarttime(String moviecd, String startday, String starttime) {
        List<Schedule> scheduleList = scheduleRepository.findByMoviecdAndStartdayAndStarttime(moviecd, startday, starttime);

        return scheduleList;
    }

}
