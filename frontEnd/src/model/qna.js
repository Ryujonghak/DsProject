// user.js 공통 파일: Qna 정보 저장
// 유저객체 생성 : let user = new User(매개변수...);
export default class Qna {
  // js 생성자 : constructor(매개변수...) {}
  constructor(
    name,
    email,
    phone,
    title, 
    content
  ) 
  {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.title = title;
    this.content = content;
  }
}
