package com.example.backend.controller;

import com.example.backend.dto.response.ScheMovieDto;
import com.example.backend.model.Reserv;
import com.example.backend.service.ReservService;
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
public class ReservController {
    @Autowired
    ReservService reservService;

    @GetMapping("/reserv")
    public ResponseEntity<Object> getAllList() {
        try {
            List<Reserv> reservList = reservService.findAllList();

            if (reservList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(reservList, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/reserv/page")
    public ResponseEntity<Object> getFindByMoviecdContaining(@RequestParam(required = false) Integer moviecd,
                                             @RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "3") int size) {

        try {

//            페이지 변수 저장
            Pageable pageable = PageRequest.of(page, size);

            Page<Reserv> reservPage;

            reservPage = reservService.findByMoviecdContaining(moviecd, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("reserv", reservPage.getContent());
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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/reserv/{reservno}")
    public ResponseEntity<Object> find(@PathVariable Long reservno) {
        try {
            Optional<Reserv> reservOptional = reservService.findByReservno(reservno);
            if (reservOptional.isPresent()) {
                return new ResponseEntity<>(reservOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
