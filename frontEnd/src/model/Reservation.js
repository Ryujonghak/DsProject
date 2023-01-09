export default class Reservation {
    // js 생성자 : constructor(매개변수...) {}
    constructor(
// --     예매고유번호
reservno,
// --     로그인id (참조테이블: tb_user)
username,
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
// --     스케쥴 id
scno
    ) {
        this.reservno = reservno;
        this.username = username;
        this.rno = rno;
        this.moviecd = moviecd;
        this.movienm = movienm;
        this.rcount = rcount;
        this.price = price;
        this.paiddate = paiddate;
        this.scno = scno;
    }
}