package com.example.backend.repository;

import com.example.backend.model.Qna;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QnaRepository extends JpaRepository<Qna, Integer> {
    //    qTitle(Qna 제목) LIKE 검색
    Page<Qna> findAllByQtitleContainingOrderByInsertTime(String qtitle, Pageable pageable);

    //    qWriter(Qna 작성자) LIKE 검색
    Page<Qna> findAllByQwriterContainingOrderByInsertTime(String qwriter, Pageable pageable);

    List<Qna> findByQid(Integer qid);
}
