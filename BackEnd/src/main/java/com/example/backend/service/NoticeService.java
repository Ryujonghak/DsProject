package com.example.backend.service;

import com.example.backend.model.Notice;
import com.example.backend.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticeService {
    @Autowired
    NoticeRepository noticeRepository;

    public List<Notice> findAllList() {
        List<Notice> noticeList = noticeRepository.findAll();

        return noticeList;
    }

    public Page<Notice> findByTitleContaining(String title, Pageable pageable) {
        Page<Notice> noticePage = noticeRepository.findByTitleContaining(title, pageable);

        return noticePage;
    }

    public Page<Notice> find(String type, Pageable pageable) {
        Page<Notice> noticePage = noticeRepository.findByTypeContaining(type, pageable);

        return noticePage;
    }

    public Optional<Notice> findByQno(Long qno) {
        Optional<Notice> noticeOptional = noticeRepository.findByQno(qno);

        return noticeOptional;
    }

    public Optional<Notice> findByTitle(String title) {
        Optional<Notice> noticeOptional = noticeRepository.findByTitle(title);

        return noticeOptional;
    }
}
