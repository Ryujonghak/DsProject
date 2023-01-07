package com.example.backend.dto;

import com.example.backend.model.Seat;
import com.example.backend.model.Theater;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TheaterDto {

    private Long tid;
    private String location;
    private List<TheaterSeat> seats;


    public TheaterDto(Theater theater)
    {
        this.tid = theater.getTid();
        this.location = theater.getLocation();
        this.seats = TheaterSeat.theaterSeatList(theater.getSeatList());
    }



    @Getter
    static class TheaterSeat
    {
        private String seatposition;
        private String seatyn;

        static List<TheaterSeat> theaterSeatList(List<Seat> seats) {
            List<TheaterSeat> list = new ArrayList<>();
            seats.forEach(seat -> {
                list.add(new TheaterSeat(seat));
            });
            return list;
        }

        public TheaterSeat(Seat seat)
        {
            this.seatposition = seat.getSeatposition();
            this.seatyn = seat.getSeatyn();
        }

    }

}
