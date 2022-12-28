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
              <h1>{{ CurrentUser.name }}’s profile</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>Profile</li>
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
                  <li>
                    <router-link to="/myticket">예매내역</router-link>
                  </li>
                  <li class="active">
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
                  <li><a href="#">탈퇴하기</a></li>
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->

          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user">
              <p>찜한 영화목록 <span>8 movies</span> in total</p>
              <select>
                <option value="range">-- 2022년 --</option>
                <option value="saab">-- 2021년 --</option>
              </select>
            </div>

            <div class="flex-wrap-movielist">
              <!-- 상영작 1 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv1.jpg" alt="" />
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <!-- 제목 -->
                <!-- 2022년 태그 달 -->
                <div class="mv-item-infor">
                  <h6><a href="#">oblivion</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>8.1</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>

              <!-- 상영작 2 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv2.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">into the wild</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.8</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 3 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv-item3.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">Die hard</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.4</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 4 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv-item4.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">The walk</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.4</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 5 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv3.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">blade runner </a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.3</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 6 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv4.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">Mulholland pride</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.2</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 7 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv5.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">skyfall: evil of boss</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.0</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
              <!-- 상영작 8 -->
              <div class="movie-item-style-2 movie-item-style-1">
                <img src="images/uploads/mv-item1.jpg" alt="" />
                <div class="hvr-inner">
                  <router-link to="/ticket-detail-a">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                  </router-link>
                </div>
                <div class="mv-item-infor">
                  <h6><a href="#">Interstellar</a></h6>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>7.4</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
                </div>
              </div>
            </div>

            <!-- 페이지 -->
            <ul class="pagination">
              <li class="icon-prev">
                <a href="#"><i class="ion-ios-arrow-left"></i></a>
              </li>
              <li class="active"><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">...</a></li>
              <li><a href="#">21</a></li>
              <li><a href="#">22</a></li>
              <li class="icon-next">
                <a href="#"><i class="ion-ios-arrow-right"></i></a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
/* eslint-disable */
// import axios from "axios";   // 프로필이미지 업로드
import custom from "@/assets/js/custom";
import userService from "@/services/user.service";

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
        answer: "",
      },
      message: "",

      // FIXME: 예매한 영화.. 작성중
      watchedMovie: {
        username: "", // 아이디
        paidDate: "", // 예매일자
        reservNo: "", // 예매번호
        openDt: "", // 개봉년도
        movieNm: "", // 영화제목   -> title로 바꿔야하나?
        posterURL:
          "https://movie-phinf.pstatic.net/20221215_185/1671091761840XXpCR_JPEG/movie_image.jpg?type=m665_443_2", // 포스터 주소는 1개만 받으면 됩니다.",  // 영화포스터이미지
          directors: "제임스카메론", // 감독
        rating: 4.3, // 평점(관람객)
        starRating: 3.5, // 나중에 백엔드에서 평점 가져오기 (정수로 받아야 합니다,,)
        showTm: "192", // 상영시간
        watchGradeNm: "12세관람가", // 관람등급
        scheNo: "2022/12/28", // 상영스케쥴 - 날짜
        startTime: "18:00",    // 상영스케쥴 - 시간
        theaterId: "DS CINEMA 서면", // 상영관 지점
        screen: "1관",  // 스크린번호
        seatNo: "I3", // 좌석번호
        cnt: "1", // 예매수량
        price: "15000", // 금액
      },
       // TODO: 리뷰
       reviewMovie: {
        myrating: "",
      },
    };
  },
  methods: {
    // uploadImage: function () {
    //   let form = new FormData();
    //   let image = this.$refs["image"].files[0];
    //
    //   form.append("image", image);
    //
    //   axios
    //     .post("/upload", form, {
    //       header: { "Content-Type": "multipart/form-data" },
    //     })
    //     .then(({ data }) => {
    //       this.images = data;
    //     })
    //     .catch((err) => console.log(err));
    // },
    // clickInputTag: function () {
    //   this.$refs["image"].click();
    // },

    // 종학이 백엔드 데이터 받는 함수
    getUser(username) {
      username = "forbob";
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
    // 로그아웃 함수 -> 공통함수 호출
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },
  },
  mounted() {
    custom();
    this.getUser(); // 종학이 백엔드 데이터
  },
};
</script>

<style scoped>
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
</style>
