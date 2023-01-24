package com.example.demo.service;

import com.example.demo.controller.BoxOfficeApi;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * packageName : service
 * fileName : testService
 * author : Moon
 * date : 2022-12-23-023
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-23-023         Moon          최초 생성
 */
@Service
@RequiredArgsConstructor
public class BoxOfficeApiService {

    @Autowired
    BoxOfficeApi boxOfficeApi;

    public void insertDailyBoxOffice()
    {
        boxOfficeApi.dailyBoxOffice();
    }




}
