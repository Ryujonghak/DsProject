package com.example.backend.controller;

import com.example.backend.model.Notice;
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
import java.util.Optional;
/**
 * packageName : com.example.simpledms.controller
 * fileName : QnaController
 * author : ryujonghak
 * date : 2022/11/09
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/09         ryujonghak          최초 생성
 */
@Slf4j
// CORS 보안 : 기본적으로 한사이트에서 포트를 달리 사용못함
// @CrossOrigin(허용할_사이트주소(Vue 사이트주소:포트)) : CORS 보안을 허용해주는 어노테이션
//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class QnaController {
    @Autowired
    QnaService qnaService;

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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/qna")
    public ResponseEntity<Object> getCustomerAll(@RequestParam String searchSelect,
                                                 @RequestParam(required = false) String searchKeyword,
                                                 @RequestParam(defaultValue = "0") int page,
                                                 @RequestParam(defaultValue = "3") int size) {
        try {
            //페이지 객체 정의
            Pageable pageable = PageRequest.of(page, size);
            Page<Qna> qnaPage;
            if (searchSelect.equals("name")) {
                qnaPage = qnaService.findAllByNameContaining(searchKeyword, pageable); // 페이징 처리된 함수
            } else {
                qnaPage = qnaService.findAllByTitleContaining(searchKeyword, pageable); // 페이징 처리된 함수
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
    public ResponseEntity<Object> createQna(@RequestBody Qna qna) {

        try {
            Qna qna2 = qnaService.save(qna);

            return new ResponseEntity<>(qna2, HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/qna/{qno}")
    public ResponseEntity<Object> getQnaId(@PathVariable int qno) {

        try {
            Optional<Qna> optionalQna = qnaService.findById(qno);

            if (optionalQna.isPresent() == true) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(optionalQna.get(), HttpStatus.OK);
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

    @PutMapping("/qna/{qno}")
    public ResponseEntity<Object> updateQna(@PathVariable int qno,
                                            @RequestBody Qna qna) {

        try {
            Qna qna2 = qnaService.save(qna);

            return new ResponseEntity<>(qna2, HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/qna/deletion/{qno}")
    public ResponseEntity<Object> deleteQna(@PathVariable int qno) {

        try {
            boolean bSuccess = qnaService.removeById(qno);

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
