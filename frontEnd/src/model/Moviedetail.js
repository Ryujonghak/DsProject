export default class Moviedetail {
    // js 생성자 : constructor(매개변수...) {}
    constructor(
        id,
        moviecd,
        movienm,
        movienmen,
        movienmog,
        prdtyear,
        showtm,
        opendt,
        prdtstatnm,
        nationnm,
        genrenm,
        directors,
        watchgradenm,
        actor,
        cast,
        raiting,
        posterurln,
        posterurlkm,
        imgurl,
        utubeurl,
        plot
    ) {
        this.id = id;
        this.moviec = moviecd;
        this.movienm = movienm;
        this.movienmen = movienmen;
        this.movienmog = movienmog;
        this.prdtyear = prdtyear;
        this.showtm = showtm;
        this.opendt = opendt;
        this.prdtstatnm = prdtstatnm;
        this.nationnm = nationnm;
        this.genrenm = genrenm;
        this.directors = directors;
        this.watchgradenm = watchgradenm;
        this.director = actor;
        this.cast = cast;
        this.raiting = raiting;
        // this.posterurl = posterurln;
        this.posterurln = posterurln;
        this.posterurlkm = posterurlkm;
        this.imgurl = imgurl;
        this.utubeurl = utubeurl;
        this.plot = plot;
    }
}