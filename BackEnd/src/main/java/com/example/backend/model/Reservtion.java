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
        name = "SQ_RESERV_GENERATOR"
        , sequenceName = "SQ_RESERV"
        , initialValue = 1
        , allocationSize = 1
)
@Table(name = "TB_RESERV")
@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_RESERV SET DELETE_YN = 'Y', DELETE_TIME=TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE RESERVNO = ?")
public class Reservtion extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_RESERV_GENERATOR"
    )
    @Column
    private Long reservno;

    @Column
    private String id;

    @Column
    private Integer moviecd;

    @Column
    private Integer scheno;

    @Column
    private Integer cnt;

    @Column
    private String sheetno;

    @Column
    private Integer price;

    @Column
    private String paiddate;

}
