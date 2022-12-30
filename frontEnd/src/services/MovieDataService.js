// MovieDataService.js
// 목적 : Movie 정보를 axios 로 CRUD 를 하는 공통 함수들 정의
import http from "../http-common";

class MovieDataService {
  // 모든 박스오피스 영화정보 조회 요청 함수
  getBoxofficeAll(movienm, page, size) {
    return http.get(`/boxoffice?movienm=${movienm}&page=${page}&size=${size}`);
  }

  // 모든 영화디테일 조회 요청 함수
  getMovieAll(movienm, page, size) {
    return http.get(`/movie?movienm=${movienm}&page=${page}&size=${size}`);
  }

}

export default new MovieDataService();
