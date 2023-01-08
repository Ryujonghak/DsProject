package com.example.backend.controller;

import com.example.backend.model.Wishlist;
import com.example.backend.service.WishlistService;
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
public class WishlistController {
    @Autowired
    WishlistService wishlistService;

    @GetMapping("/wishlist")
    public ResponseEntity<Object> findAll() {
        try {
            List<Wishlist> wishlistList = wishlistService.findAll();
            if (wishlistList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(wishlistList, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/wishlist/searchUsername/{username}")
    public ResponseEntity<Object> findAllByUsername(@PathVariable String username) {
        try {
            List<Wishlist> wishlistList = wishlistService.findAllByUsername(username);
            if (wishlistList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(wishlistList, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/wishlist/searchOpendt/{opendt}")
    public ResponseEntity<Object> findAllByOpendtContaining(@PathVariable String opendt) {
        try {
            List<Wishlist> wishlistList = wishlistService.findAllByOpendtContaining(opendt);
            if (wishlistList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(wishlistList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/wishlist/usernamePage")
    public ResponseEntity<Object> findAllByUsername(@RequestParam(required = false) String username,
                                                    @RequestParam(defaultValue = "0") int page,
                                                    @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
//            작성자 ID 검색 함수_류종학(23.01.08)
            Page<Wishlist> wishlistPage = wishlistService.findAllByUsername(username, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("wishlist", wishlistPage.getContent());
            response.put("currentPage", wishlistPage.getNumber());
            response.put("totalItems", wishlistPage.getTotalElements());
            response.put("totalPages", wishlistPage.getTotalPages());

            if (wishlistPage.isEmpty()) {
//                데이타가 없다면
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
//                데이터가 있다면
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception error) {
//            데이터 조회가 불가능할 경우
            log.debug(error.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/wishlist/opendtPage")
    public ResponseEntity<Object> findAllByOpendtContaining(@RequestParam(required = false) String opendt,
                                                            @RequestParam(defaultValue = "0") int page,
                                                            @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
//            작성자 ID 검색 함수_류종학(23.01.08)
            Page<Wishlist> wishlistPage = wishlistService.findAllByOpendtContaining(opendt, pageable);

            Map<String, Object> response = new HashMap<>();
            response.put("wishlist", wishlistPage.getContent());
            response.put("currentPage", wishlistPage.getNumber());
            response.put("totalItems", wishlistPage.getTotalElements());
            response.put("totalPages", wishlistPage.getTotalPages());

            if (wishlistPage.isEmpty()) {
//                데이타가 없다면
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
//                데이터가 있다면
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception error) {
//            데이터 조회가 불가능할 경우
            log.debug(error.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/wishlist/{username}/{moviecd}")
    public ResponseEntity<Object> find(@PathVariable String username, @PathVariable String moviecd) {
        try {
            List<Wishlist> wishlistList = wishlistService.findAllByUsernameAndAndMoviecd(username, moviecd);

            if (wishlistList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(wishlistList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/wishlist")
    public ResponseEntity<Object> create(@RequestBody Wishlist wishlist) {
        try {
            Wishlist newWishlist = wishlistService.save(wishlist);

            return new ResponseEntity<>(newWishlist, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/wishlist/{wid}")
    public ResponseEntity<Object> delete(@PathVariable Integer wid) {
        try {
            boolean bSuccess = wishlistService.removeById(wid);
            if (bSuccess == true) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

