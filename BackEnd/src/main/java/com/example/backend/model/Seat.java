package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "SQ_SEAT_GENERATOR"
        , sequenceName = "SQ_SEAT"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_SEAT")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
//@Where(clause = "DELETE_YN = 'N'")
//@SQLDelete(sql = "UPDATE TB_SEAT SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE SEATPOSITION = ?")
public class Seat {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SEAT_GENERATOR")
//    @Column(columnDefinition = "NUMBER")
//    private Integer sno;



    @Id
    @Column(columnDefinition = "VARCHAR2(4)", name = "SEATPOSITION")
    private String seatposition;

    @Column(columnDefinition = "VARCHAR2(1)", name = "SEATYN")
    private String seatyn;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tid", updatable = false)
    @JsonBackReference
    private Theater theater;



    public Seat(String seatposition, String status, Theater theater) {
        this.seatposition = seatposition;
        this.seatyn = status;
        setTheater(theater);
    }


    private Seat setSeat(String seatposition, String status, int tid)
    {
       Seat seat = new Seat();
       if(getSeatposition().substring(0).equals(Integer.toString(tid)) )
       {
           seat.seatposition = seatposition;
           seat.seatyn = status;
       }
       return seat;
    }

    public Seat(String seatposition, String status) {
        this.seatposition = seatposition;
        this.seatyn = status;
    }

    public Seat(String seatposition)
    {
        this.seatposition = seatposition;
    }






}
