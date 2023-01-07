package com.example.backend.repository;

import com.example.backend.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * packageName : com.example.dscine.repository
 * fileName : TheaterRepository
 * author : Moon
 * date : 2023-01-06-006
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-01-06-006         Moon          최초 생성
 */
@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer> {


    Optional<Theater> findByTid(long tid);




}
