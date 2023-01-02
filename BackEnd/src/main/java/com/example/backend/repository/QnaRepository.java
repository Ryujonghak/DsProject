package com.example.backend.repository;

import com.example.backend.model.Qna;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * packageName : com.example.simpledms.repository
 * fileName : QnaRepository
 * author : ryujonghak
 * date : 2022/11/09
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/09         ryujonghak          최초 생성
 */
public interface QnaRepository extends JpaRepository<Qna, Integer> {
    Page<Qna> findAllByTitleContaining(String title, Pageable pageable);

    Page<Qna> findAllByNameContaining(String name, Pageable pageable);

    Optional<Qna> findByName(String name);
}

