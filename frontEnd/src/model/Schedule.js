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
        tid,
        sno
    ) {
        this.scno = scno;
        this.moviec = moviecd;
        this.movienm = movienm;
        this.showtm = showtm;
        this.startday = startday;
        this.starttime = starttime;
        this.endtday = endtday;
        this.endtime = endtime;
        this.location = location;
        this.tid = tid;
        this.sno = sno;
    }
}