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
@Table(name = "TB_THEATER")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_THEATER SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE TID = ?")
public class Theater{
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_THEA_GENERATOR")
    @Column(columnDefinition = "NUMBER")
//    극장고유번호
    private Integer tid;

    @Column(columnDefinition = "VARCHAR2(255)")
//    극장/상영관명
    private String location;
}
