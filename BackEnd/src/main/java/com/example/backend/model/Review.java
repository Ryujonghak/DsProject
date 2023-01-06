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
        name = "SQ_REVIEW_GENERATOR"
        , sequenceName = "SQ_REVIEW"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_REVIEW")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_REVIEW SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE RID = ?")
public class Review extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_REVIEW_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
//    리뷰순번 ID
    private Integer rid;

    @Column(columnDefinition = "VARCHAR2(255)")
//    리뷰작성자 ID
    private String rwuser;

    @Column(columnDefinition = "NUMBER")
//    예매고유번호
    private Integer reservno;

    @Column(columnDefinition = "VARCHAR2(255)")
//    영화코드
    private String moviecd;

    @Column(columnDefinition = "VARCHAR2(255)")
//    영화제목
    private String movienm;

    @Column(columnDefinition = "NUMBER")
//    유져평점
    private Integer rurating;

    @Column(columnDefinition = "VARCHAR2(4000)")
//    유저평
    private String rucontent;
}
