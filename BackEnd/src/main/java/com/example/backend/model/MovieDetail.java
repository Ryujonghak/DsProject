package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName : com.example.dscine.model
 * fileName : MovieDetail
 * author : Moon
 * date : 2022-12-28-028
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-28-028         Moon          최초 생성
 */
@Data
@Entity
@ToString
@NoArgsConstructor
@Table(name = "DETAIL_MOVIE")
public class MovieDetail
{
//    private Integer id;

    @Id
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
