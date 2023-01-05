
// TODO: ReviewDataService.js
// 목적 : Review 정보를 axios 로 CRUD 를 하는 공통 함수들 정의
// 리뷰 테이블 컬럼으로 변경 필요!!!!!!!!!


import http from "../http-common";

class ReviewDataService {
    // 모든 리뷰정보 조회 요청 함수
    getAll(movienm, page, size) {
        return http.get(`/review?movienm=${movienm}&page=${page}&size=${size}`); 
    }

    // http://localhost:8000/api/review/moviecd?moviecd=20227925
    // 영화 코드로 조회 요청 함수
    getBycode(moviecd, page, size) {
        return http.get(`/review/moviecd?moviecd=${moviecd}&page=${page}&size=${size}`)
    }

    // 리뷰번호로 조회 요청 함수
    get(id) {
        return http.get(`/review/${id}`)
    }

    // 리뷰정보 생성(insert) 요청 함수
    create(data) {
        console.log(data);
        return http.post("/review", data);
    }

    // 리뷰정보 수정(update) 요청 함수
    update(id, data) {
        return http.put(`/review/${id}`, data);
    }

    // 리뷰정보 삭제(delete) 요청 함수
    delete(rid) {
        return http.delete(`/review/deletion/${rid}`);
    }

    // 리뷰정보 전체 삭제 요청 함수
    // delete 방식 통신 요청 -> @DeleteMapping("/api/qna/all")
    deleteAll() {
        return http.delete("/review/all")
    }

}

export default new ReviewDataService();