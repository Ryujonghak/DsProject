package com.example.backend.controller;

import com.example.backend.model.Reservtion;
import com.example.backend.service.ReservitonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class ReservtionController {
    @Autowired
    ReservitonService reservitonService;

    @GetMapping("/reservtion")
    public ResponseEntity<Object> getAll(@RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);

            Page<Reservtion> reservPage;

            reservPage = reservitonService.findAll(pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("reservtion", reservPage.getContent());
            response.put("currentPage", reservPage.getNumber());
            response.put("totalItems", reservPage.getTotalElements());
            response.put("totalPages", reservPage.getTotalPages());

            if (reservPage.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/reservtion")
    public ResponseEntity<Object> create(@RequestBody Reservtion reservtion) {
        try {
            Reservtion newReservtion = reservitonService.save(reservtion);

            return new ResponseEntity<>(newReservtion, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/reservtion/{reservno}")
    public ResponseEntity<Object> update(@PathVariable Integer reservno, @RequestBody Reservtion reservtion) {
        try {
            Reservtion newReservtion = reservitonService.save(reservtion);

            return new ResponseEntity<>(newReservtion, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/reservtion/deletion/{reservno}")
    public ResponseEntity<Object> delete(@PathVariable Integer reservno) {
        try {
            boolean bSuccess = reservitonService.removeById(reservno);
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

