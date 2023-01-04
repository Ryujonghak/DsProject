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
//@SequenceGenerator(
//        name = "SQ_SEAT_GENERATOR"
//        , sequenceName = "SQ_SEAT"
//        , initialValue = 1
//        , allocationSize = 1
//)
@Table(name = "TB_SEAT")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_SEAT SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE THEATERID = ?")
public class Seat extends BaseTimeEntity{
    @Id
    @Column(columnDefinition = "NUMBER")
//    극장고유번호 (참조테이블: TB_THEATER)
    private Integer THEATERID;

    @Column(columnDefinition = "VARCHAR2(2)")
//    좌석위치
    private String SEATPOSITION;

    @Column(columnDefinition = "VARCHAR2(1)")
//    좌석상태
    private String SEATSTATUS;
}
