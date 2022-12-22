// user.service.js : test 파일
// (토큰을 헤더포함 springboot 요청하는 샘플)
// 토큰 헤더에 미포함 -> 401, 403 에러 발생(인증관련 에러)
import http from "../http-common";

class UserService {
  getUserUsername(username) {
    return http.get(`/user/username/${username}`);
  }
  getFindByIdName(name, email) {
    return http.get(`/user/findById/${name}/${email}`);
  }
  getFindByPassword(username, answer) {
    return http.get(`/user/findByPassword/${username}/${answer}`);
  }
  putChangePassword(id, user) {
    return http.put(`/user/${id}`, user);
  }
}

export default new UserService();
