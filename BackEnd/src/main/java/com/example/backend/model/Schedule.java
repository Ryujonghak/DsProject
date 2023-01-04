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
        name = "SQ_SCHEDULE_GENERATOR"
        , sequenceName = "SQ_SCHEDULE"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_SCHEDULE")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_SCHEDULE SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE SID = ?")
public class Schedule {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE
                , generator = "SQ_SCHEDULE_GENERATOR"
        )
        @Column(columnDefinition = "NUMBER")
//        상영스케쥴 고유 ID
        private Integer sid;

        @Column(columnDefinition = "NUMBER")
//        상영관고유 ID (참조테이블: TB_THEATER)
        private Integer theaterid;

        @Column(columnDefinition = "VARCHAR(255)")
//        영화코드 (참조테이블: TB_MOVIE)
        private String moviecd;

        @Column(columnDefinition = "VARCHAR(255)")
//        영화제목 (참조테이블: TB_MOVIE)
        private String movienm;

        @Column(columnDefinition = "DATE")
//        상영시작시간
        private String starttime;

        @Column(columnDefinition = "DATE")
//        상영종료시간
        private String endtime;
}
