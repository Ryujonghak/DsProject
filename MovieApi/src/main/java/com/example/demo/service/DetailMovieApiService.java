package com.example.demo.service;

import com.example.demo.controller.BoxOfficeApi;
import com.example.demo.controller.MovieDetailApi;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * packageName : com.example.demo.service
 * fileName : DetailMovieApiService
 * author : Moon
 * date : 2022-12-26-026
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-26-026         Moon          최초 생성
 */
@Service
@RequiredArgsConstructor
public class DetailMovieApiService {

    @Autowired
    MovieDetailApi movieDetailApi;

    public void insertMovieInfo()
    {
        movieDetailApi.movieDetail();
    }
}
