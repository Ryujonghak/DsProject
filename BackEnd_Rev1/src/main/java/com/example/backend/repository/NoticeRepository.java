package com.example.backend.repository;

import com.example.backend.model.Notice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {
    //    nTitle(공지사항 제목) LIKE 검색
    Page<Notice> findAllByNtitleContainingOrderByInsertTime(String ntitle, Pageable pageable);

    //    nType(공지사항 제목) LIKE 검색
    Page<Notice> findAllByNtypeContainingOrderByInsertTime(String ntype, Pageable pageable);
}
