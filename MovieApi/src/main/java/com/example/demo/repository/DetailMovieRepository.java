package com.example.demo.repository;

import com.example.demo.model.DetailMovie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : com.example.demo.repository
 * fileName : DetailMovieRepository
 * author : Moon
 * date : 2022-12-25-025
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-12-25-025         Moon          최초 생성
 */
public interface DetailMovieRepository extends JpaRepository<DetailMovie, Long> {
}
