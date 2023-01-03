package com.example.backend.repository;


import com.example.backend.model.BoxOffice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 * packageName : com.example.dscine
 * fileName : BoxOfficeRepositoy
 * author : Moon
 * date : 2022-12-28-028
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-28-028         Moon          최초 생성
 */
@Repository
public interface BoxOfficeRepositoy extends JpaRepository<BoxOffice, Integer> {

    @Query(value = "select * from DAILY_MOVIE", nativeQuery = true)
    Page<BoxOffice> findAll(Pageable pageable);

    Page<BoxOffice> findAllByMovieNmContaining(String movieNm, Pageable pageable);
}
