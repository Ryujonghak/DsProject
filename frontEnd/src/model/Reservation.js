export default class Reservation {
    // js 생성자 : constructor(매개변수...) {}
    constructor(
// --     예매고유번호
reservno,
// --     로그인id (참조테이블: tb_user)
username,
// --     예약자 성함
name,
// --     예약자 ID
rusername,
// --     상영스케쥴id (참조테이블: tb_schedule)
rno,
// --     영화코드 (참조테이블: tb_schedule)
moviecd,
// --     영화제목 (참조테이블: tb_schedule)
movienm,
// --     관람인원
rcount,
// --     결제금액
price,
// --     결제일시
paiddate,
// --     상영관
location,
seat,
startday,
starttime,
endtday,
endtime,
// --     스케쥴 id
scno
    ) {
        this.reservno = reservno;
        this.username = username;
        this.name = name;
        this.rusername = rusername;
        this.rno = rno;
        this.moviecd = moviecd;
        this.movienm = movienm;
        this.rcount = rcount;
        this.price = price;
        this.paiddate = paiddate;
        this.location = location;
        this.seat = seat;
        this.startday = startday; //상영날짜 (230110)
        this.starttime = starttime; //영화시작시간 11:55
        this.endtday = endtday; // 상영끝나는날짜
        this.endtime = endtime; //영화 끝나는시간
        this.scno = scno;
    }
}