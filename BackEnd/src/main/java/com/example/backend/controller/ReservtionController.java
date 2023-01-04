package com.example.backend.controller;

import com.example.backend.service.ReservitonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class ReservtionController {
    @Autowired
    ReservitonService reservitonService;

//    public ResponseEntity<Object> getAll( @RequestParam(defaultValue = "0") int page,
//                                          @RequestParam(defaultValue = "3") int size) {
//        try {
//
//        }
//    }
}
