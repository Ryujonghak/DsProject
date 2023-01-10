package com.example.backend.controller;

import com.example.backend.model.Schedule;
import com.example.backend.service.ScheduleService;
import com.example.backend.service.TheaterSeatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @Autowired
    TheaterSeatService theaterSeatService;

    @GetMapping("/schedule")
    public ResponseEntity<Object> getSchedule() {
        try {
            List<Schedule> scheduleList = scheduleService.findAll();

            if (scheduleList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(scheduleList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/schedule/searchMoviecd/{moviecd}")
    public ResponseEntity<Object> findAllByMoviecd(@PathVariable String moviecd) {
        try {
            List<Schedule> scheduleList = scheduleService.findAllByMoviecd(moviecd);

            if (scheduleList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(scheduleList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/schedule/searchMoviecdAndStartday/{moviecd}/{startday}")
    public ResponseEntity<Object> findAllByMoviecdAndStartday(@PathVariable String moviecd, @PathVariable String startday) {
        try {
            List<Schedule> scheduleList = scheduleService.findAllByMoviecdAndStartday(moviecd, startday);

            if (scheduleList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(scheduleList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/schedule/searchMoviecdAndStartdayAndStarttime/{moviecd}/{startday}/{starttime}")
    public ResponseEntity<Object> findByMoviecdAndStartdayAndStarttime(@PathVariable String moviecd,
                                                                       @PathVariable String startday,
                                                                       @PathVariable String starttime) {
        try {
            List<Schedule> scheduleList = scheduleService.findByMoviecdAndStartdayAndStarttime(moviecd, startday, starttime);

            if (scheduleList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(scheduleList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/schedule")
    public ResponseEntity<Object> create(@RequestBody Schedule schedule) {
        try {
            Schedule newSchedule = scheduleService.save(schedule);

            return new ResponseEntity<>(newSchedule, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/schedule/{scno}")
    public ResponseEntity<Object> update(@PathVariable Long scno, @RequestBody Schedule schedule) {
        try {
            Schedule newSchedule = scheduleService.save(schedule);

            return new ResponseEntity<>(newSchedule, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/schedule/{scno}")
    public ResponseEntity<Object> delete(@PathVariable Long scno) {
        try {
            boolean bSuccess = scheduleService.removeById(scno);

            if (bSuccess == true) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
