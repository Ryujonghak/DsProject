package com.example.backend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@SequenceGenerator(
        name = "SQ_SCHE_GENERATOR"
        , sequenceName = "SQ_SCHE"
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
@SQLDelete(sql = "UPDATE TB_SCHEDULE SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE SCNO = ?")
public class Schedule extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_SCHE_GENERATOR"
    )
    @Column
    private Long scno;

//    TODO: Mapping 해제(230110_류종학)

//      @ManyToOne(fetch = FetchType.LAZY)
//      @JoinColumn(name = "moviecd", updatable = false)
//      private MovieDetail movieDetail;

//        @ManyToOne(fetch = FetchType.LAZY)
//        @JoinColumn(name = "tid", updatable = false)
//        private Theater theater;

    @Column
    private String moviecd;

    @Column
    private String movienm;

    @Column
    private String showtm;

    @Column
    private Date startday;

    @Column
    private String starttime;

    @Column
    private Date endday;

    @Column
    private Date endtime;

    @Column
    private Long tid;

}
