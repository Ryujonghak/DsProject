// MovieDataService.js
// 목적 : Movie 정보를 axios 로 CRUD 를 하는 공통 함수들 정의 추가
import http from "../http-common";

class BookingService {
  // 모든 영화정보 조회 요청 함수 TODO: 정주희
  getSeatAll() {
    return http.get(`/theater/allSeat`);
  }

  // http://localhost:8000/api/theater/setSeat/{{seatposition}}/{{seatyn}}
  // 공지사항 수정 함수
  SelectSeat(seatposition, seatyn) {
    return http.put(`/theater/setSeat/${seatposition}/${seatyn}`);
}

  // 모든 박스오피스 영화정보 조회 요청 함수
  getBoxofficeAll(movienm, page, size) {
    return http.get(`/boxoffice/?movienm=${movienm}&page=${page}&size=${size}`);
  }

  // 박스오피스 코드 조회 요청 함수
  getBoxoffice(moviecd) {
    return http.get(`/boxoffice/cd/?moviecd=${moviecd}`);
  }

  // 모든 영화디테일 조회 요청 함수
  getMovieDetailAll(movienm, page, size) {
    return http.get(`/movie/?movienm=${movienm}&page=${page}&size=${size}`);
  }

 // 무비목록 개봉일역순
  getMovieDesc(page, size){
    return http.get(`/movie/desc/?page=${page}&size=${size}`);
  }

  // 무비목록 개봉일순
  getMovieAsc(page, size){
    return http.get(`/movie/asc/?page=${page}&size=${size}`);
  }

  // 영화디테일 코드 조회 요청 함수
  getMovieDetail(moviecd) {
    return http.get(`/movie/cd/?moviecd=${moviecd}`);
  }


  resetseat() {
    return http.post(`/opentheater`);
  }

}

export default new BookingService();
