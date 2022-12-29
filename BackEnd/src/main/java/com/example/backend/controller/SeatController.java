package com.example.backend.controller;

import com.example.backend.model.Seat;
import com.example.backend.service.SeatService;
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
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api")
public class SeatController {
    @Autowired
    SeatService seatService;

    @GetMapping("/seat")
    public ResponseEntity<Object> getAllList() {
        try {
            List<Seat> seatList = seatService.findAllList();
            if (seatList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(seatList, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/seat/page1")
    public ResponseEntity<Object> getPage1(@RequestParam(required = false) String theaterid,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Seat> seatPage = seatService.findAllByTHEATERIDContaining(theaterid, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("seat", seatPage.getContent());
            response.put("currentPage", seatPage.getNumber());
            response.put("totalItems", seatPage.getTotalElements());
            response.put("totalPages", seatPage.getTotalPages());

            if (seatPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/thea/{theaterid}")
    public ResponseEntity<Object> Optional_findByQno(@PathVariable String theaterid) {
        try {
            Optional<Seat> seatOptional = seatService.findByTHEATERID(theaterid);
            if (seatOptional.isPresent()) {
                return new ResponseEntity<>(seatOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
