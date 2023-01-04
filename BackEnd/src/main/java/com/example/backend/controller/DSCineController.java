package com.example.backend.controller;

import com.example.backend.model.BoxOffice;
import com.example.backend.model.MovieDetail;
import com.example.backend.service.DSCineService;
import lombok.extern.slf4j.Slf4j;

import org.modelmapper.ModelMapper;
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

/**
 * packageName : com.example.dscine.controller
 * fileName : DSCine
 * author : Moon
 * date : 2022-12-28-028
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-28-028         Moon          최초 생성
 */
@Slf4j
// CORS 보안 : 기본적으로 한사이트에서 포트를 달리 사용못함
// @CrossOrigin(허용할_사이트주소(Vue 사이트주소:포트)) : CORS 보안을 허용해주는 어노테이션
//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class DSCineController {

    @Autowired
    DSCineService dsCineService;


    //    http://localhost:8000/api/boxoffice/?movienm=영웅
    @GetMapping("/boxoffice")
    public ResponseEntity<Object> getBoxOfficeAll(@RequestParam(required = false) String movienm,
                                                  @RequestParam(defaultValue = "0") int page,
                                                  @RequestParam(defaultValue = "10") int size) {

        try {
//          Pageable객체 정의
            Pageable pageable = PageRequest.of(page, size);

//           PAGE 객체 정의
            Page<BoxOffice> boxOfficePage;

            if (movienm == null) {
                boxOfficePage = dsCineService.findallBoxOffice(pageable); // 페이징 처리되는 findAll()
            } else {
//            2) dname 에 값이 있을 경우 : 부서명 like 검색
                boxOfficePage = dsCineService.findAllByMovienmContainingBox(movienm, pageable);
            }

            // MAP에 넣어서 Client에 전송.
            Map<String, Object> response = new HashMap<>();
            response.put("BoxOffice", boxOfficePage.getContent());
            response.put("currentPage", boxOfficePage.getNumber());
            response.put("totalItems", boxOfficePage.getTotalElements());
            response.put("totalPages", boxOfficePage.getTotalPages());

            if (boxOfficePage.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(response, HttpStatus.OK);
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


    //    `/movie/?movienm=${movienm}&page=${page}&size=${size}`
    // http://localhost:8000/api/movie/?movienm=

    @GetMapping("/movie")
    public ResponseEntity<Object> findbyMovieNm(@RequestParam(required = false) String movienm,
                                                @RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "10") int size) {

        try {
//          Pageable객체 정의
            Pageable pageable = PageRequest.of(page, size);

//           PAGE 객체 정의
            Page<MovieDetail> movieDetailpage;

            if (movienm == null) {
                movieDetailpage = dsCineService.findallMovieDetail(pageable); // 페이징 처리되는 findAll()
            } else {
//            2) dname 에 값이 있을 경우 : 부서명 like 검색
                movieDetailpage = dsCineService.findAllByMovienmContaining(movienm, pageable);
            }
//            movieDetailpage = dsCineService.findAllByMovienmContaining(movienm, pageable);
            // MAP에 넣어서 Client에 전송.
            Map<String, Object> response = new HashMap<>();
            response.put("MovieDetail", movieDetailpage.getContent());
            response.put("currentPage", movieDetailpage.getNumber());
            response.put("totalItems", movieDetailpage.getTotalElements());
            response.put("totalPages", movieDetailpage.getTotalPages());

            if (movieDetailpage.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(response, HttpStatus.OK);
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


    @GetMapping("/movie/cd")
    public ResponseEntity<Object> findbyMovieCd(@RequestParam(required = false) String moviecd,
                                                @RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "10") int size) {

        try {
//          Pageable객체 정의
            Pageable pageable = PageRequest.of(page, size);

//           PAGE 객체 정의
            Page<MovieDetail> movieDetailpage;

            if (moviecd == null) {
                movieDetailpage = dsCineService.findallMovieDetail(pageable); // 페이징 처리되는 findAll()
            } else {
//            2) dname 에 값이 있을 경우 : 부서명 like 검색
                movieDetailpage = dsCineService.findAllByMovieCdContaitning(moviecd, pageable);
            }
//            movieDetailpage = dsCineService.findAllByMovienmContaining(movienm, pageable);
            // MAP에 넣어서 Client에 전송.
            Map<String, Object> response = new HashMap<>();
            response.put("MovieDetail", movieDetailpage.getContent());
            response.put("currentPage", movieDetailpage.getNumber());
            response.put("totalItems", movieDetailpage.getTotalElements());
            response.put("totalPages", movieDetailpage.getTotalPages());

            if (movieDetailpage.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(response, HttpStatus.OK);
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

    @GetMapping("/boxoffice/cd")
    public ResponseEntity<Object> findbyMovieCdBox(@RequestParam(required = false) String moviecd,
                                                   @RequestParam(defaultValue = "0") int page,
                                                   @RequestParam(defaultValue = "10") int size) {

        try {
//          Pageable객체 정의
            Pageable pageable = PageRequest.of(page, size);

//           PAGE 객체 정의
            Page<BoxOffice> boxOfficePage;

            if (moviecd == null) {
                boxOfficePage = dsCineService.findallBoxOffice(pageable); // 페이징 처리되는 findAll()
            } else {
//            2) dname 에 값이 있을 경우 : 부서명 like 검색
                boxOfficePage = dsCineService.findAllByMoviecdContainingBox(moviecd, pageable);
            }

            // MAP에 넣어서 Client에 전송.
            Map<String, Object> response = new HashMap<>();
            response.put("BoxOffice", boxOfficePage.getContent());
            response.put("currentPage", boxOfficePage.getNumber());
            response.put("totalItems", boxOfficePage.getTotalElements());
            response.put("totalPages", boxOfficePage.getTotalPages());

            if (boxOfficePage.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(response, HttpStatus.OK);
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

    @GetMapping("/movie/list")
    public ResponseEntity<Object> findAllMovieList() {
        try {
            List<MovieDetail> movieDetailList = dsCineService.findAll();
            if (movieDetailList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(movieDetailList, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    @GetMapping("/movie/all")
//    public ResponseEntity<Object> findbyAllMovie(@RequestParam(required = false) String movieNm,
//                                                @RequestParam(defaultValue = "0") int page,
//                                                @RequestParam(defaultValue = "10") int size)
//    {
//
//        try {
////          Pageable객체 정의
//            Pageable pageable = PageRequest.of(page, size);
//
////           PAGE 객체 정의
//            Page<MovieDetail> movieDetailpage;
//
////            if(dname == null) {
////                deptPage = deptService.findAll(pageable); // 페이징 처리되는 findAll()
////            } else {
//////            2) dname 에 값이 있을 경우 : 부서명 like 검색
////                deptPage = deptService.findAllByDnameContaining(dname, pageable);
////            }
//            movieDetailpage = dsCineService.findallMovieDetail(pageable);
//            // MAP에 넣어서 Client에 전송.
//            Map<String,Object> response = new HashMap<>();
//            response.put("MovieDetail", movieDetailpage.getContent());
//            response.put("currentPage", movieDetailpage.getNumber());
//            response.put("totalItems", movieDetailpage.getTotalElements());
//            response.put("totalPages", movieDetailpage.getTotalPages());
//
//            if (movieDetailpage.isEmpty() == false) {
////                데이터 + 성공 메세지 전송
//                return new ResponseEntity<>(response, HttpStatus.OK);
//            } else {
////                데이터 없음 메세지 전송(클라이언트)
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//        } catch (Exception e) {
//            log.debug(e.getMessage());
//            // 서버에러 발생 메세지 전송(클라이언트)
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @PostMapping("/movie")
    public ResponseEntity<Object> addMovie(@RequestBody MovieDetail movieDetail) {
        try {
            MovieDetail newMovieDetail = dsCineService.saveMoiveDetail(movieDetail);

            return new ResponseEntity<>(newMovieDetail, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/movie/{id}")
    public ResponseEntity<Object> updateMovie(@PathVariable Integer id, @RequestBody MovieDetail movieDetail) {
        try {
            MovieDetail newMovieDetail = dsCineService.saveMoiveDetail(movieDetail);

            return new ResponseEntity<>(newMovieDetail, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/movie/deletion/{id}")
    public ResponseEntity<Object> deleteMovie(@PathVariable Integer id) {
        try {
            boolean bSuccess = dsCineService.removeById(id);

            if (bSuccess == true) {
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