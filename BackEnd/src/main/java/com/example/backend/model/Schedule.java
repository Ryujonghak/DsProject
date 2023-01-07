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

      @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "moviecd", updatable = false)
      private MovieDetail movieDetail;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "tid", updatable = false)
        private Theater theater;

        @Column
        private Date starttime;

        @Column
        private Date endtime;

       public String getMovieCd()
       {
               return this.movieDetail.getMoviecd();
       }

       public String getMovieNm()
       {
               return this.movieDetail.getMovienm();
       }

       public List<Seat> getSeats()
       {
               return this.theater.getSeatList();
       }

       public String getShowtm()
       {
               return this.movieDetail.getShowtm();
       }


}
