// user.js 공통 파일: 로그인 유저정보 저장
// 유저객체 생성 : let user = new User(매개변수...);
export default class Review {
  // js 생성자 : constructor(매개변수...) {}
  constructor(
      rid,
      rwuser,
      reservno,
      moviecd,
      movienm,
      rurating,
      rucontent,
      showtm,
      opendt,
      watchgradenm
  ) {
      this.rid = rid;
      this.rwuser = rwuser;
      this.reservno = reservno;
      this.moviecd = moviecd;
      this.movienm = movienm;
      this.rurating = rurating;
      this.rucontent = rucontent;
      this.showtm = showtm;
      this.opendt = opendt;
      this.watchgradenm = watchgradenm;
  }
}