package com.example.backend.controller;

import com.example.backend.model.Review;
import com.example.backend.service.ReviewService;
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
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping("/review")
    public ResponseEntity<Object> getAll(@RequestParam(required = false) String movienm,
                                         @RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Review> reviewPage;
            if (movienm == null) {
                movienm = "";
                reviewPage = reviewService.findAllByMovienmContainingOrderByRid(movienm, pageable);
            } else {
                reviewPage = reviewService.findAllByMovienmContainingOrderByRid(movienm, pageable);
            }

            Map<String, Object> response = new HashMap<>();
            response.put("review", reviewPage.getContent());
            response.put("currentPage", reviewPage.getNumber());
            response.put("totalItems", reviewPage.getTotalElements());
            response.put("totalPages", reviewPage.getTotalPages());

            if (reviewPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/review/movienm")
    public ResponseEntity<Object> findAllByMovienmOrderByRid(@RequestParam(required = false) String movienm,
                                                             @RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Review> reviewPage = reviewService.findAllByMovienmOrderByRid(movienm, pageable);


            Map<String, Object> response = new HashMap<>();
            response.put("review", reviewPage.getContent());
            response.put("currentPage", reviewPage.getNumber());
            response.put("totalItems", reviewPage.getTotalElements());
            response.put("totalPages", reviewPage.getTotalPages());

            if (reviewPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/review/moviecd")
    public ResponseEntity<Object> findAllByMoviecd(@RequestParam(required = false) String moviecd,
                                                @RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Review> reviewPage;
            if (moviecd == null) {
//                moivecd 변수 데이터가 없을 경우
                reviewPage = reviewService.findAll(pageable);
            } else {
//                moivecd 변수 데이터가 있을 경우
                reviewPage = reviewService.findAllByMoviecd(moviecd, pageable);
            }


            Map<String, Object> response = new HashMap<>();
            response.put("review", reviewPage.getContent());
            response.put("currentPage", reviewPage.getNumber());
            response.put("totalItems", reviewPage.getTotalElements());
            response.put("totalPages", reviewPage.getTotalPages());

            if (reviewPage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/review")
    public ResponseEntity<Object> create(@RequestBody Review review) {
        try {
            Review newReview = reviewService.save(review);

            return new ResponseEntity<>(newReview, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/review/{rid}")
    public ResponseEntity<Object> update(@PathVariable Integer rid, @RequestBody Review review) {
        try {
            Review newReview = reviewService.save(review);

            return new ResponseEntity<>(newReview, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/review/deletion/{rid}")
    public ResponseEntity<Object> delete(@PathVariable Integer rid) {
        try {
            boolean delSuccess = reviewService.removeById(rid);
            if (delSuccess) { // 삭제 성공시
                return new ResponseEntity<>(HttpStatus.OK); // 성공 메시지 전송
            } else {
//               삭제 실패 시 (삭제할 데이터가 없음.)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage()); // 디버그 확인용
//            서버 접속 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
