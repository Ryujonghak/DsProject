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
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api")
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @GetMapping("/notice")
    public ResponseEntity<Object> getAllList() {
        try {
            List<Notice> noticeList = noticeService.findAllList();
            if (noticeList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(noticeList, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/notice/page1")
    public ResponseEntity<Object> getPage1(@RequestParam(required = false) String title,
                                          @RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Notice> noticePage = noticeService.findByTitleContaining(title, pageable);

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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/notice/page2")
    public ResponseEntity<Object> getPage2(@RequestParam(required = false) String type,
                                          @RequestParam(defaultValue = "0") int page,
                                          @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Notice> noticePage = noticeService.findByTypeContaining(type, pageable);

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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/notice/{qno}")
    public ResponseEntity<Object> Optional_findByQno(@PathVariable Long qno) {
        try {
            Optional<Notice> noticeOptional = noticeService.findByQno(qno);
            if (noticeOptional.isPresent()) {
                return new ResponseEntity<>(noticeOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/notice/{title}")
    public ResponseEntity<Object> getNotice(@PathVariable String title) {
        try {
            Optional<Notice> noticeOptional = noticeService.findByTitle(title);
            if (noticeOptional.isPresent()) {
                return new ResponseEntity<>(noticeOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
