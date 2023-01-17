export default class Seat {
    // js 생성자 : constructor(매개변수...) {}
    constructor(
        sno, // 자동생성 시퀀스 번호
        seatposition, // 좌석 이름
        seatyn, // 좌석 예약 여부(Y/n)
        scno // 스케쥴 넘버
    ) {
        this.sno = sno;
        this.seatposition = seatposition;
        this.seatyn = seatyn;
        this.scno = scno;
    }
}