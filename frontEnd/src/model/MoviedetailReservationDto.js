export default class MoviedetailReservationDto {
    // js 생성자 : constructor(매개변수...) {}
    constructor(
        reservno,
        location, // 상영관
        starttime, // 상영 시작시간
        endtime,
        seat,
        price,
        rcount,
        //    moviedetail part
        moviecd,
        movienm,
        raiting,
        posterurln,
        opendt,
        directors,
        showtm,
        watchgradenm
    ) {
        this.reservno = reservno;
        this.location = location;
        this.starttime = starttime;
        this.endtime = endtime;
        this.seat = seat;
        this.price = price;
        this.rcount = rcount;
        this.raiting = raiting;
        this.posterurln = posterurln;
        this.opendt = opendt;
        this.directors = directors;
        this.showtm = showtm;
        this.watchgradenm = watchgradenm;
    }
}