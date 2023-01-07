package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@SequenceGenerator(
        name = "SQ_THEA_GENERATOR"
        , sequenceName = "SQ_THEA"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_THEATER")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
//@Where(clause = "DELETE_YN = 'N'")
//@SQLDelete(sql = "UPDATE TB_THEATER SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE TID = ?")
public class Theater{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_THEA_GENERATOR")
    @Column(columnDefinition = "NUMBER")
    private Long tid;

    @Column(columnDefinition = "VARCHAR2(255)")
    private String location;

    @JsonIgnore
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<Seat> seatList = new ArrayList<>();

    public Theater(String location) {
        this.location = location;
    }

    public void addSeat(Seat seat)
    {
        seatList.add(seat);
        seat.setTheater(this);
    }

    public Theater getTid(Long tid)
    {
        Theater theater = new Theater();
        theater = theater.getTid(tid);
        return theater;

    }

}
