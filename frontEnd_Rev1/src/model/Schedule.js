export default class Schedule {
    // js 생성자 : constructor(매개변수...) {}
    constructor(
        scno,
        moviecd,
        movienm,
        showtm,
        startday,
        starttime,
        endtday,
        endtime,
        location,
    ) {
        this.scno = scno;  //생성번호 (key)
        this.moviec = moviecd; //영화코드
        this.movienm = movienm;
        this.showtm = showtm; //러닝타임
        this.startday = startday; //상영날짜 (230110)
        this.starttime = starttime; //영화시작시간 11:55
        this.endtday = endtday; // 상영끝나는날짜
        this.endtime = endtime; //영화 끝나는시간
        this.location = location;  //상영관 (서면)
    }
}