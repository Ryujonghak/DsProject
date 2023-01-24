package com.example.demo.repository;

import com.example.demo.model.DailyMovie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : repository
 * fileName : testRepository
 * author : Moon
 * date : 2022-12-23-023
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-23-023         Moon          최초 생성
 */
@Repository
public interface DailyMovieRepository extends JpaRepository<DailyMovie, Long>
{

    @Query(value = "select movieCd from daily_movie", nativeQuery = true)
    public List<String> allmovieCd();

    @Query(value = "select movieNm from daily_movie", nativeQuery = true)
    public List<String> allmovieNm();


}
