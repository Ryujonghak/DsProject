// user.service.js : test 파일
// (토큰을 헤더포함 springboot 요청하는 샘플)
// 토큰 헤더에 미포함 -> 401, 403 에러 발생(인증관련 에러)
import http from "../http-common";
import authHeader from "../services/auth-header.js";

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
  getAll(username, page, size) {
    return http.get(`/user?username=${username}&page=${page}&size=${size}`, {
      headers: authHeader(),
    });
  }

  get(id) {
    return http.get(`/user/${id}`, { headers: authHeader() });
  }

  create(user) {
    let userData = {
      username: user.username,
      email: user.email,
      password: user.password,
      role: [user.role],
      phone : user.phone,
      year : user.year,
      month : user.month,
      day : user.day,
      name: user.name,
      answer: user.answer
    };

    console.log(userData);
    // return axios.post(API_URL + 'signup', userData);
    return http.post("/user", userData, { headers: authHeader() });
  }

  update(id, changePwd, user) {
    let userData = {
      username: user.username,
      email: user.email,
      password: user.password,
      role: [user.role[0].name],
      changePwd: changePwd,
      phone : user.phone,
      year : user.year,
      month : user.month,
      day : user.day,
      name: user.name,
      answer: user.answer
    };

    console.log(userData);
    console.log(changePwd);
    return http.put(`/user/${id}`, userData, { headers: authHeader() });
  }

  delete(id) {
    return http.delete(`/user/deletion/${id}`, { headers: authHeader() });
  }
}

export default new UserService();
