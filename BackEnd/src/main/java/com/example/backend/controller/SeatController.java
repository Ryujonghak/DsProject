package com.example.backend.controller;

import com.example.backend.model.Seat;
import com.example.backend.service.SeatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class SeatController {
    @Autowired
    SeatService seatService;

    //    TODO : 철원 - 좌석 용 컨트롤러
    @GetMapping("/seat/allSeat")
    public ResponseEntity<Object> getAllSeats() {

        try {
            List<Seat> seatList = seatService.findAll();

            if (seatList.isEmpty() == false) {
                return new ResponseEntity<>(seatList, HttpStatus.OK);
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

    @GetMapping("/seat/{scno}")
    public ResponseEntity<Object> findAllByScno(@PathVariable Long scno) {

        try {
            List<Seat> seatList = seatService.findAllByScno(scno);

            if (seatList.isEmpty() == false) {
                return new ResponseEntity<>(seatList, HttpStatus.OK);
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

    @PutMapping("/seat/setSeat/{seatposition}/{scno}/{seatyn}")
    public ResponseEntity<Object> updateSeat(@PathVariable String seatposition, @PathVariable Long scno, @PathVariable String seatyn) {

        try {
            Seat targetSeat = seatService.updateSeat(seatposition, scno, seatyn);
            targetSeat.setSeatyn(seatyn);

            if (targetSeat.getSeatposition().equals(seatposition) && targetSeat.getSeatyn().equals(seatyn)) {
                return new ResponseEntity<>(targetSeat, HttpStatus.OK);
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

    //     TODO : SEATYN 상태로 리스트 검색.
    @GetMapping("/seat/seatstatus/{seatyn}")
    public ResponseEntity<Object> findSeatStatus(@PathVariable String seatyn) {

        try {
            List<Seat> statuslist = seatService.findBySeatStatus(seatyn);

            if (statuslist.isEmpty() == false) {
                return new ResponseEntity<>(statuslist, HttpStatus.OK);
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

    @PostMapping("/seat")
    public ResponseEntity<Object> addSeat(@RequestBody Seat seat) {
        try {
            Seat newSeat = seatService.createSeat(seat);

            return new ResponseEntity<>(newSeat, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
