package com.example.backend.dto;

import com.example.backend.model.Seat;
import com.example.backend.model.Theater;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatDto {
    private String seatposition;
    private String seatyn;

    private SeatTheater theater;


    public String getSeatyn() {
        return seatyn;
    }

    public String getSeatposition() {
        return seatposition;
    }

    public void setSeatposition(String seatposition) {
        this.seatposition = seatposition;
    }

    public void setSeatyn(String seatyn) {
        this.seatyn = seatyn;
    }

    //    public SeatDto toDto (Seat seat)
//    {
//        return new SeatDto(
//                seat.getSeatposition(),
//                seat.getSeatstatus(),
//                seat.getTheater().getTid()
//        );
//    }

    public SeatDto(Seat seat)
    {
        this.seatposition = seat.getSeatposition();
//        System.out.println("DTO에 들어온 포지션값 : " + getSeatposition());
        setSeatyn(seat.getSeatyn());
//        System.out.println("DTO에 들어온 상태값 : " + getSeatyn());
        this.theater = new SeatTheater(seat.getTheater());

    }
//
//    public SeatDto toDto(Seat seat)
//    {
//        return new SeatDto(
//                seat.getSeatposition(),
//                seat.getSeatstatus(),
//                seat.getTheater()
//        );
//
//    }

    @Getter
    public class SeatTheater
    {
        private long tid;
        private String location;

        public SeatTheater(Theater theater)
        {
            this.tid = theater.getTid();
            this.location = theater.getLocation();
        }
    }


}
