
// TODO: ReviewDataService.js
// 목적 : Review 정보를 axios 로 CRUD 를 하는 공통 함수들 정의
// 리뷰 테이블 컬럼으로 변경 필요!!!!!!!!!


import http from "../http-common";

class ReviewDataService {
    // 모든 리뷰정보 조회 요청 함수
    getAll(searchSelect, searchKeyword, page, size) {
        // alert(searchSelect)
        // alert(searchKeyword)
        // get 방식 통신 요청 -> @GetMapping("/api/qna")
        return http.get(`/review?searchSelect=${searchSelect}&searchKeyword=${searchKeyword}&page=${page}&size=${size}`); 
    }

    // 부서번호로 조회 요청 함수
    // get 방식 통신 요청 -> @GetMapping("/api/qna/{qno}"), @PathVariable
    get(id) {
        return http.get(`/review/${id}`)
    }

    // 부서정보 생성(insert) 요청 함수
    // post 방식 통신 요청 -> @PostMapping("/api/qna"), @RequestBody
    create(data) {
        console.log(data);
        return http.post("/review", data);
    }

    // 부서정보 수정(update) 요청 함수
    // put 방식 통신 요청 -> @PutMapping("/api/qna/{qno}"), @RequestBody
    update(id, data) {
        return http.put(`/review/${id}`, data);
    }

    // 부서정보 삭제(delete) 요청 함수
    // delete 방식 통신 요청 -> @DeleteMapping("/api/qna/deletion/{qno}")
    //                        , @PathVariable  
    delete(id) {
        return http.delete(`/review/deletion/${id}`);
    }

    // 부서정보 전체 삭제 요청 함수
    // delete 방식 통신 요청 -> @DeleteMapping("/api/qna/all")
    deleteAll() {
        return http.delete("/review/all")
    }

}

export default new ReviewDataService();