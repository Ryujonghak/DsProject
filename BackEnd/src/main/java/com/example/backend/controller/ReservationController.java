package com.example.backend.controller;

import com.example.backend.dto.MoviedetailReservationDto;
import com.example.backend.model.Reservation;
import com.example.backend.service.ReservationService;
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
public class ReservationController {
    @Autowired
    ReservationService reservationService;

//    public

    @GetMapping("/reservation/all")
    public ResponseEntity<Object> getAll(@RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Reservation> reservationPage = reservationService.findAllRes(pageable);


            Map<String, Object> response = new HashMap<>();
            response.put("reservation", reservationPage.getContent());
            response.put("currentPage", reservationPage.getNumber());
            response.put("totalItems", reservationPage.getTotalElements());
            response.put("totalPages", reservationPage.getTotalPages());

            if (reservationPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/reservation/search")
    public ResponseEntity<Object> findAllByRusername(@RequestParam(required = false) String rusername,
                                                     @RequestParam(defaultValue = "0") int page,
                                                     @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Reservation> reservationPage = reservationService.findAllByRusername(rusername, pageable);


            Map<String, Object> response = new HashMap<>();
            response.put("reservation", reservationPage.getContent());
            response.put("currentPage", reservationPage.getNumber());
            response.put("totalItems", reservationPage.getTotalElements());
            response.put("totalPages", reservationPage.getTotalPages());

            if (reservationPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/reservation/searchById/{reservno}")
    public ResponseEntity<Object> getById(@PathVariable Long reservno) {
        try {
            List<Reservation> reservationList = reservationService.findByReservno(reservno);

            if (reservationList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(reservationList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/reservation/mylist/{reservno}")
    public ResponseEntity<Object> ResList(@PathVariable Long reservno) {
        try {
            List<MoviedetailReservationDto> moviedetailReservationDtoList = reservationService.ResList(reservno);

            if (moviedetailReservationDtoList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(moviedetailReservationDtoList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/reservation/mypage")
    public ResponseEntity<Object> getAll(
            @RequestParam(required = false) Long reservno,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<MoviedetailReservationDto> reservationPage = reservationService.ResPage(reservno, pageable);


            Map<String, Object> response = new HashMap<>();
            response.put("reservation", reservationPage.getContent());
            response.put("currentPage", reservationPage.getNumber());
            response.put("totalItems", reservationPage.getTotalElements());
            response.put("totalPages", reservationPage.getTotalPages());

            if (reservationPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/reservation/{username}")
    public ResponseEntity<Object> create(@PathVariable String username,
                                         @RequestBody Reservation reservation) {
        try {
            log.debug("-------------- create 시작 ----------");
            log.debug(username);
            log.debug(String.valueOf(reservation));

            Reservation newReservation = reservationService.save(username, reservation);

            return new ResponseEntity<>(newReservation, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/reservation/{reservno}")
    public ResponseEntity<Object> update(@PathVariable Long reservno,
                                         @RequestBody String username,
                                         @RequestBody Reservation reservation) {
        try {
            Reservation newReservation = reservationService.save(username, reservation);

            return new ResponseEntity<>(newReservation, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/reservation/deletion/{reservno}")
    public ResponseEntity<Object> delete(@PathVariable Long reservno) {
        try {
            boolean delSuccess = reservationService.removeById(reservno);
            if (delSuccess) {
//                삭제 성공시
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
//                삭제 실패시 (삭제할 데이터가 없음.)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage()); // 디버그 확인용
//            서버 접속 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
