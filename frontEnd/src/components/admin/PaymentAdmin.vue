<template>
  <div>
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>ADMIN PAGE</h1>
              <h4>예매내역 관리 페이지</h4>
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
                    <a
                      class="btn btn-default dropdown-toggle"
                      data-toggle="dropdown"
                      @click="boardclick"
                    >
                      게시판관리
                      <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown" v-show="board">
                      <li>
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
                  <li class="active">
                    <router-link to="/payment-admin">예매 내역</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <ul>
                  <li><a href="#" @click="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- <!— 왼쪽 메뉴바 끝 —> -->

          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter" style="justify-content:flex-end;">
              <input
                id="select_value"
                name="inputBox"
                type="text"
                placeholder="id를 입력하세요."
                style="width: 20%"
                v-model="username"
              />
              <button class="searchbtn"
              @click="
              page = 1;
              findbyUsername();
            ">검색하기</button>
            </div>
            <!-- 전체정렬 -->
            <!--리뷰 테이블 관리 시작 (list)  -->
            <div class="movie-item-style-2 userrate">
              <div class="mv-item-infor">
                <table class="notice_table">
                  <colgroup>
                    <col style="width: 10%" />
                    <col style="width: 10%" />
                    <col style="width: 20%" />
                    <col style="width: 10%" />
                    <col style="width: 10%" />
                    <col style="width: 10%" />
                    <col style="width: 10%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <th scope="col">예매번호</th>
                      <th scope="col">ID</th>
                      <th scope="col">영화명</th>
                      <th scope="col">인원</th>
                      <th scope="col">결제가격</th>
                      <th scope="col">결제시간</th>
                      <th scope="col">상세정보</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr
                      v-for="(data, index) in reservation.reservation"
                      v-bind:key="index"
                    >
                      <td>{{ data.reservno }}</td>
                      <td>{{ data.username }}</td>
                      <td>{{ data.movienm }}</td>
                      <td>{{ data.rcount }}</td>
                      <td>{{ data.price }}</td>
                      <td>{{ data.insertTime }}</td>
                      <td><button class="detailbtn" @click="checkingReservation(data.reservno)">상세정보</button></td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
            <!--리뷰 테이블 관리 테이블 끝  -->
          </div>

          <!-- 상세보기 페이지  시작-->
          <div
          v-show="detailReservation"
            class="detail"
            style="color: aliceblue"
          >
            <h4 style="margin-left: 15%">상세보기</h4>
            <ul style="margin-left: 30%">
              <li>ID : {{ detailRes.username }}</li>
              <li>이름 : {{ detailRes.name }}</li>
              <li>예매고유번호 : {{ detailRes.reservno }}</li>
              <li>영화제목 : {{ detailRes.movienm }}</li>
              <li>영화코드 : {{ detailRes.moviecd }}</li>
              <li>상영관 : {{ detailRes.location }}</li>
              <li>관람인원 : {{ detailRes.rcount }} 명</li>
              <li>결제가격 : {{ detailRes.price }} 원</li>
              <li>결제시간 : {{ detailRes.insertTime }} </li>
            </ul>
          </div>

          <!-- 상세보기 페이지 끝  -->
          <!-- <!— 페이징 + 전체 목록 시작 —> -->
          <!-- <!— 페이징 양식 시작 —> -->
          <div class="col-md-12">
            <b-pagination
              v-model="page"
              :total-rows="reservation.totalItems"
              :per-page="pageSize"
              prev-text="Prev"
              next-text="Next"
              @change="handlePageChange"
            ></b-pagination>
          </div>
          <!-- <!— 페이징 양식 끝 —> -->
          <!-- 필터 페이지네이션 -->

          <!-- 끝 -->
        </div>
      </div>
    </div>
    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
  </div>
</template>

<script>
import ReservationDataService from "@/services/ReservationDataService";

export default {
  data() {
    return {
      board: false,
      reservation: [],
      detailReservation: false,
      detailRes: [],
      username:"",

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 5, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
    };
  },
  methods: {
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },
    //왼쪽 메뉴바 slide효과
    boardclick() {
      this.board = !this.board;
    },

    //전체조회 함수
    retreiveReservation() {
      ReservationDataService.getAll(this.page - 1, this.pageSize)
        .then((response) => {
          const reservation = response.data;
          this.reservation = reservation;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    //유저네임검색 
    findbyUsername(){
      ReservationDataService.getUsernameReservation(this.username,this.page - 1, this.pageSize)
        .then((response) => {
          console.log(response.data);
          const reservation = response.data;
          this.reservation = reservation;

        })
        .catch((e) => {
          console.log(e);
        });
    },

    //상세보기 조회함수
    checkingReservation(reservno){ 
      this.detailReservation = !this.detailReservation;
      ReservationDataService.getReservation(reservno)
      .then((response) => {
          this.detailRes = response.data[0];
          console.log(this.detailRes);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    handlePageChange(value) {
      this.page = value; // 매개변수값으로 현재페이지 변경
      this.retreiveReservation();
    },
  },
  mounted() {
    this.retreiveReservation();
    // this.findbyUsername();
  },
};
</script>

<style lang="scss" scoped>
th {
  color: aliceblue;
  border: 1px solid aliceblue;
  //border-right: 2px solid aliceblue;
  text-align: center;
}
td {
  color: aliceblue;
  border-bottom: 1px solid aliceblue;
  text-align: center;
  vertical-align: middle !important;
}
.deletebtn {
  background: #dd003f;
  color: aliceblue;
  border-radius: 3px !important;
  box-shadow: none !important;
  width: 50%;
}
button {
  border: none !important;
}
button:active {
  outline: none !important;
  box-shadow: none !important;
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
.detailbtn {
  background: rgb(255, 255, 0);
  color: black;
  border-radius: 20px;
  vertical-align: middle !important;
}

.searchbtn{
  box-sizing: border-box;
  border-radius: 4px;
  border: none !important;
  color:black !important;
  text-align: center;
  vertical-align: middle;
  background-color: #F5B409;
  display: inline !important;
  padding: 6px 12px;
}
input{
  border-radius: 4px;
  margin-right: 2%;
  background:inherit;
  color: aliceblue;
}

.topbar-filter {
  border-top: none !important;

}

/* 탑버튼 추가 _정주희 */
.topbutton {
  position: fixed;
  bottom: 15px;
  right: 15px;
  width: 40px;
  height: 40px;
  z-index: 1;
  opacity: 0.8;
}
</style>
