package com.example.backend.repository;

import com.example.backend.model.Notice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
    Optional<Notice> findByNo(Long no);
    Optional<Notice> findByTitle(String title);

    Page<Notice> findAllByTitleContaining(String title, Pageable pageable);
    Page<Notice> findAllByTypeContaining(String type, Pageable pageable);

}
