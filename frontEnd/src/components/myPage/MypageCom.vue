<template>
  <div>
    <!-- 상단 페이지 제목 -->
    <div class="hero user-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="hero-ct">
              <h1>{{ CurrentUser.name }}’s page</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY PAGE</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="page-single">
      <div class="container">
        <div class="row ipad-width">
          <!-- 공통 왼쪽 메뉴 시작 -->
          <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="user-information">
              <div class="user-img">
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
                  <li class="active">
                    <router-link to="/mypage">내정보</router-link>
                  </li>
                  <li>
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
                  <li><a href="#" @click.prevent="logout">Log out</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <!-- 프로필 -->
            <div class="col-xs-11 movie-item-style-2 userrate">
              <div class="row">
                <div class="col-xs-3 mv-user-review-item">
                  <img
                    src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                    alt="user"
                  />
                  <div class="welcome">
                    <h3>{{ CurrentUser.name }} 님</h3>
                    <h3>환영해요!</h3>
                  </div>
                </div>

                <div class="col-xs-6 mv-user-review-item">
                  <h6>즐겨찾는 영화관</h6>
                  <div>
                    <table>
                      <tr>
                        <td>
                          <h6><a href="#"></a></h6>
                        </td>
                      </tr>
                      <tr>
                        <td>
                          <div class="mv-item-infor">
                            <h6><router-link to="/SeomyeonCinema">DS 서면</router-link></h6>
                          </div>
                        </td>
                        <td>
                          <div class="mv-item-infor">
                            <h6><router-link to="/CentumCinema">DS 센텀시티</router-link></h6>
                          </div>
                        </td>
                        <td>
                          <div class="mv-item-infor">
                            <h6><a href="#">영화관3</a></h6>
                          </div>
                        </td>
                      </tr>
                    </table>
                  </div>
                </div>

                <div class="col-xs-2 mv-user-review-item">
                  <h6>나의 등급</h6>
                  <div>
                    <img src="@/assets/images_jung/welcome.png" alt="" />
                  </div>
                </div>
              </div>
            </div>
            <!-- 즐겨찾는 영화관 -->

            <!-- 아카이브 -->
            <div class="container">
              <div class="row ipad-width2">
                <div class="col-md-8 col-sm-12 col-xs-12">
                  <!-- 아카이브 나브 -->
                  <div class="topbar-filter">
                    <p class="mytitle">나의 아카이브 <span>{{ watchedMovieTotalCount }}</span> in total</p>
                    <a href="/mypage" class="grid"
                      ><i class="ion-grid"></i
                    ></a>
                  </div>

                  <div v-if="emptyArchive == true" class="noArchive">
                    <h3>예매내역이 없습니다.</h3>
                  </div>

                  <!-- 나의 아카이브 내용 시작 : 예매내역 정보 받아오기 -->
                  <div class="flex-wrap-movielist" v-if="emptyArchive == false">
                    <!-- 아카이브 시작 -->
                    <div class="movie-item-style-2 movie-item-style-1" 
                    v-for="(data, index) in watchedMovie.reservation" v-bind:key="index">
                        <img :src="data.posterurln" alt="poster" />
                        <!-- 영화 라벨 -->
                        <div class="mv-item-infor">
                          <div class="movieTitle-2">
                            <h6>
                              <router-link :to="'/allMovie/' + data.moviecd">
                                <a href="#">
                                {{ data.movienm }}</a>
                              </router-link>
                            </h6>
                          </div>
                          <p class="rate">
                            <i class="ion-android-star"></i
                            ><span>{{ data.raiting }}</span> /5
                          </p>
                        </div>
                      <!-- 영화에 마우스 올리면 나오는 관람정보: 리뷰하러가기 -->
                      <div class="hvr-inner">
                        <div class="movieTitle">
                          <h6>
                            <router-link :to="'/allMovie/' + data.moviecd">
                              {{ data.movienm }}
                              <span>({{ data.opendt }})</span>
                            </router-link>
                          </h6>
                        </div>
                        <p>
                          상영시간: {{ data.showtm }}분 <br />
                          관람일자 :
                          {{ data.startday }}<br />
                          {{ data.starttime }}  ~ {{ data.endtime }}<br>
                        </p>
                       
                        <!-- 버튼 클릭시 클릭이벤트-영화정보(moviecd) 넘겨주기 -->
                        <router-link :to="'/archive/' + data.moviecd">
                          나의 리뷰 작성하기
                        </router-link>
                      </div>
                      <!-- 영화에 마우스 올리면 나오는 관람정보: 리뷰를 위한 영화정보 끝 -->
                    </div>
                    <!-- 아카이브 끝 -->
                  </div>
                  
                  <!-- 페이징 -->
                  <b-pagination
                        v-model="page"
                        :total-rows="watchedMovie.totalItems"
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
        </div>
      </div>
    </div>
    <!-- 탑버튼  -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
          
  </div>
</template>

<script>
/* eslint-disable */

import custom from "@/assets/js/custom";
import userService from "@/services/user.service";
import ReservationDataService from "@/services/ReservationDataService";

export default {
  data() {
    return {
      watchedMovie: [],   // 예매한 영화
      watchedMovieTotalCount: 0,  // 본 영화 갯수

      emptyArchive: true, // 아카이브 없는지 체크

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

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 5, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
      pageSizes: [5, 10, 15], // select box 에 넣을 기본 데이터
    };
  },
  methods: {
    // 로그인 한 사용자정보 가져오기
    getUser() {
      userService
        .getUserUsername(this.$store.state.auth.user.username)
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
        })
        .catch((err) => console.log(err));
    },

    findArchive() {
      if(this.watchedMovie.length == 0) {
        this.emptyArchive = true;
      } else {
        this.emptyArchive = false;
      }
      console.log("findArchive", this.watchedMovie);
    },

    // 로그아웃
    logout() {
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); 
    },

    // 본 영화 전체 조회 요청
    getReservMovieInfo() {
      ReservationDataService.getRespage(this.$store.state.auth.user.username, this.page -1, this.pageSize)
        .then((response) => {
          this.watchedMovie = response.data;
          console.log("this.watchedMovie", this.watchedMovie);
          console.log(response.data);

          this.findArchive();  // 예매내역(아카이브) 확인함수 추가

          this.watchedMovieTotalCount = response.data.totalItems;
          console.log("this.watchedMovieTotalCount", this.watchedMovieTotalCount);
        })
        .catch((e) => {
          console.log(e);
        });
    },

    // 페이징
    handlePageChange(value){
    this.page = value;
    this.getReview();
    },

  },
  mounted() {
    custom();
    this.getUser();
    this.getReservMovieInfo(); // 본 영화 조회
  },
};
</script>

<style scoped>
/* 영화제목 div 크기지정 */
.movieTitle {
  height: 50px;
}
.movieTitle-2 {
  height: 35px;
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

/* 환영, 아카이브없음 글자색 변경 */
.welcome {
  color: rgb(221, 252, 56);
}

/* 예매내역 없음 */
.noArchive{
  color:lightslategray;
}

.mytitle{
  color: azure;
}

/* 탑버튼 */
.topbutton{
    position:fixed; bottom:15px; right:15px; width:40px; height:40px; z-index:1; opacity:0.8;
}
</style>
