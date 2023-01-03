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
//        name = "SQ_THEA_GENERATOR"
//        , sequenceName = "SQ_THEA"
//        , initialValue = 1
//        , allocationSize = 1
//)
@Table(name = "TB_THEA")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_THEA SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE MOVIECD = ?")
public class Theater extends BaseTimeEntity{
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_THEA_GENERATOR")
    @Column(columnDefinition = "NUMBER")
    private Long tid;

    @Column(columnDefinition = "VARCHAR2(100)")
    private String location;
}
