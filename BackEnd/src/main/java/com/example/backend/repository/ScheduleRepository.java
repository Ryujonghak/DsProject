package com.example.backend.repository;

import com.example.backend.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
//    List<Schedule> findAll();

    List<Schedule> findByScno(Long scno);

    List<Schedule> findAllByMoviecd(String moviecd);

    List<Schedule> findAllByMoviecdAndStartday(String moviecd, String startday);

    List<Schedule> findByMoviecdAndStartdayAndStarttime(String moviecd, String startday, String starttime);
}