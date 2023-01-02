package com.example.backend.service;

import com.example.backend.model.Qna;
import com.example.backend.repository.QnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * packageName : com.example.simpledms.service
 * fileName : QnaService
 * author : ryujonghak
 * date : 2022/11/09
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/09         ryujonghak          최초 생성
 */
@Service
public class QnaService {
    @Autowired
    QnaRepository qnaRepository;

    //    전체 조회 함수( 페이징 처리 )
    public Page<Qna> findAll(Pageable pageable) {
        Page<Qna> page = qnaRepository.findAll(pageable);

        return page;
    }

    //    전체 삭제 함수
    public void removeAll() {
        qnaRepository.deleteAll(); // 전체 삭제
    }

    //   부서 정보 저장/수정 함수
    public Qna save(Qna qna) {

        Qna qna2 = qnaRepository.save(qna);

        return qna2;
    }

    //    부서번호로 조회하는 함수
    public Optional<Qna> findById(int no) {
//        findById(기본키속성)
        Optional<Qna> optionalQna = qnaRepository.findById(no);

        return optionalQna;
    }

    // 부서번호(no)로 삭제하는 함수
    public boolean removeById(int no) {
//        existsById(기본키) 있으면 삭제 실행 + true 리턴
        if (qnaRepository.existsById(no) == true) {
            qnaRepository.deleteById(no);
            return true;
        }

//        없으면 그냥 false 리턴
        return false;
    }

    //    question(질문) like 검색 함수 ( 페이징 처리 )
    public Page<Qna> findAllByTitleContaining(String title, Pageable pageable) {
        Page<Qna> page = qnaRepository.findAllByTitleContaining(title, pageable);

        return page;
    }

    //    questioner(질문자) like 검색 함수 ( 페이징 처리 )
    public Page<Qna> findAllByNameContaining(String name, Pageable pageable) {
        Page<Qna> page = qnaRepository.findAllByNameContaining(name, pageable);

        return page;
    }

    public List<Qna> findAllList() {
        List<Qna> qnaList = qnaRepository.findAll();

        return qnaList;
    }
}