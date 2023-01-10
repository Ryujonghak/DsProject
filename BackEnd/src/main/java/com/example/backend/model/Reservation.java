package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        name = "SQ_RESERV_GENERATOR"
        , sequenceName = "SQ_RESERV"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_RESERVATION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_RESERVATION SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE RESERVNO = ?")
public class Reservation extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_RESERV_GENERATOR"
    )
    @Column
    private Long reservno;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "username")
//    @JsonBackReference
//    private User user;

    @Column
    private String name;

    @Column
    private String username;

    @Column
//    예매번호
    private String rno; // sysdate() + ?

    @Column
//    영화제목
    private String movienm;

    @Column
//    영화코드
    private String moviecd;

    @Column
//    영화 감상 인원
    private String rcount;
    @Column
//    영화 가격
    private String price;

    @Column
//    영화 결제 타임
    private String paiddate;

    @Column
//    영화 상영관
    private String location;

    @Column
//    영화 상영관
    private String seat;

    @Column
    private String startday;

    @Column
    private String starttime;

    @Column
    private String endday;

    @Column
    private String endtime;

    @Column
//    스케쥴 넘버
    private Long scno;
}


