<template>
  <div>
    <!--preloading-->
    <!-- <div id="preloader">
      <img class="logo" src="images/logo1.png" alt="" width="119" height="58" />
      <div id="status">
        <span></span>
        <span></span>
      </div>
    </div> -->

    <!-- 상단 페이지 제목 -->
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>{{ CurrentUser.name }}’s ticket</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY TICKET</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- todo: 이부분 나브 다른 Mypage 컴포넌트들 공통 -->
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-img">
                <!-- src="images/uploads/user-img.png" -->
                <img
                  class="profileImg"
                  src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                  alt=""
                />
                <br />
              </div>
              <div class="user-fav">
                <ul>
                  <li class="active">
                    <router-link to="">프로필</router-link>
                  </li>
                  <!-- 프로필 로그인 정보 표시 시작-->
                  <li style="color: white">
                    <strong style="color: white">이름 </strong>
                    <label>{{ CurrentUser.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 </strong>
                    <label>{{ CurrentUser.username }}</label>
                  </li>
                  <!-- 프로필 로그인 정보 표시 끝 -->
                </ul>
              </div>
              <div class="user-fav">
                <p>Account Details</p>
                <ul>
                  <li>
                    <router-link to="/mypage">내정보</router-link>
                  </li>
                  <li class="active">
                    <router-link to="/myticket">예매내역</router-link>
                  </li>
                  <li>
                    <router-link to="/mywish">찜한 영화</router-link>
                  </li>
                  <li>
                    <router-link to="/myqna">나의 문의내역</router-link>
                  </li>
                  <li>
                    <router-link to="/myprofile">개인정보 수정</router-link>
                  </li>
                </ul>
              </div>
              <div class="user-fav">
                <p>Others</p>
                <ul>
                  <!--                  <li><a href="#">Log out</a></li>-->
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user">
              <p>
                나의 예매내역 <span>{{ reservationCount }}</span> in total
              </p>
              <a href="userfavoritegrid.html" class="grid"
                ><i class="ion-grid"></i
              ></a>
              <!-- <select>
                <option value="range">-- 2022년 --</option>
                <option value="saab">-- 2021년 --</option>
              </select> -->
            </div>

            <!-- TODO: v-show 걸어야 함! -->
            <div v-show="unbooking">
              <h3>예매내역이 없습니다.</h3>
            </div>

            <!-- 예매내역 -->
            <!-- TODO: v-show 걸어야 함! -->
            <div v-show="!unbooking">
              <!-- <div> -->
              <div class="page-single userfav_list">
                <div class="container">
                  <div class="row ipad-width2">
                    <div class="col-md-9 col-sm-12 col-xs-12">
                      <div class="flex-wrap-movielist user-fav-list">
                        <!-- 예매한 영화 -->
                        <div
                          class="movie-item-style-2"
                          v-for="(data, index) in reservation.reservation"
                          :key="index"
                        >
                          <!-- todo) 이미지크기...  -->
                          <img :src="data.posterurln" alt="poster" />
                          <div class="mv-item-infor">
                           
                            <div>
                              <div class="col-xs-8">
                                <h6>
                                  <router-link
                                    :to="'/allMovie/' + data.moviecd"
                                  >
                                    {{ data.movienm }}
                                  </router-link>
                                </h6>
                                <p class="rate">
                                  <!-- 네이버 평점 -->
                                  <i class="ion-android-star"></i
                                  ><span>{{ data.raiting }}</span> /10
                                </p>
                                <p>감독: {{ data.directors }}</p>
                                <p class="describe">
                                  상영시간: {{ data.showtm }}분
                                  <a>{{ data.watchgradenm }}</a>
                                </p>
                              </div>
                              <div class="col-xs-4">
                                  <div class="col-xs-8">
                                    <div class="movie-item-style-2">
                                      <router-link :to="'/archive/' + data.moviecd">
                                      <!-- <router-link to="/archive"> -->
                                        <button>리뷰 GO</button>
                                      </router-link>
                                    </div>
                                  </div>
                              </div>
                            </div>

                            <div class="col-xs-12">
                              <p class="movie-detail-content col-xs-4">
                                예매번호
                              </p>
                              <p class="col-xs-6">
                                {{ data.reservno }}
                              </p>
                            </div>
                            <div class="col-xs-12">
                              <p class="movie-detail-content col-xs-4">
                                상영날짜
                              </p>
                              <p class="col-xs-6">{{ data.insertTime }}</p>
                            </div>
                            <div class="col-xs-12">
                              <p class="movie-detail-content col-xs-4">
                                관람극장
                              </p>
                              <p class="col-xs-6">
                                {{ data.theaterId }}
                                {{ data.screen }}
                                {{ data.startTime }}
                              </p>
                            </div>
                            <div class="col-xs-12">
                              <p class="movie-detail-content col-xs-4">
                                관람좌석
                              </p>
                              <p class="col-xs-6">
                                {{ data.seatNo1 }}
                                {{ data.seatNo2 }}
                                {{ data.seatNo3 }}
                                {{ data.seatNo4 }}
                                {{ data.seatNo5 }}
                              </p>
                            </div>
                            <p class="describe col-xs-12"></p>
                            <div class="col-xs-12">
                              <p class="movie-detail-content col-xs-4">
                                결제금액
                              </p>
                              <p class="col-xs-4">
                                {{ data.rcount * data.price }}원
                                ( {{ data.rcount }}x{{
                                  data.price
                                }}
                                )
                              </p>
                              <!-- TODO: 예매취소 버튼 - 클릭이벤트 -->
                              <div class="col-xs-4">
                                <a href="#" class="redbtn" @click="deleteTicket"
                                  >예매취소</a
                                >
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- 예매내역 없을 때에만 공백 띄우기 -->
            <div v-show="unbooking">
              <div class="blank"></div>
            </div>

            <!-- 페이지 -->
            <b-pagination
              v-model="page"
              :total-rows="reservation.totalItems"
              :per-page="pageSize"
              pills
              size="sm"
              prev-text="<"
              next-text=">"
              @change="handlePageChange"
            ></b-pagination>
          </div>
        </div>
      </div>
    </div>
    <!-- TODO: 탑버튼 추가 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png" />
    </a>
  </div>
</template>

<script>
/* eslint-disable */
// import axios from "axios";   // 프로필이미지 업로드
import custom from "@/assets/js/custom";
import userService from "@/services/user.service";
import ReservationDataService from "@/services/ReservationDataService";

export default {
  // data: () => ({
  //   images: "",
  // }),
  data() {
    return {
      CurrentUser: {
        email: "",
        password: "",
        username: "",
        phone: null,
        year: null,
        month: null,
        day: null,
        name: "",
        answer: "", // 비번확인용 정답
      },
      message: "",

      ///////////////////////////////////////////////////////////////////////////
      reservation: [], // 예매한 영화 전체
      reservationCount: 0, 
      ///////////////////////////////////////////////////////////////////////////

      // 예매 테이블 추가
      unbooking: false,

      //페이징을 위한 변수 정의
      page: 1,
      count: 0,
      pageSize: 5,
      pageSizes: [5, 10, 15],
    };
  },
  methods: {
    getUser(username) {
      // 종학이 백엔드 데이터 받는 함수
      username = this.$store.state.auth.user.username;
      // username = "forbob";
      console.log(username);
      userService
        .getUserUsername(username)
        .then((response) => {
          this.CurrentUser = {
            email: response.data.email,
            password: response.data.password,
            username: response.data.username,
            phone: response.data.phone,
            year: response.data.year,
            month: response.data.month,
            day: response.data.day,
            name: response.data.name,
            answer: response.data.answer,
          };
          console.log(this.CurrentUser);
          // console.log(response.data);
        })
        .catch((err) => console.log(err));
    },

    // 영화 전체 조회 요청하는 함수
    // getMovieInfo() {
    //   MovieDataService.getMovieAll()
    //     .then((response) => {
    //       this.movie = response.data;
    //       console.log(response.data);
    //       this.reservedMovie = this.reservedlist.length;
    //     })
    //     .catch((e) => {
    //       console.log(e);
    //     });
    // },

    // TODO: 예매한 영화 가져오기
    getWatchedMovie() {
      ReservationDataService.getUsernameReservation(this.username, this.page -1, this.pageSize)
      .then((response) => {
          this.reservation = response.data;
          console.log(response.data);
          this.reservationCount = this.reservation.length;
        })
        .catch((e) => {
          console.log(e);
        });
    },

    // TODO: 예매번호 티켓예매취소 함수 FIXME:
    deleteTicket(reservno) {
      ReservationDataService.delete(reservno)
        .then((response) => {
          console.log(response.data);
          alert("예매내역이 삭제되었습니다.");

          // this.getQna();
          // this.$router.push("/mypage");
        })
        .catch((e) => {
          console.log(e);
        });
    },

    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },

    // 페이지 출력 갯수 변경
    handlePageChange(value) {
      this.page = value;
      this.getQna();
    },
  },
  // created가 mounted보다 더 빨리 실행됨. 데이터 들어가기전에 떠야하는건 created에 넣어야 함
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
    this.getWatchedMovie(); // 예매내역
  },
};
</script>

<style scoped>
.movie-item-style-2 .mv-item-infor .describe {
  width: 530px;
}

.movie-item-style-2 {
  padding-top: 20px;
}

.blank {
  padding-top: 10%;
}

.page-single.userfav_list {
  padding: 0px;
}

.watchedArea {
  margin-top: 100px;
}

/* 배경이미지 : 아리걸로 통일 */
.user-hero {
  background: url(@/assets/images_jung/movie-theater02.jpg) no-repeat;
  /* height: 598px; */
  width: 100%;
}

/* 마이페이지-프로필 이미지크기 수정 */
.profileImg {
  -ms-interpolation-mode: bicubic;
  border: 0;
  /* height: auto; */
  max-height: 120px;
  /* max-width: 100%; */
  max-width: 120px;
  vertical-align: middle;
}

/* TODO: 탑버튼 추가 */
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
