import http from "../http-common";

class ReservationDataService {
    getAll(page, size) {
        return http.get(`/reservation/all?page=${page}&size=${size}`)
    }

    getUsernameReservation(username, page, size) {
        return http.get(`/reservation/search?username=${username}&page=${page}&size=${size}`)
    }

    getReservation(reservno) {
        return http.get(`reservation/searchById/${reservno}`)
    }

    getRespage(username, page, size) {
        return http.get(`/reservation/mypage?username=${username}&page=${page}&size=${size}`)
    }

    create(username, data) {
        console.log(username);
        console.log(data);
        return http.post(`/reservation`, data);
    }

    update(reservno, username, data) {
        return http.put(`/reservation/${reservno}`, username, data);
    }

    delete(reservno) {
        return http.delete(`/reservation/deletion/${reservno}`);
    }
}

export default new ReservationDataService();