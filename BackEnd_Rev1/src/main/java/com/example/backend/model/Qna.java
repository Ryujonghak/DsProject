package com.example.backend.model;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "TB_QNA")
@SequenceGenerator(
        name = "SQ_QNA_GENERATOR"
        , sequenceName = "SQ_QNA"
        , initialValue = 1
        , allocationSize = 1
)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_QNA SET DELETE_YN = 'Y', DELETE_TIME = TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE QID = ?")
public class Qna extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_QNA_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
//    QnA ID
    private Integer qid;
    @Column(columnDefinition = "VARCHAR2(255)")
//    QnA 작성자 ID
    private String qwriter;
    @Column(columnDefinition = "VARCHAR2(255)")
//    QnA 제목
    private String qtitle;
    @Column(columnDefinition = "VARCHAR2(4000)")
//    QnA 내용
    private String qcontent;
    @Column(columnDefinition = "VARCHAR2(4000)")
//    QnA 답변
    private String qanswer;
}