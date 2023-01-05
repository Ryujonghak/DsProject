package com.example.backend.controller;

import com.example.backend.model.Qna;
import com.example.backend.service.QnaService;
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
public class QnaController {
    @Autowired
    QnaService qnaService;

    //    페이징처리 없이 전체검색_0102_류
    @GetMapping("/qna/list")
    public ResponseEntity<Object> getFindAllList() {
        try {
            List<Qna> qnaList = qnaService.findAllList();
            if (qnaList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(qnaList, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/qna")
    public ResponseEntity<Object> getAll(@RequestParam(defaultValue = "writer") String searchSelect,
                                                 @RequestParam(required = false) String searchKeyword,
                                                 @RequestParam(defaultValue = "0") int page,
                                                 @RequestParam(defaultValue = "3") int size) {
        try {
            //페이지 객체 정의
            Pageable pageable = PageRequest.of(page, size);
            Page<Qna> qnaPage;
            if (searchSelect.equals("title")) {
                if (searchKeyword == null) {
                    searchKeyword = "";
                    qnaPage = qnaService.findAllByQtitleContainingOrderByInsertTime(searchKeyword, pageable); // 페이징 처리된 함수
                } else {
                    qnaPage = qnaService.findAllByQwriterContainingOrderByInsertTime(searchKeyword, pageable); // 페이징 처리된 함수
                }
            } else {
                if (searchKeyword == null) {
                    searchKeyword = "";
                    qnaPage = qnaService.findAllByQwriterContainingOrderByInsertTime(searchKeyword, pageable); // 페이징 처리된 함수
                } else {
                    qnaPage = qnaService.findAllByQwriterContainingOrderByInsertTime(searchKeyword, pageable); // 페이징 처리된 함수
                }
            }
//            Map 자료구조에 넣어 전송함.
            Map<String, Object> response = new HashMap<String, Object>();
            response.put("qna", qnaPage.getContent());
            response.put("currentPage", qnaPage.getNumber());
            response.put("totalItems", qnaPage.getTotalElements());
            response.put("totalPages", qnaPage.getTotalPages());

            if (qnaPage.isEmpty() == false) {
                return new ResponseEntity<>(response, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/qna")
    public ResponseEntity<Object> create(@RequestBody Qna qna) {

        try {
            Qna newQna = qnaService.save(qna);

            return new ResponseEntity<>(newQna, HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/qna/{qid}")
    public ResponseEntity<Object> update(@PathVariable int qid,
                                            @RequestBody Qna qna) {

        try {
            Qna qna2 = qnaService.save(qna);

            return new ResponseEntity<>(qna2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/qna/deletion/{qid}")
    public ResponseEntity<Object> delete(@PathVariable int qid) {

        try {
            boolean bSuccess = qnaService.removeById(qid);

            if (bSuccess == true) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
