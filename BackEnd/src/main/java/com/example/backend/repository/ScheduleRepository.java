package com.example.backend.repository;

import com.example.backend.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
//    List<Schedule> findAll();

    List<Schedule> findByScno(Long scno);

    List<Schedule> findAllByMoviecd(String moviecd);
    List<Schedule> findAllByMoviecdAndLocation(String moviecd, String location);

    List<Schedule> findAllByMoviecdAndLocationAndStartday(String moviecd, String location, String startday);

    List<Schedule> findByMoviecdAndLocationAndStartdayAndStarttime(String moviecd, String location, String startday, String starttime);
}