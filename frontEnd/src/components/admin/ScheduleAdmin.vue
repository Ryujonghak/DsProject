<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4>스케쥴 관리 페이지</h4>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="page-single">
      <div class="container">
        <div class="row ipad-width2">
          <!-- <!— 왼쪽 메뉴바 시작 —> -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-fav">
                <p>관리자 목록</p>
                <ul>
                  <li>
                    <router-link to="/userInfoAdmin">회원관리</router-link>
                  </li>
                  <li>
                    <a href="#"></a>
                    <a data-toggle="dropdown" @click="boardclick">
                      게시판관리
                      <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown" v-show="board">
                      <li class="active">
                        <router-link to="/board-admin"
                          >공지사항 관리</router-link
                        >
                      </li>
                      <li>
                        <router-link to="/movie-admin">영화 관리</router-link>
                      </li>
                      <li>
                        <router-link to="/review-admin">리뷰관리</router-link>
                      </li>
                      <li>
                        <router-link to="/qna-admin">QnA 답변관리</router-link>
                      </li>
                    </ul>
                  </li>
                  <li>
                    <router-link to="/schedule-admin">스케쥴 관리</router-link>
                  </li>
                  <li>
                    <router-link to="/payment-admin">예매 내역</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <ul>
                  <!-- <a @click.prevent="logout">LOG OUT</a> -->
                  <li><a href="#" @click="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->

          <div class="topbar-filter">
            <div class="fiter" style="width: 40% !important">
              <label>지점 선택:</label>
              <select v-model="location" v-on:change="getlocation()">
                <option  value="">전체</option>
                <option value="seomyeon">서면점</option>
                <option value="centum">센텀점</option>
                <option value="busan">부산대점</option>
              </select>
            </div>
            <!-- <input
              id="select_value"
              name="inputBox"
              type="text"
              placeholder="영화이름을 입력하세요"
              style="width: 30%"
            />
            <button
              class="searchbtn"
              @click="
                page = 1;
                findByMovienm();
              "
            >
              검색하기
            </button> -->

            <button
              class="addbtn"
              @click="registerSchedule"
            >
              스케쥴추가
            </button>
          </div>

          <!--공지사항 테이블 시작 (list)  -->
          <div class="movie-item-style-2 userrate">
            <div class="mv-item-infor">
              <table class="notice_table">
                <colgroup>
                  <col style="width: 10%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                  <col style="width: 15%" />
                </colgroup>
                <thead>
                  <tr>
                    <th scope="col">번호</th>
                    <th scope="col">영화이름</th>
                    <th scope="col">영화코드</th>
                    <th scope="col">상영날짜</th>
                    <th scope="col">시작시간(지점)</th>
                    <th scope="col">EDIT</th>
                    <th scope="col">Delete</th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="(data, index) in schedule" v-bind:key="index">
                    <td>{{ data.scno }}</td>
                    <td>{{ data.movienm }}</td>
                    <td>{{ data.moviecd }}</td>
                    <td>{{ data.startday }}</td>
                    <td>{{ data.starttime }} ({{ data.location }})</td>
                    <td><button class="editbtn" @click="setActiveSchedule(data,index)">EDIT</button></td>
                    <td><button class="deletebtn" @click="deleteSchedule(data)">삭제하기</button></td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
          <!--공지사항 테이블 끝  -->

          <!-- 영화 스케쥴 수정 시작 -->
          <div class="container" v-show="edittable">
            <h2 style="color:aliceblue; margin-left: 10%;">schedule 수정 테이블</h2>
          <table class="AddMovieBox" style="margin-top: 5%">
            <colgroup>
              <!-- <col style="width: 5%" /> -->
              <col style="width: 15%" />
              <col style="width: 10%" />
              <col style="width: auto" />
              <col style="width: 15%" />
              <col style="width: 15%" />
            </colgroup>
            <tbody>
              <!-- 첫번째줄 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="name">영화코드</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    id="name"
                    class="input-text boxing"
                    v-model="editSchedule.moviecd"
                  
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">영화이름</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="editSchedule.movienm"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">러닝타임</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="editSchedule.showtm"
                  />
                </td>
              </tr>
              <!-- 첫번째줄 끝 -->
              <!-- 두번째줄 시작 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="name">상영날짜(6자리)</label>
                </th>
                <td colspan="2" class="adschedule">
                  <input
                    type="text"
                    id="name"
                    class="input-text boxing"
                    v-model="editSchedule.startday"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">영화시작시간</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="editSchedule.starttime"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">지점</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <select style="background:inherit; color:aliceblue" v-model="editSchedule.location">
                <option value="seomyeon">서면점</option>
                <option value="centum">센텀점</option>
                <option value="busan">부산대점</option>
              </select>
                </td>
              </tr>
              <!-- 두번째줄 끝 -->
            </tbody>
          </table>
          <div class="search">
            <button
              type="submit"
              class="regbtn"
              style="float: right"
             @click="changeSchedule()"
            >
              수정하기
            </button>
          </div>
        </div>
          <!-- 영화 스케쥴 수정 끝 -->

           <!-- 영화 스케쥴 추가 시작 -->
           <div class="container" v-show="regSchedule">
            <h2 style="color:aliceblue; margin-left: 10%;">schedule 추가 테이블</h2>
          <table class="AddMovieBox" style="margin-top: 5%">
            <colgroup>
              <!-- <col style="width: 5%" /> -->
              <col style="width: 15%" />
              <col style="width: 10%" />
              <col style="width: auto" />
              <col style="width: 15%" />
              <col style="width: 15%" />
            </colgroup>
            <tbody>
              <!-- 첫번째줄 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="name">영화코드</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    id="name"
                    class="input-text boxing"
                    v-model="currentSchedule.moviecd"
                  
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">영화이름</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="currentSchedule.movienm"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">러닝타임</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="currentSchedule.showtm"
                  />
                </td>
              </tr>
              <!-- 첫번째줄 끝 -->
              <!-- 두번째줄 시작 -->
              <tr>
                <th scope="row" class="noticelabel">
                  |
                  <label for="name">상영날짜(6자리)</label>
                </th>
                <td colspan="2" class="adschedule">
                  <input
                    type="text"
                    id="name"
                    class="input-text boxing"
                    v-model="currentSchedule.startday"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">영화시작시간</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <input
                    type="text"
                    name="title"
                    id="qnaTitle"
                    class="boxing input-text"
                    maxlength="100"
                    v-model="currentSchedule.starttime"
                  />
                </td>
                <th scope="row" class="noticelabel">
                  |
                  <label for="noticeTitle">지점</label>
                </th>
                <td colspan="2"  class="adschedule">
                  <select style="background:inherit; color:aliceblue" v-model="currentSchedule.location">
                <option value="seomyeon">서면점</option>
                <option value="centum">센텀점</option>
                <option value="busan">부산대점</option>
              </select>
                </td>
              </tr>
              <!-- 두번째줄 끝 -->
            </tbody>
          </table>
          <div class="search">
            <button
              type="submit"
              class="regbtn"
              style="float: right"
             @click="saveSchedule()"
            >
              등록하기
            </button>
          </div>
        </div>
           <!-- 영화 스케쥴 추가 끝 -->

          <!-- <!— 페이징 + 전체 목록 시작 —> -->
          <!-- <!— 페이징 양식 시작 —> -->
          <div class="col-md-12">
            <b-pagination
              v-model="page"
              :total-rows="schedule.totalItems"
              :per-page="pageSize"
              prev-text="Prev"
              next-text="Next"
              @change="handlePageChange"
            ></b-pagination>
          </div>
          <!-- <!— 페이징 양식 끝 —> -->
          <!-- 필터 페이지네이션 -->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ScheduleDataService from "@/services/ScheduleDataService";
