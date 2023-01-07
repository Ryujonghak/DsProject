package com.example.backend.service;

import com.example.backend.dto.SeatDto;
import com.example.backend.model.Seat;
import com.example.backend.model.Theater;
import com.example.backend.repository.SeatRepository;
import com.example.backend.repository.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.dscine.service
 * fileName : SeatService
 * author : Moon
 * date : 2023-01-06-006
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-01-06-006         Moon          최초 생성
 */
@RequiredArgsConstructor
@Service
public class TheaterSeatService {

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    TheaterRepository theaterRepository;

    public void openningTheater() {


        String[] loca = {"센텀시티", "서면", "부산대"};

        for (long i = 1; i < 4 + 1; i++) {
            Theater theater = new Theater(loca[((int) i - 1)]);

            char colKey = 'A';
            for (long j = 1; j < 7; j++) {
                for (long k = 0; k < 10; k++) {
                    String nowSeatTid = Long.toString(i);
                    String setSeat = nowSeatTid + colKey + k;
                    Seat seat = new Seat(setSeat, "N");
                    seat.setTheater(theater);
                    theaterRepository.save(theater);
                    seatRepository.save(seat);

                }
                colKey++;
            }

        }
    }

    //    TODO : 전체 좌석 조회
//    @Transactional(readOnly = true)
    public List<SeatDto> getAllSeats() {
        List<Seat> seats = new ArrayList<>();
        seats = seatRepository.findAll();
        System.out.println(seats.get(0).getSeatposition() + seats.get(0).getSeatyn());
        List<SeatDto> seatDtos = new ArrayList<>();
        seats.forEach(s -> seatDtos.add(new SeatDto(s)));
        System.out.println("DTO : " + seatDtos.get(0).getSeatposition() + seatDtos.get(0).getSeatyn());
        return seatDtos;
    }

    //    TODO : 좌석 상태 수정 (예약 - 빈좌석 상태 2가지로만 감) --> 삭제기능 불필요
    @Transactional
    public SeatDto seatUpdate(String seatposition, String status) {
        System.out.println("입력값  " + status);
        Seat seat = seatRepository.findAllBySeatposition(seatposition);
//        seat.setSeatposition(seatposition);
        seat.setSeatyn(status);
        System.out.println("seat에 상태가 들어갔나? " + seat.getSeatyn());
        return new SeatDto(seat);
    }

}








