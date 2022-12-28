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
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SEAT_GENERATOR")
//    @Column(columnDefinition = "NUMBER")
//    private Integer sno;
    @Id
    @Column(columnDefinition = "VARCHAR2(5)")
    private String THEATERID;

    @Column(columnDefinition = "VARCHAR2(2)")
    private String SEAT;

    @Column(columnDefinition = "VARCHAR2(30)")
    private String RESRVUID;

    @Column(columnDefinition = "VARCHAR2(1)")
    private String STATUSFLAG;
}
