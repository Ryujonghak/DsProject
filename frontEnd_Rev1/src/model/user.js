// user.js 공통 파일: 로그인 유저정보 저장
// 유저객체 생성 : let user = new User(매개변수...);
export default class User {
  // js 생성자 : constructor(매개변수...) {}
  constructor(
      id,
      email,
      password,
      username,
      phone,
      year,
      month,
      day,
      name,
      answer
  ) {
      this.id = id;
      this.email = email;
      this.password = password;
      this.username = username;
      this.phone = phone;
      this.year = year;
      this.month = month;
      this.email = email;
      this.password = password;
      this.username = username;
      this.phone = phone;
      this.year = year;
      this.month = month;
      this.day = day;
      this.name = name;
      this.answer = answer;
  }
}
