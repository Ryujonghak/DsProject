export default class Reservation {
    // js 생성자 : constructor(매개변수...) {}
    constructor(
        reservno,
        username,
        rno,
        moviecd,
        movienm,
        rcount,
        price,
        paiddate,
        scno,
        seatname,
        location
    ) {
        // 예매 테이블 ID
        this.reservno = reservno;
        // 에매 유저정보
        this.username = username;
        // 예매 번호
        this.rno = rno;
        // 예매 영화코드
        this.moviecd = moviecd;
        // 예매 영화제목
        this.movienm = movienm;
        // 예매 인원
        this.rcount = rcount;
        // 예매 금액
        this.price = price;
        // 예매 결제시간
        this.paiddate = paiddate;
        // 스케쥴 테이블 ID
        this.scno = scno;
        // 좌석 정보
        this.seatname = seatname;
        // 상영관 정보
        this.location = location;
    }
}