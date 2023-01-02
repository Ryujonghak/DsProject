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
@SQLDelete(sql = "UPDATE TB_QNA SET DELETE_YN = 'Y', DELETE_TIME = TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE QNO = ?")

public class Qna extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_QNA_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
    private Integer qno;
    @Column(columnDefinition = "VARCHAR2")
    private String name;
    @Column(columnDefinition = "VARCHAR2")
    private String email;
    @Column(columnDefinition = "NUMBER")
    private String phone;
    @Column(columnDefinition = "VARCHAR2")
    private String title;
    @Column(columnDefinition = "VARCHAR2")
    private String content;
    @Column(columnDefinition = "VARCHAR2")
    private String answer;

}