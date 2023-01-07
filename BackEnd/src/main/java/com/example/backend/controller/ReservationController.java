package com.example.backend.controller;

import com.example.backend.model.Reservation;
import com.example.backend.service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
    public ResponseEntity<Object> getAll(@RequestParam(required = false) String username,
                                         @RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Reservation> reservationPage = reservationService.findAllByUsername(username, pageable);


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
}
