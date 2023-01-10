package com.example.backend.controller;

import com.example.backend.model.Schedule;
import com.example.backend.service.ScheduleService;
import com.example.backend.service.TheaterSeatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @Autowired
    TheaterSeatService theaterSeatService;

    @Autowired
    SeatTheaController seatTheaController;

    @GetMapping("/schedule/movienm")
    public ResponseEntity<Object> findAllByMovienmContaining(
            @RequestParam(required = false) String movienm,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Schedule> schedulePage = scheduleService.findAllByMovienmContaining(movienm, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("schedule", schedulePage.getContent());
            response.put("currentPage", schedulePage.getNumber());
            response.put("totalItems", schedulePage.getTotalElements());
            response.put("totalPages", schedulePage.getTotalPages());

            if (schedulePage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/schedule/location")
    public ResponseEntity<Object> findAllByLocation(
            @RequestParam(required = false) String location,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Schedule> schedulePage = scheduleService.findAllByLocation(location, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("schedule", schedulePage.getContent());
            response.put("currentPage", schedulePage.getNumber());
            response.put("totalItems", schedulePage.getTotalElements());
            response.put("totalPages", schedulePage.getTotalPages());

            if (schedulePage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


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

    @GetMapping("/schedule/searchMoviecdAndLocation/{moviecd}/{location}")
    public ResponseEntity<Object> findAllByMoviecdAndLocation(@PathVariable String moviecd, @PathVariable String location) {
        try {
            List<Schedule> scheduleList = scheduleService.findAllByMoviecdAndLocation(moviecd, location);

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

    @GetMapping("/schedule/searchMoviecdAndLocationAndStartday/{moviecd}/{location}/{startday}")
    public ResponseEntity<Object> findAllByMoviecdAndLocationAndStartday(@PathVariable String moviecd,
                                                                         @PathVariable String location,
                                                                         @PathVariable String startday
    ) {
        try {
            List<Schedule> scheduleList = scheduleService.findAllByMoviecdAndLocationAndStartday(moviecd, location, startday);

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

    @GetMapping("/schedule/searchMoviecdAndLocationAndStartdayAndStarttime/{moviecd}/{location}/{startday}/{starttime}")
    public ResponseEntity<Object> findByMoviecdAndLocationAndStartdayAndStarttime(@PathVariable String moviecd,
                                                                                  @PathVariable String location,
                                                                                  @PathVariable String startday,
                                                                                  @PathVariable String starttime
    ) {
        try {
            List<Schedule> scheduleList = scheduleService.findByMoviecdAndLocationAndStartdayAndStarttime(moviecd, location, startday, starttime);

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

            seatTheaController.OpenningTheater();


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
