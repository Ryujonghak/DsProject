package com.example.backend.controller;

import com.example.backend.model.Notice;
import com.example.backend.model.Thea;
import com.example.backend.service.TheaService;
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
public class TheaController {
    @Autowired
    TheaService theaService;

    @GetMapping("/thea")
    public ResponseEntity<Object> getAllList() {
        try {
            List<Thea> theaList = theaService.findAllList();
            if (theaList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(theaList, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/thea/page1")
    public ResponseEntity<Object> getPage1(@RequestParam(required = false) Long moviecd,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Thea> theaPage = theaService.findAllByMoviecdContaining(moviecd, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("thea", theaPage.getContent());
            response.put("currentPage", theaPage.getNumber());
            response.put("totalItems", theaPage.getTotalElements());
            response.put("totalPages", theaPage.getTotalPages());

            if (theaPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/thea/{moviecd}")
    public ResponseEntity<Object> Optional_findByQno(@PathVariable Long moviecd) {
        try {
            Optional<Thea> theaOptional = theaService.findByMoviecd(moviecd);
            if (theaOptional.isPresent()) {
                return new ResponseEntity<>(theaOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
