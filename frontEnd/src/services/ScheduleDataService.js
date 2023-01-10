import http from "@/http-common";

class ScheduleDataService {
    getAll() {
        return http.get(`/schedule`);
    }

    getFindAllByMoviecd(moviecd) {
        return http.get(`/schedule/searchMoviecd/${moviecd}`);
    }

    getFindAllByMoviecdAndLocation(moviecd, location) {
        return http.get(`/schedule/searchMoviecdAndLocation/${moviecd}/${location}`);
    }

    getFindAllByMoviecdAndLocationAndStartday(moviecd, location, startday) {
        console.log(moviecd, location, startday);
        return http.get(`/schedule/searchMoviecdAndLocationAndStartday/${moviecd}/${location}/${startday}`);
    }

    getfFndByMoviecdAndLocationAndStartdayAndStarttime(moviecd, location, startday, starttime) {
        return http.get(`/schedule/searchMoviecdAndLocationAndStartdayAndStarttime/${moviecd}/${location}/${startday}/${starttime}`);
    }

    create(data) {
        console.log(data);
        return http.post('/schedule', data);
    }

    update(scno, data) {
        console.log(data);
        return http.put('/schedule/${scno}', data);
    }

    delete(scno) {
        return http.delete(`/schedule/${scno}`);
    }
}

export default new ScheduleDataService();