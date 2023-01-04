package com.example.backend.service;

import com.example.backend.model.Qna;
import com.example.backend.repository.QnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaService {
    @Autowired
    QnaRepository qnaRepository;

    public List<Qna> findAllList() {
        List<Qna> qnaList = qnaRepository.findAll();

        return qnaList;
    }

    public Page<Qna> findAllByQtitleContainingOrderByInsertTime(String qtitle, Pageable pageable) {
        Page<Qna> qnaPage = qnaRepository.findAllByQtitleContainingOrderByInsertTime(qtitle, pageable);

        return qnaPage;
    }

    public Page<Qna> findAllByQwriterContainingOrderByInsertTime(String qwriter, Pageable pageable) {
        Page<Qna> qnaPage = qnaRepository.findAllByQwriterContainingOrderByInsertTime(qwriter, pageable);

        return qnaPage;
    }

    public Qna save(Qna qna) {
        Qna newQna = qnaRepository.save(qna);

        return newQna;
    }

    public boolean removeById(int qid) {
//        existsById(기본키) 있으면 삭제 실행 + true 리턴
        if (qnaRepository.existsById(qid) == true) {
            qnaRepository.deleteById(qid);
            return true;
        } else {
//        없으면 그냥 false 리턴
        return false;
        }
    }
}
