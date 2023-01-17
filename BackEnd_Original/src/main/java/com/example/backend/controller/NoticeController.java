package com.example.backend.controller;

import com.example.backend.model.Notice;
import com.example.backend.service.NoticeService;
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
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @GetMapping("/notice")
    public ResponseEntity<Object> pageGetAll(@RequestParam(defaultValue = "title") String searchSelect,
                                              @RequestParam(required = false) String searchKeyword,
                                              @RequestParam(defaultValue = "0") int page,
                                              @RequestParam(defaultValue = "3") int size) {
        try {
            log.debug("searchSelect : {}", searchSelect);
            log.debug("searchKeyword : {}", searchKeyword);
            Pageable pageable = PageRequest.of(page, size);
            Page<Notice> noticePage;
            if (searchSelect.equals("title")) {
//                searchKeyword = "";
                noticePage = noticeService.findAllByNtitleContainingOrderByInsertTime(searchKeyword, pageable);
            } else {
                noticePage = noticeService.findAllByNtypeContainingOrderByInsertTime(searchKeyword, pageable);
            }
            Map<String, Object> response = new HashMap<>();
            response.put("notice", noticePage.getContent());
            response.put("currentPage", noticePage.getNumber());
            response.put("totalItems", noticePage.getTotalElements());
            response.put("totalPages", noticePage.getTotalPages());

            if (noticePage.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/notice")
    public ResponseEntity<Object> create(@RequestBody Notice notice) {
        try {
            Notice newNotice = noticeService.save(notice);

            return new ResponseEntity<>(newNotice, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/notice/{nno}")
    public ResponseEntity<Object> update(@PathVariable Integer nno, @RequestBody Notice notice) {
        try {
            Notice newNotice = noticeService.save(notice);

            return new ResponseEntity<>(newNotice, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/notice/deletion/{nno}")
    public ResponseEntity<Object> delete(@PathVariable Integer nno) {
        try {
            boolean success = noticeService.removeById(nno);
            if (success) {
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
