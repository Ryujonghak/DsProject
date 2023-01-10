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
                  <!--                  <li><a href="#">Log out</a></li>-->
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
                  <!-- <div class="user-infor"> -->
                  <img
                    src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                    alt="user"
                  />
                  <div class="welcome">
                    <!-- <p>{{ CurrentUser.id }} choichoi</p> -->
                    <h3>{{ CurrentUser.name }} 님</h3>
                    <h3>환영해요!</h3>
                    <!-- </div> -->
                  </div>
                </div>

                <div class="col-xs-6 mv-user-review-item">
                  <!-- <div class="user-infor"> -->
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
                    <!-- <router-link to ="/archive/:moviecd"
                      ><p>나의 아카이브 <span>{{ reviewTotalCount }}</span> in total</p></router-link> -->
                    <p>나의 아카이브 <span>{{ watchedMovieTotalCount }}</span> in total</p>
                    <a href="userfavoritegrid.html" class="grid"
                      ><i class="ion-grid"></i
                    ></a>
                  </div>

                  <div v-if="emptyArchive == true" class="noArchive">
                    <h3>예매내역이 없습니다.</h3>
                  </div>

                  <!-- 나의 아카이브 내용 시작 -->
                  <!-- TODO: 예매내역 정보 받아오기 :  -->
                  <div class="flex-wrap-movielist" v-if="emptyArchive == false">
                    <!-- 아카이브 시작 -->
                    <div class="movie-item-style-2 movie-item-style-1" 
                    v-for="(data, index) in watchedMovie" v-bind:key="index">
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
                      <!-- todo) 영화에 마우스 올리면 나오는 관람정보: 리뷰하러가기 -->
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
                          {{ data.startday }} | {{ data.starttime }} <br />
                          상영시간: {{ data.showtm }}분 <br />
                          감독: {{ data.directors }}
                        </p>
                        <!-- 리뷰테이블에서 사용자 평점 가져오기
                        <p class="time sm-text">
                          나의 별점
                          <i class="ion-android-star"></i
                          ><span>{{ data.userStarRating }}</span>
                        </p> -->
                        <!-- TODO: 버튼 클릭시 클릭이벤트-영화정보.movieNm 넘겨줘야함 -->
                        <router-link :to="'/archive/' + data.moviecd">
                          나의 리뷰 작성하기
                        </router-link>
                        <!-- <h6>Best Musical movie</h6> -->
                      </div>
                      <!-- 영화에 마우스 올리면 나오는 관람정보: 리뷰를 위한 영화정보 끝 -->
                    </div>
                    <!-- 아카이브 끝 -->

                    <!-- 아카이브 상영작 하드코딩 -->
                    <!-- <div class="movie-item-style-2 movie-item-style-1">
                      <img :src="watchedMovie.posterURL" alt="poster" />
                      <div class="hvr-inner">
                        <div class="movieTitle">
                          <h6>
                            <router-link to="/movieDetail">
                              {{ watchedMovie.movieNm }}
                              <span
                                >({{ watchedMovie.openDt }})</span
                              ></router-link
                            >
                          </h6>
                        </div>
                        <p>
                          {{ watchedMovie.scheNo }} <br />
                          상영시간: {{ watchedMovie.showTm }}분 <br />
                          감독: {{ watchedMovie.directors }}
                        </p>
                        <p class="time sm-text">
                          나의 별점
                          <i class="ion-android-star"></i
                          ><span>{{ reviewMovie.userStarRating }}</span>
                        </p>
                        <router-link to="/archive" @click="goReview"
                          >나의 리뷰 작성하기</router-link
                        >
                      </div>
                      <div class="mv-item-infor">
                        <div class="movieTitle-2">
                          <h6>
                            <a href="/movieDetail">{{
                              watchedMovie.movieNm
                            }}</a>
                          </h6>
                        </div>
                        <p class="rate">
                          <i class="ion-android-star"></i
                          ><span>{{ watchedMovie.rating }}</span> /5
                        </p>
                      </div>
                    </div> -->
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
    <!-- TODO: 탑버튼 추가 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png"/>
    </a>
          
  </div>
</template>

<script>
/* eslint-disable */

// import axios from "axios";   // 프로필이미지 업로드
import custom from "@/assets/js/custom";
import userService from "@/services/user.service";
// import MovieDataService from "@/services/MovieDataService";
import ReservationDataService from "@/services/ReservationDataService";

export default {
  // data: () => ({
  //   images: "",
  // }),
  data() {
    return {
      // movie: [],    // 전체 탑텐 영화
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

      // FIXME: 예매한 영화.. 작성중
      // watchedMovie: [],
      // watchedMovie: {
      //   username: "", // 아이디
      //   paidDate: "", // 예매일자
      //   reservNo: "", // 예매번호
      //   openDt: "2022", // 개봉년도
      //   movieNm: "눈의 여왕5: 스노우 프린세스와 미러랜드의 비밀", // 영화제목   -> title로 바꿔야하나?
      //   posterURL:
      //     "https://movie-phinf.pstatic.net/20221215_185/1671091761840XXpCR_JPEG/movie_image.jpg?type=m665_443_2", // 포스터 주소는 1개만 받으면 됩니다.",  // 영화포스터이미지
      //   directors: "제임스카메론", // 감독 (최대7자)
      //   rating: 4.3, // 평점(관람객)
      //   starRating: 3.5, // 나중에 백엔드에서 평점 가져오기 (정수로 받아야 합니다,,)
      //   showTm: "192", // 상영시간
      //   watchGradeNm: "12세관람가", // 관람등급
      //   scheNo: "2022/12/28", // 상영스케쥴
      //   seatNo: "I3", // 좌석번호
      //   cnt: "1", // 예매수량
      //   price: "15000", // 금액
      // },
      // TODO: 리뷰
      review: [],
      // reviewMovie: {
      //   userStarRating: 2, // 사용자별점
      //   userReview: "", // 리뷰내용
      // },

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 5, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
      pageSizes: [5, 10, 15], // select box 에 넣을 기본 데이터
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

    findArchive() {
      if(this.wishlist.length == 0) {
        this.emptyArchive = true;
      } else {
        this.emptyArchive = false;
      }
      console.log("findArchive", this.watchedMovie);
    },

    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },
    // 영화 탑텐 조회 요청
    // getMovieInfo() {
    //   MovieDataService.getMovieAll()
    //     .then((response) => {
    //       this.movie = response.data;
    //       console.log(response.data);
  // 
    //     })
    //     .catch((e) => {
    //       console.log(e);
    //     });
    // },

    
    getReservMovieInfo() {
    // 본 영화 전체 조회 요청
      ReservationDataService.getUsernameReservation(this.user.username, this.page -1, this.pageSize)
        .then((response) => {
          this.watchedMovie = response.data;
          console.log(response.data);
          this.findArchive();  // 예매내역(아카이브) 확인함수 추가


          this.watchedMovieTotalCount = this.watchedMovie.totalItems;
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
    this.getUser(); // 엔드 데이터
    // this.getMovieInfo(); // 영화 탑텐
    getReservMovieInfo(); // 본 영화 조회
  },
};
</script>

<style scoped>
.box-image {
  width: 55px;
  height: 70px;
}

.movie-detail-content {
  padding-left: 0;
}

.movie-detail-content-bottom {
  padding-bottom: 10px;
}

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

.noArchive{
  color:lightslategray;
}



/* TODO: 탑버튼 추가 */
.topbutton{
    position:fixed; bottom:15px; right:15px; width:40px; height:40px; z-index:1; opacity:0.8;
}
</style>
