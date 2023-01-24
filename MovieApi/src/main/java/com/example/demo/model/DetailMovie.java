package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * packageName : model
 * fileName : Test
 * author : Moon
 * date : 2022-12-23-023
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-23-023         Moon          최초 생성
 */
@Table(name = "detail_movie")
@ToString
@SequenceGenerator(
        name= "SQ_DM_GENERATOR"
        , sequenceName = "SQ_DM"
        , initialValue = 1
        , allocationSize = 1
)
// lombok 라이브러리 어노테이션
// null 무시하고 sql 문 자동생성하는 어노테이션
@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_DM_GENERATOR")

    private Long id;

    private String moviecd;

    private String movienm;

    private String movienmen;

    private String movienmog;

    private String prdtyear;

    private String showtm;

    private String opendt;

    private String prdtstatnm;

    private String nationnm;

    private String genrenm;

    private String directors;

    private String watchgradenm;

    private String actor;

    private String cast;

    private Double raiting;

    private String posterurln;

    private String posterurlkm;

    private String imgurl;

    private String utubeurl;

    private String plot;



}


