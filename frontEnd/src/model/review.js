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