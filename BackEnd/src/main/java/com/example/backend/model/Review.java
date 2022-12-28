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
@SQLDelete(sql = "UPDATE TB_REVIEW SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE RNO = ?")
public class Review extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_REVIEW_GENERATOR"
    )
    @Column
    private Long rno;

    @Column
    private Integer moviecd;

    @Column
    private String username;

    @Column
    private String content;

    @Column
    private Double rating;
}
