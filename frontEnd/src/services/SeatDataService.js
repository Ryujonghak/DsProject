import http from "@/http-common";

class SeatDataService {
    getAll() {
        return http.get(`/seat/allSeat`);
    }

    getSeatyn(seatyn) {
        return http.get(`/seat/seatstatus/${seatyn}`);
    }

    create(data) {
        return http.post(`/seat`, data);
    }

    update(seatposition, scno, seatyn) {
        return http.put(`/seat/setSeat/${seatposition}/${scno}/${seatyn}`);
    }


}

export default new SeatDataService();
