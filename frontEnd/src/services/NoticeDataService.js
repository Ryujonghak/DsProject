import http from "../http-common";

class NoticeDataService{

    //get all
    getAll(type, page, size) {
        // get 방식 통신 요청 -> @GetMapping("/api/dept")
        // 전체조회와 부서명조회를 같이 하는 함수 
        // return http.get(`/dept?dname=${dname}&page=${page}&size=${size}`); 
        return http.get(`/test?type=${type}&page=${page}&size=${size}`); 
    }
    // 공지사항 생성 함수
    create(data) {
        alert("fdsafds");
        console.log(data);
        return http.post("/test", data);
    }
    // 공지사항 수정 함수
    update(id, data) {
        return http.put(`/test/${id}`, data);
    }
}
export default new NoticeDataService();