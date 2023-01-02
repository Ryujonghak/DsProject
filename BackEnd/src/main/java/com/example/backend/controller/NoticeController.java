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

    @GetMapping("/notice/search")
    public ResponseEntity<Object> getPage1(@RequestParam(defaultValue = "title") String searchSelect,
                                           @RequestParam(required = false) String searchKeyword,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "3") int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<Notice> noticePage;
            if (searchSelect.equals("content")) {
                noticePage = noticeService.findAllByContentContaining(searchKeyword, pageable);
            } else {
                noticePage = noticeService.findAllByTitleContaining(searchKeyword, pageable);
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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/notice/{no}")
    public ResponseEntity<Object> Optional_findByQno(@PathVariable Long no) {
        try {
            Optional<Notice> noticeOptional = noticeService.findByNo(no);
            if (noticeOptional.isPresent()) {
                return new ResponseEntity<>(noticeOptional.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
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
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/notice")
    public ResponseEntity<Object> create(@RequestBody Notice notice) {
        try {
            Notice notice2 = noticeService.save(notice);

            return new ResponseEntity<>(notice2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/notice/{no}")
    public ResponseEntity<Object> update(@PathVariable Long no, @RequestBody Notice notice) {
        try {
            Notice notice2 = noticeService.save(notice);

            return new ResponseEntity<>(notice2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/notice/deletion/{no}")
    public ResponseEntity<Object> delete(@PathVariable Long no) {
        try {
            boolean success = noticeService.removeId(no);
            if (success) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}