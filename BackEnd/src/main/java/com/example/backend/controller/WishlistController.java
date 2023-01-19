package com.example.backend.controller;

import com.example.backend.model.Wishlist;
import com.example.backend.service.WishlistService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
            }
            return new ResponseEntity<>(wishlistList, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
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

