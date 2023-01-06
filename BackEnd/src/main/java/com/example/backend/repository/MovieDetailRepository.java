package com.example.backend.repository;

import com.example.backend.model.MovieDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * packageName : com.example.dscine.repository
 * fileName : MovieDetailRepository
 * author : Moon
 * date : 2022-12-28-028
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-28-028         Moon          최초 생성
 */
public interface MovieDetailRepository extends JpaRepository<MovieDetail, Integer> {
    //    @Query(value = "select d.*     " +
//            "from DETAIL_MOVIE d     " +
//            "where d.MOVIENM like %:title% "
//            ,countQuery = "select count(*)    " +
//            "from DETAIL_MOVIE d     " +
//            "where d.MOVIENM like %:title% "
//            ,nativeQuery = true)
//    Page<MovieDetail> findAllbyMovienmContaining(@Param("title") String title, Pageable pageable);
    Page<MovieDetail> findAllByMovienmContaining(String movienm, Pageable pageable);
    Page<MovieDetail> findAllByMoviecdContaining(String moviecd, Pageable pageable);

    Page<MovieDetail> findAllByOrderByOpendt(Pageable pageable);

    Page<MovieDetail> findAllByOrderByOpendtDesc(Pageable pageable);

    List<MovieDetail> findAllByMoviecd(String moviecd);




    @Query(value = "select * from DETAIL_MOVIE", nativeQuery = true)
    Page<MovieDetail> findAll(Pageable pageable);

}
