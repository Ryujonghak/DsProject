package com.example.backend.repository;

import com.example.backend.model.Notice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
    Optional<Notice> findByQno(Long qno);
    Optional<Notice> findByTitle(String title);

    Page<Notice> findByTitleContaining(String title, Pageable pageable);
    Page<Notice> findByTypeContaining(String type, Pageable pageable);
}