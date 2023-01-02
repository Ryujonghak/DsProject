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

    public Page<Notice> findAllByTitleContaining(String title, Pageable pageable) {
        Page<Notice> noticePage = noticeRepository.findAllByTitleContaining(title, pageable);

        return noticePage;
    }

    public Page<Notice> findAllByTypeContaining(String type, Pageable pageable) {
        Page<Notice> noticePage = noticeRepository.findAllByTypeContaining(type, pageable);

        return noticePage;
    }

    public Optional<Notice> findByNo(Long no) {
        Optional<Notice> noticeOptional = noticeRepository.findByNo(no);

        return noticeOptional;
    }

    public Optional<Notice> findByTitle(String title) {
        Optional<Notice> noticeOptional = noticeRepository.findByTitle(title);

        return noticeOptional;
    }

    public Notice save(Notice notice) {
        Notice notice2 = noticeRepository.save(notice);

        return notice2;
    }
    public boolean removeId(Long no) {
        if(noticeRepository.existsById(no) == true) {
            noticeRepository.deleteAllById(no);
            return true;
        }
        else  {
            return false;
        }
    }
}
