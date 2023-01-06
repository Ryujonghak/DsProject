package com.example.backend.model;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "TB_WISHLIST")
@SequenceGenerator(
        name = "SQ_WISHLIST_GENERATOR"
        , sequenceName = "SQ_WISHLIST"
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
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_WISHLIST_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
    private Integer wid;

    @Column(columnDefinition = "VARCHAR2")
    private String username;

    @Column(columnDefinition = "VARCHAR2")
    private String moviecd;

}
