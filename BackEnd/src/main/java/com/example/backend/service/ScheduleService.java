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

    public List<Schedule> findAllByMoviecdAndLocation(String moviecd, String location) {
        List<Schedule> scheduleList = scheduleRepository.findAllByMoviecdAndLocation(moviecd, location);

        return scheduleList;
    }

    public List<Schedule> findAllByMoviecdAndLocationAndStartday(String moviecd, String location, String startday) {
        List<Schedule> scheduleList = scheduleRepository.findAllByMoviecdAndLocationAndStartday(moviecd, location, startday);

        return scheduleList;
    }

    public List<Schedule> findByMoviecdAndLocationAndStartdayAndStarttime(String moviecd, String location, String startday, String starttime) {
        List<Schedule> scheduleList = scheduleRepository.findByMoviecdAndLocationAndStartdayAndStarttime(moviecd, location, startday, starttime);

        return scheduleList;
    }

    public Schedule save(Schedule schedule) {
        Schedule newSchedule = scheduleRepository.save(schedule);

        return newSchedule;
    }

    public boolean removeById(Long scno) {
        if (scheduleRepository.existsById(scno)) {
            scheduleRepository.deleteById(scno);

            return true;
        } else {
            return false;
        }
    }

}
