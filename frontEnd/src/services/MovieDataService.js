// MovieDataService.js
// 목적 : Movie 정보를 axios 로 CRUD 를 하는 공통 함수들 정의 추가
import http from "../http-common";

class MovieDataService {
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

  // 영화디테일 코드 조회 요청 함수
  getMovieDetail(moviecd) {
    return http.get(`/movie/cd/?moviecd=${moviecd}`);
  }

  //영화 admin delete 요청 함수
  delete(id) {
    return http.delete(`/movie/deletion/${id}`);
  }
  //새 영화 추가 함수
  create(data) {
    console.log(data);
    return http.post("/movie", data);
  }
}

export default new MovieDataService();
