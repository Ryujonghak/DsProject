import http from "../http-common";

class NoticeDataService{

    //get all
    getAll(searchSelect,searchKeyword, page, size) {
        return http.get(`/test?searchSelect=${searchSelect}&searchKeyword=${searchKeyword}&page=${page}&size=${size}`); 
    }
    // 공지사항 생성 함수
    create(data) {
        console.log(data);
        return http.post("/test", data);
    }
    // 공지사항 수정 함수
    update(no, data) {
        return http.put(`/test/${no}`, data);
    }
}
export default new NoticeDataService();