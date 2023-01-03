package com.example.backend.service;
import com.example.backend.model.BoxOffice;

import com.example.backend.model.MovieDetail;
import com.example.backend.repository.BoxOfficeRepositoy;
import com.example.backend.repository.MovieDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



/**
 * packageName : com.example.dscine.service
 * fileName : DSCineService
 * author : Moon
 * date : 2022-12-28-028
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-28-028         Moon          최초 생성
 */
@Service
public class DSCineService {

    @Autowired
    BoxOfficeRepositoy boxOfficeRepositoy;

    @Autowired
    MovieDetailRepository movieDetailRepository;

//    @Autowired
//    MovieDetailRepository mvdetail;

//    박스오피스 전체 출력
    public Page<BoxOffice> findallBoxOffice(Pageable pageable) {
        Page<BoxOffice> page = boxOfficeRepositoy.findAll(pageable);
        return page;
    }

    public Page<MovieDetail> findallMovieDetail(Pageable pageable) {
        Page<MovieDetail> page = movieDetailRepository.findAll(pageable);
        return page;
    }

    public Page<MovieDetail> findAllByMovienmContaining(String movienm, Pageable pageable)
    {
        Page<MovieDetail> page = movieDetailRepository.findAllByMovienmContaining(movienm, pageable);
        return page;
    }

    public Page<BoxOffice> findAllByMovienmContainingBox(String movienm, Pageable pageable)
    {
        Page<BoxOffice> page = boxOfficeRepositoy.findAllByMovieNmContaining(movienm, pageable);
        return page;
    }


}
