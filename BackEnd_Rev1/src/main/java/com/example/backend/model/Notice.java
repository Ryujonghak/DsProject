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
        name = "SQ_NOTICE_GENERATOR"
        , sequenceName = "SQ_NOTICE"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_NOTICE")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_NOTICE SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE NNO = ?")
public class Notice extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_NOTICE_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
//    공지사항번호
    private Integer nno;

    @Column(columnDefinition = "VARCHAR2(255)")
//    공지사항말머리
    private String ntype;

    @Column(columnDefinition = "VARCHAR2(255)")
//    공지사항제목
    private String ntitle;

    @Column(columnDefinition = "VARCHAR2(4000)")
//    공지사항내용
    private String ncontent;
}
