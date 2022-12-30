package com.example.backend.repository;

import com.example.backend.dto.response.ScheMovieDto;
import com.example.backend.model.Sche;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScheRepository extends JpaRepository<Sche, Long> {
    Optional<Sche> findByScno(Long scno);

//    TODO: Movie 모델과 N : 1 OR N : N 관계 시 Query문 추가 및 수정해주어야함.(DTO 또한 수정해야함.)
    Page<Sche> findAllByMoviecdContaining(@Param("moviecd") Integer moviecd, Pageable pageable);
}
