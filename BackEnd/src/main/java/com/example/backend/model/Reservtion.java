package com.example.backend.model;

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
        name = "SQ_RESERVTION_GENERATOR"
        , sequenceName = "SQ_RESERV"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_RESERVTION")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_RESERVTION SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE RESERVNO = ?")
public class Reservtion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_RESERV_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
//    예매고유번호
    private Integer reservno;

    @Column(columnDefinition = "VARCHAR2(255)" )
//    로그인ID (참조테이블: TB_USER)
    private String username;

    @Column(columnDefinition = "NUMBER")
//    상영스케쥴ID (참조테이블: TB_SCHEDULE)
    private Integer scheduleno;

    @Column(columnDefinition = "VARCHAR2(255)")
//    영화코드 (참조테이블: TB_SCHEDULE)
    private String moviecd;

    @Column(columnDefinition = "VARCHAR2(255)")
//    영화제목 (참조테이블: TB_SCHEDULE)
    private Integer movienm;

    @Column(columnDefinition = "NUMBER")
//    관람인원
    private Integer count;

    @Column(columnDefinition = "NUMBER")
//    결제금액
    private Integer price;

    @Column(columnDefinition = "DATE")
//    결제일시
    private String paiddate;

}
