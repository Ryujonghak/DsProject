<template>
  <div v-if="wishlist != null">
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
              <h1>{{ user.name }}’s wish</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY WISH</li>
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
                <img class="profileImg" src="@/assets/images_choi/Views/choi/MovieDetail/user.png" alt=""/>
                <br/>
              </div>
              <div class="user-fav">
                <ul>
                  <li class="active">
                    <router-link to="">프로필</router-link>
                  </li>
                  <!-- 프로필 로그인 정보 표시 시작-->
                  <li style="color: white">
                    <strong style="color: white">이름 </strong>
                    <label>{{ user.name }}</label>
                  </li>
                  <li style="color: white">
                    <strong style="color: white">아이디 </strong>
                    <label>{{ user.username }}</label>
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
                </ul>
              </div>
            </div>
          </div>
          <!-- 공통 왼쪽 메뉴 끝 -->
          <!-- 오른쪽 본문 내용 -->
          <div class="col-md-9 col-sm-12 col-xs-12">
            <div class="topbar-filter user" id="portfolio-filters">
              <p>나의 찜한 영화 <span>{{ totalMovie }}</span> in total</p>
              <div>
                <span class="mx-3 active" data-filter="*">ㅇAll Movie </span>
                <span class="mx-3" data-filter=".2022">ㅇ2022 </span>
                <span class="mx-3" data-filter=".2023">ㅇ2023</span>
              </div>
              <span class="grid" data-filter="*"><i class="ion-grid"></i></span>
            </div>

            <div class="flex-wrap-movielist">
              <!-- 상영작 1 -->
              <div
                  class="movie-item-style-2 movie-item-style-1 portfolio-item 2022"
                  v-for="(data, index) in wishlist" :key="index"
              >
                <img :src="data.posterurln" alt="poster"/>
                <!-- 영화에 마우스 올리면 나오는 상세페이지 이동 버튼 -->
                <div class="hvr-inner">
                  <router-link to="/reserveTicket">
                    예매하기 
                  </router-link>
                </div>
                <!-- <router-link :to="'/reserveTicket/' + data.moviecd">
                    예매하기 <i class="ion-android-arrow-dropright"></i>
                </router-link> -->

                <!-- 제목 -->
                <div class="mv-item-infor">
                  <router-link :to="'/allMovie/' + data.moviecd">
                    <h6><a href="#">{{ data.movienm }}</a></h6>
                  </router-link>
                  <p class="rate">
                    <i class="ion-android-star"></i><span>{{ data.raiting }}</span> /10
                    <!-- <i class="ion-android-star"></i><span>{{ movie.userRating }}</span> /10 -->
                  </p>
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
import User from "@/model/user";
import WishlistDataService from "@/services/WishlistDataService";

export default {

  // data: () => ({
  //   images: "",
  // }),
  data() {
    return {
      wishlist: null,
      username: this.$store.state.auth.user.username,
      user: new User(),
      message: "",
      movie: [],
      totalMovie: 0,

    };
  },
  methods: {
    getWishlist() {
      WishlistDataService
          .getUsernameMovie(this.$store.state.auth.user.username)
          .then((res) => {
            this.wishlist = res.data;
            this.totalMovie = this.wishlist.length;

            console.log(this.$store.state.auth.user.username);
            console.log(this.$route.params.moviecd);
            // console.log(res.data);
            console.log("wishlist: ", this.wishlist);
            // alert("get");
            // this.getMovie();
          })
          .catch(err => {
            console.log(err);
          });
    },
    getUser() {
      // username = this.$store.state.auth.user.username;
      console.log("username: " + this.username);
      userService
          .getUserUsername(this.username)
          .then((response) => {
            this.user = response.data;
            console.log("getUser this.user: ", this.user);
            // console.log("getUser response.data: ", response.data);
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
    this.getWishlist();

    // TODO:  isotope
    $(".flex-wrap-movielist").imagesLoaded(function () {
      // Isotope 초기화 실행
      let portfolioIsotope = $(".flex-wrap-movielist").isotope({
        itemSelector: ".portfolio-item", // Isotope 대상 아이템 선택
        layoutMode: "fitRows", // 여러가지 배치형태 옵션
      });
      // Isotope 메뉴 클릭 시 배치를 다시 정렬
      // id는 #으로 접근
      // div의 id="portfolio-filters" 의 span태그 클릭이벤트
      $("#portfolio-filters span").on("click", function () {
        $("#portfolio-filters span").removeClass("active"); // 기존 클래스에 active  삭제
        $(this).addClass("active"); // 현재 클릭한 클래스에 active 추가

        // Isotope 필터 적용시키기
        portfolioIsotope.isotope({
          filter: $(this).data("filter"), // 현재 클릭한 얘(this)의 li태그(리트스목록태그)의 data filter 속성 값을 filter에 저장
        });
      });
    });
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
