package com.example.backend.controller;

import com.example.backend.model.Schedule;
import com.example.backend.service.ScheService;
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
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api")
public class ScheController {
    @Autowired
    ScheService scheService;

    // TODO:  findAllList() 고쳐야됨

//    @GetMapping("/sche")
//    public ResponseEntity<Object> getAllList() {
//        try {
//            List<Sche> scheList = scheService.findAllList();
//
//            if (scheList.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            } else {
//                return new ResponseEntity<>(scheList, HttpStatus.OK);
//            }
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @GetMapping("/sche")
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Object> getUserAll(@RequestParam(required = false) Integer moviecd,
                                             @RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "3") int size
    ) {

        try {

//            페이지 변수 저장
            Pageable pageable = PageRequest.of(page, size);

            Page<Schedule> schePage;

            schePage = scheService.findAllByMoviecdContaining(moviecd, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("sche", schePage.getContent());
            response.put("currentPage", schePage.getNumber());
            response.put("totalItems", schePage.getTotalElements());
            response.put("totalPages", schePage.getTotalPages());

            if (schePage.isEmpty() == false) {
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

    @GetMapping("/sche/findByScno/{scno}")
    public ResponseEntity<Object> findByScno(@PathVariable Long scno) {
        try {
            Optional<Schedule> scheOptional = scheService.findByScno(scno);

            if (scheOptional.isPresent()) {
                return new ResponseEntity<>(scheOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}