export default {
  data() {
    return {
      board: false,
      schedule: [],
      location:"",
      currentSchedule:{
        scno: null, //키값
        moviecd:"", //영화코드
        movienm:"", //영화이름
        showtm:"", //러닝타임
        startday:"", //개봉날짜
        starttime:"", //시작시간
        location:""  //상영지점

      },
      //등록 폼 vshow
      regSchedule:false,

      //수정 폼 vshow
      edittable:false,
      editSchedule: [],
      currentIndex: -1,

         // 페이징을 위한 변수 정의
         page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 5, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
    };
  },
  methods: {
    registerSchedule(){
      this.regSchedule = !this.regSchedule;
    },
    //로그아웃
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },
    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    //전체조회
    retrieveSchedule() {
      ScheduleDataService.getAll()
        .then((response) => {
          const schedule = response.data;
          this.schedule = schedule;
          console.log(this.schedule);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    handlePageChange(value) {
      this.page = value; // 매개변수값으로 현재페이지 변경
      this.retrieveSchedule();
    },

    //영화이름조회
    findByMovienm(){
      ScheduleDataService.findAllByMovienmContaining(
        this.movienm,
        this.page-1,
        this.pageSize
      )
      .then((response) => {
          const schedule = response.data;
          this.schedule = schedule;
          console.log(this.schedule);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    //지점별조회
    getlocation(){
      if( this.location == ""){
        this.retrieveSchedule();
      }else{
      ScheduleDataService.findAllByLocation(
        this.location,
        this.page-1,
        this.pageSize
      )
      .then((response) => {
        const { schedule, totalItems } = response.data;
        this.schedule = schedule;
          this.count = totalItems;
          console.log(this.schedule);
        })
        .catch((e) => {
          console.log(e);
        });
      }
    },

    //영화스케쥴 추가 함수
    saveSchedule(){
      let data = {
        scno: this.currentSchedule.scno,
        moviecd: this.currentSchedule.moviecd,
        movienm: this.currentSchedule.movienm,
        showtm: this.currentSchedule.showtm,
        startday: this.currentSchedule.startday,
        starttime: this.currentSchedule.starttime,
        location : this.currentSchedule.location
      };
      ScheduleDataService.create(data)
      .then((response) => {
          this.currentSchedule.scno = response.data.scno;
          console.log(response.data);
          alert("등록되었습니다.");
          this.retrieveSchedule();
        })
        .catch((e) => {
          console.log(e);
        });
    },
    // 목록을 클릭했을때 현재 객체, 인덱스번호를 저장하는 함수
    setActiveSchedule(data, index) {
      this.editSchedule = data;
      this.currentIndex = index;
      this.edittable = !this.edittable; // update vshow
    },

    //스케쥴 수정함수
    changeSchedule(){
      this.regSchedule = false;
      ScheduleDataService.update(this.editSchedule.scno, this.editSchedule)
      .then((response) => {
          console.log(response.data);
          alert("업데이트 되었습니다.");
          this.edittable=false;
          this.retrieveSchedule();
        })
        .catch((e) => {
          console.log(e);
        });
    },

    //영화스케쥴 삭제함수
    deleteSchedule(data){
      this.schedule = data;
      ScheduleDataService.delete(this.schedule.scno)
      .then((response) => {
          console.log(response.data);
          alert("삭제가 완료되었습니다.");
          this.retrieveSchedule();
        })
        .catch((e) => {
          console.log(e);
        });
    }
  },
  mounted() {
    this.retrieveSchedule();
  },
};
</script>

<style lang="scss" scoped>
tr {
  color: aliceblue !important;
}
.topbar-filter select {
  width: 215px;
  // -webkit-appearance: none;
  // -moz-appearance: none;
  float: right !important;
  background: url(../../../public/images/uploads/drop-icon.png) no-repeat right
    20px center;
  border-left: none !important;
  border-right: px solid #405266;
  border-top: none;
  border-bottom: none !important;
  color: #ffffff;
  font-weight: 400;
}
th {
  color: aliceblue;
  border: 1px solid aliceblue;
  //border-right: 2px solid aliceblue;
  text-align: center;
}
.searchbtn {
  box-sizing: border-box;
  border-radius: 4px;
  border: none !important;
  color: black !important;
  text-align: center;
  vertical-align: middle;
  background-color: #f5b409;
  display: inline !important;
  padding: 6px 12px;
}
input {
  border-radius: 4px;
  margin-right: 2%;
  background: inherit;
  color: aliceblue;
}

.topbar-filter {
  border-top: none !important;
}
td {
  color: aliceblue;
  border-bottom: 1px solid aliceblue;
  text-align: center;
  vertical-align: middle !important;
}
.addbtn{
  box-sizing: border-box;
  border-radius: 4px;
  border: none !important;
  color: black !important;
  text-align: center;
  vertical-align: middle;
  background-color: #f5b409;
  display: inline !important;
  padding: 6px 12px;
  margin-left: 10%;
  width: 13%;
  float: right !important;;
}
.deletebtn {
  background: #DD003F!important;
  color: aliceblue !important;
  border-radius: 5px;
  margin-top: 6%;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
}
.noticelabel{
  color: aliceblue;
  border: none;
  //border-right: 2px solid aliceblue;
  text-align: center;

}
.adschedule{
  color: aliceblue;
  border-bottom: none;
  text-align: center;
  vertical-align: middle !important;
}
.regbtn {
  background:#F5B409;
  color:black;
  border-radius: 5px !important;
  box-shadow: none !important;
  width: 10%;
  padding: 1%;
}
.user-hero {
  height: 385px;
  // background: url("../images/uploads/user-hero-bg.jpg") no-repeat;
  background: url("../../assets/images_kang/Components/common/Navcom/back-img-test16.png") no-repeat;
}
h4 {
  color: aliceblue;
  margin-right: 10%;
}
.editbtn{
  background-color: #f5b409;
  color: black !important;
  border-radius: 5px;
  margin-top: 6%;
}
</style>
