import http from "../http-common";

class NoticeDataService{

    //get all
    getAll(searchSelect,searchKeyword, page, size) {
        return http.get(`/notice?searchSelect=${searchSelect}&searchKeyword=${searchKeyword}&page=${page}&size=${size}`); 
    }
    // 공지사항 생성 함수
    create(data) {
        console.log(data);
        return http.post("/notice", data);
    }
    // 공지사항 수정 함수
    update(no, data) {
        return http.put(`/notice/${no}`, data);
    }

    //no로 가져오는 함수
    getFindByNo(no){
        return http.get(`/notice/${no}`);
    }

    //delete 삭제 함수
    delete(no){
        return http.delete(`/notice/deletion/${no}`);
    }
}
export default new NoticeDataService();