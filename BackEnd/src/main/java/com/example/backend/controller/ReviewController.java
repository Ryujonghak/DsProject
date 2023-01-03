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
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping("/review")
    public ResponseEntity<Object> getAllList() {
        try {
            List<Review> reviewList = reviewService.findAllList();
            if (reviewList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(reviewList, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/review/page1")
    public ResponseEntity<Object> getPage1(@RequestParam(required = false) Integer moviecd,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Review> reviewPage = reviewService.findAllByMoviecdContaining(moviecd, pageable);

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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/review/page2")
    public ResponseEntity<Object> getPage2(@RequestParam(required = false) String username,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Review> reviewPage = reviewService.findAllByUsernameContaining(username, pageable);

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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/review/{moviecd}")
    public ResponseEntity<Object> Optional_findByQno(@PathVariable Integer moviecd) {
        try {
            Optional<Review> reviewOptional = reviewService.findByMoviecd(moviecd);
            if (reviewOptional.isPresent()) {
                return new ResponseEntity<>(reviewOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/review/{username}")
    public ResponseEntity<Object> getNotice(@PathVariable String username) {
        try {
            Optional<Review> reviewOptional = reviewService.findByUsername(username);
            if (reviewOptional.isPresent()) {
                return new ResponseEntity<>(reviewOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//    @PostMapping("/review")
//    public ResponseEntity<Object> addReview(@RequestBody Review review) {
//        try {
//            Review newReview = reviewService
//        }
//    }



    @DeleteMapping("/review/delete/{rno}")
    public ResponseEntity<Object> delete(@PathVariable Long rno) {
        try {
           boolean delSuccess = reviewService.reviewDelete(rno);
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
