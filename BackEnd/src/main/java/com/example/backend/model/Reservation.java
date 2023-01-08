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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username")
    @JsonBackReference
    private User user;

    @Column
//    예매번호
    private String rno;

    @Column
//    영화제목
    private String movienm;

    @Column
//    영화코드
    private String moviecd;

    @Column
    private Integer rcount;
    @Column
    private Integer price;

    @Column
    private String paiddate;

    @Column
    private Long scno;

    @Column
    private String seatname;

    @Column
    private String location;

}

//    RESERVNO    NUMBER PRIMARY KEY,
//    USERNAME    VARCHAR2(255),
//    SCHEDULENO  NUMBER,
//    MOVIECD     VARCHAR2(255),
//    MOVIENM     VARCHAR2(255),
//    RCOUNT      NUMBER,
//    PRICE       NUMBER,
//    PAIDDATE    DATE



