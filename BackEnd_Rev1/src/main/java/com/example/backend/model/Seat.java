package com.example.backend.model;

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
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SEAT_GENERATOR")
    @Column(columnDefinition = "NUMBER")
    private Long sno;

    @Column(columnDefinition = "VARCHAR2(4)")
    private String seatposition;

    @Column(columnDefinition = "VARCHAR2(1)", name = "SEATYN")
    private String seatyn;

    @Column(columnDefinition = "NUMBER")
    private Long scno;


    public Seat(String seatposition, String seatyn, Long scno) {
        this.seatposition = seatposition;
        this.seatyn = seatyn;
        this.scno = scno;
    }
}

