package com.example.backend.service;

import com.example.backend.model.Notice;
import com.example.backend.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    @Autowired
    NoticeRepository noticeRepository;

    public List<Notice> findAll() {
        List<Notice> noticeList = noticeRepository.findAll();

        return noticeList;
    }

    public Page<Notice> findAllByNtitleContainingOrderByInsertTime(String ntitle, Pageable pageable) {
        Page<Notice> noticePage = noticeRepository.findAllByNtitleContainingOrderByInsertTime(ntitle, pageable);

        return noticePage;
    }

    public Page<Notice> findAllByNtypeContainingOrderByInsertTime(String ntype, Pageable pageable) {
        Page<Notice> noticePage = noticeRepository.findAllByNtypeContainingOrderByInsertTime(ntype, pageable);

        return noticePage;
    }

    public Notice save(Notice notice) {
        Notice newNotice = noticeRepository.save(notice);

        return newNotice;
    }

    public boolean removeById(Integer nno) {
//        nno가 존재한다면
        if(noticeRepository.existsById(nno) == true) {
//            삭제처리
            noticeRepository.deleteById(nno);
            return true;
//            nno가 존재하지 않는다면
        } else {
            return false;
        }
    }
}
