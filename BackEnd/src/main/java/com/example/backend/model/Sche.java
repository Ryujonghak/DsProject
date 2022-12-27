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
        name = "SQ_SCHE_GENERATOR"
        , sequenceName = "SQ_SCHE"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_SCHE")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_SCHE SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE SCNO = ?")
public class Sche extends BaseTimeEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE
                , generator = "SQ_SCHE_GENERATOR"
        )
        @Column
        private Long scno;

        @Column
        private Integer moviecd;

        @Column
        private String theaterid;

        @Column
        private String starttime;

        @Column
        private String endtime;

//        SCNO            NUMBER NOT NULL PRIMARY KEY,
//        MOVIECD          NUMBER,
//        THEATERID       VARCHAR2(100),
//        STARTTIME       VARCHAR2(20),
//        ENDTIME         VARCHAR2(20),
//        DELETE_YN       VARCHAR2(1) DEFAULT 'N',
//        INSERT_TIME     VARCHAR2(255),
//        UPDATE_TIME     VARCHAR2(255),
//        DELETE_TIME     VARCHAR2(255)
}
