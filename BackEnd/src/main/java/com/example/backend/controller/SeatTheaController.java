package com.example.backend.controller;

import com.example.backend.dto.SeatDto;
import com.example.backend.service.TheaterSeatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
// CORS 보안 : 기본적으로 한사이트에서 포트를 달리 사용못함
// @CrossOrigin(허용할_사이트주소(Vue 사이트주소:포트)) : CORS 보안을 허용해주는 어노테이션
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class SeatTheaController {

    @Autowired
    TheaterSeatService theaterSeatService;

    //    TODO : 철원 - 좌석 용 컨트롤러
//     극장,좌석 초기화 = OpenningTheater()
    @PostMapping("/opentheater/")
    public ResponseEntity<Object> OpenningTheater() {

        try {
            theaterSeatService.openningTheater();
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//     극장(TID) 검색으로 좌석 리스트(상태) 출력
    @GetMapping("/theater/allSeat")
    public ResponseEntity<Object> getAllSeats() {

        try {
            List<SeatDto> seatDtoList =  theaterSeatService.getAllSeats();

            if (seatDtoList.isEmpty() == false) {
                return new ResponseEntity<>(seatDtoList, HttpStatus.OK);
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


//    TODO : 철원, 좌석 상태 변경 (N->Y / Y->N)
//    URL EX ) http://localhost:8080/api/theater/setSeat/3F8/Y

    @PutMapping("/theater/setSeat/{seatposition}/{seatyn}")
    public ResponseEntity<Object> updateSeat(@PathVariable String seatposition, @PathVariable String seatyn) {

        try {
            SeatDto seatDto = theaterSeatService.seatUpdate(seatposition, seatyn);

            if (seatDto.getSeatposition().equals(seatposition)) {
                return new ResponseEntity<>(seatDto, HttpStatus.OK);
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
