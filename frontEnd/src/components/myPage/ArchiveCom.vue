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
              <h1>{{ user.name }}’s archive</h1>
              <ul class="breadcumb">
                <li class="active">
                  <router-link to="/">Home</router-link>
                </li>
                <li><span class="ion-ios-arrow-right"></span>MY ARCHIVE</li>
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
            <!-- 2) 리뷰 파트 시작 -->
            <div class="topbar-filter user">
              <p>나의 리뷰: 영화 관람평가</p>
              <a href="userfavoritegrid.html" class="grid"
              ><i class="ion-grid"></i
              ></a>
            </div>

            <!-- 리뷰작성 -->
            <div id="reviews" class="tab review">
              <div class="row" style="padding: 3%">
                <div class="reviewForm">
                  <h2>{{ movie.movienm }}</h2>
                  <div class="rv-hd">
                    <!-- <div
                      class="div"
                      v-for="(data, index) in movie"
                      :key="index"
                    >
                      <h2>{{ data.movienm }}</h2>
                    </div> -->
                  </div>
                  <div>
                    <div class="rv-hd">
                      <form
                          class="review-form col-xs-12"
                          name="myform"
                          id="myform"
                          method="post"
                      >
                        <!-- 리뷰 작성폼 시작 -->
                        <div>
                          <fieldset>
                            <span class="review-form-style"
                            >별점을 선택해주세요</span
                            >
                            <input
                                type="radio"
                                name="reviewStar"
                                value="5"
                                id="rate1"
                                v-model="editReview.rurating"
                            /><label for="rate1">★</label>
                            <input
                                type="radio"
                                name="reviewStar"
                                value="4"
                                id="rate2"
                                v-model="editReview.rurating"
                            /><label for="rate2">★</label>
                            <input
                                type="radio"
                                name="reviewStar"
                                value="3"
                                id="rate3"
                                v-model="editReview.rurating"
                            /><label for="rate3">★</label>
                            <input
                                type="radio"
                                name="reviewStar"
                                value="2"
                                id="rate4"
                                v-model="editReview.rurating"
                            /><label for="rate4">★</label>
                            <input
                                type="radio"
                                name="reviewStar"
                                value="1"
                                id="rate5"
                                v-model="editReview.rurating"
                            /><label for="rate5">★</label>
                          </fieldset>
                          <textarea
                              v-model="editReview.rucontent"
                              class="col-auto form-control"
                              style="fontsize: 91%"
                              type="text"
                              id="reviewContents"
                              required
                              placeholder="평점 및 영화 관람평을 작성해주세요. 주제와 무관한 리뷰 또는 스포일러는 삭제될 수 있습니다."
                          ></textarea>
                        </div>
                        <!-- 리뷰작성폼 끝 -->
                      </form>

                      <!-- 리뷰등록 버튼 -->
                      <!-- <div v-if="!submitted"> -->
                      <div>
                        <div class="col-xs-3">
                          <a href="#" class="redbtn" @click="saveReview"
                          >관람평 등록</a
                          >
                        </div>
                        <!-- 등록버튼 끝 -->
                      </div>
                    </div>
                    <!-- 
                    <div v-else>
                      <div class="alert alert-success" role="alert">
                        관람평이 등록되었습니다.!
                      </div>
                      <router-link to="/archive" class="alert alert-success"
                        >뒤로</router-link
                      >
                    </div> -->
                  </div>
                </div>
              </div>
            </div>
            <!-- 리뷰작성 끝 -->

            <!-- 나의 리뷰 메뉴바  -->
            <div class="topbar-filter user">
              <p>
                나의 리뷰 <span> {{ reviewTotalCount }} </span> in total
              </p>
              <a href="userfavoritegrid.html" class="grid"
              ><i class="ion-grid"></i
              ></a>
            </div>

            <!-- 나의 리뷰 조회 시작 -->
            <div class="row">

              <!-- 리뷰 : 2 -->
              <div class="col-xs-12 movie-item-style-2 userrate"
                   v-for="(data, index) in review"
                   :key="index">
                <div class="mv-user-review-item"></div>
                <!-- 영화정보 -->
                <div class="col-xs-3">
                  <div class="mv-item-infor">
                    <br/>
                    <h6>
                      <a href="#"
                      >{{ data.movienm }}
                        <span> ({{ data.opendt }}) </span></a
                      >
                    </h6>
                    <p>
                      Run Time: {{ data.showtm }}분 <br/><a
                    >{{ data.watchgradenm }}
                    </a>
                    </p>
<!--                    <span class="time sm">{{ data.scheNo }}</span>-->
                    <br/>
                  </div>
                </div>

                <!-- 영화정보 : 하드코딩이었음 (review에 )-->
                <div class="col-xs-8">
                  <div class="row" style="padding: 3%">
                    <div class="user-infor">
                      <div class="mv-user-review-item">
                        <div class="rate-star">
                          <h6>
                            나의 별점
                            <span
                                class="rate-star-result"
                                v-for="(i, index) in review.userStarRating"
                                :key="index"
                            ><i class="ion-ios-star"></i
                            ></span>
                          </h6>
                        </div>
                      </div>
                      <!-- 리뷰 내용 -->
                      <p style="margin-top: 2%">
                        {{ data.rucontent }}
                      </p>
                    </div>
                  </div>
                </div>
                <!-- 리뷰삭제 버튼 -->
                <div class="col-xs-2 deletebtn">
                  <div class="movie-item-style-2">
                    <a href="#" class="redbtn">삭제</a>
                  </div>
                </div>
                <!-- 리뷰삭제 버튼 끝 -->
              </div>

              <!-- 리뷰 : 3 -->
            </div>
            <!-- 나의 리뷰 조회 끝 -->

            <!-- 페이지 -->
            <!-- <ul class="pagination">
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
            </ul> -->
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
// User
import User from "@/model/user";
import userService from "@/services/user.service";
// Review
import ReviewDataService from "@/services/ReviewDataService";
import Review from "@/model/review";
// MovieDetail
import MovieDataService from "@/services/MovieDataService";


export default {
  // 시작 시 실행
  mounted() {
    custom();
    this.getUser();
    this.getMovieData();
  },
  data() {
    return {
      // User Part
      user: new User(),
      message: "",
      username: this.$store.state.auth.user.username,

      // Review Part
      review: [new Review()], // 리뷰
      reviewTotalCount: 0,
      editReview: new Review(),
      submitted: false, // 리뷰작성후 버튼 클릭시 true로 변경

      // Movie Part
      movie: [], // 임시로 movie로 출력확인 - 나중에 예매한 영화 들어오면 지울거임
      moviecd: this.$route.params.moviecd,
      starRating: 0, // 가져온 평점을 내림함수로 정수 만들어주기 위한 변수
      userReview: "",
      userStarRaing: 3,

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 20, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
      pageSizes: [3, 6, 9], // select box 에 넣을 기본 데이터
    };
  },
  methods: {
    // 백엔드 데이터 받는 함수
    getUser() {
      // username = this.$store.state.auth.user.username;
      console.log("username: " + this.username);
      userService
          .getUserUsername(this.username)
          .then((response) => {
            this.user = response.data;
            console.log("getUser this.user: ", this.user);
            console.log("getUser response.data: ", response.data);

            this.getReview();
          })
          .catch((err) => console.log(err));
    },
    // 아리 별점
    cutNames() {
      // this.watchedMovie.starRating = Math.floor(this.watchedMovie.rating);
      this.watchedMovie.starRating = Math.floor(this.watchedMovie.rating);
      // alert(this.movie.starRating);
    },
    // 리뷰 출력 - 내가 예매한 테이블에서 가져와야함.. moviecd 수정필요
    getReview() {
      // alert("this.user.name: " + this.user.name);
      // alert("this.moviecd: " + this.moviecd);
      ReviewDataService.getRwuserAndMoviecd(this.user.name, this.moviecd, this.page - 1, this.pageSize)
          .then((response) => {
            this.review = response.data.review;
            console.log("response.data: ", response.data);
            console.log("this.review: ", this.review);

            // 내가 쓴 리뷰 갯수
            this.reviewTotalCount = this.review.length;
            console.log("this.reviewTotalCount", this.reviewTotalCount);
          })
          .catch((e) => {
            console.log(e);
          });
    },
    // 새로운 리뷰 저장 함수
    saveReview() {
      // 리뷰 생성
      this.editReview.rwuser = this.user.name;
      this.editReview.movienm = this.movie.movienm;
      this.editReview.moviecd = this.movie.moviecd;
      this.editReview.showtm = this.movie.showtm;
      this.editReview.opendt = this.movie.opendt;
      this.editReview.watchgradenm = this.movie.watchgradenm;
      ReviewDataService.create(this.editReview)
          .then((response) => {
            console.log(response.data);
            alert("리뷰 저장");
            // window.location.reload();
            this.getReview();
            // this.newReview()
          })
          .catch((e) => {
            alert("리뷰저장 실패");
            console.log(e);
            // window.location.reload();
            alert(this.review.rid);
          });
    },
    newReview() {
      // 새양식 다시 보여주기, 변수 초기화
      this.submitted = false;
      this.review = [new Review()];
    },
    deleteReview() {
      alert("클릭");
      this.review = data;
      var test = this.review.rid;
      alert(JSON.stringify(test));
      // ReviewDataService.delete(this.review.moviecd)   // 영화코드로 삭제하기  FIXME:
      ReviewDataService.delete(this.review.rid) // 리뷰 사용자로 삭제하기  FIXME:
          .then((response) => {
            console.log(response.data);
            alert("리뷰가 삭제되었습니다.");
            // window.location.reload();    // 홈으로 새고
            // this.$router.push("/archive");    // 홈으로 새고됨..
            this.getReview()
          })
          .catch((e) => {
            console.log(e);
          });
    },
    getMovieData() {
      MovieDataService
          .getMovieDetail(this.moviecd)
          .then(response => {
            this.movie = response.data.MovieDetail[0];
            console.log("response.data: ", response.data);
            console.log("this.movie: ", this.movie);
          })
          .catch(error => {
            console.log("error: ", error);
          })
    },
    // 로그아웃
    logout() {
      // this.$store.dispatch("모듈명/함수명")
      this.$store.dispatch("auth/logout"); // 공통함수 logout 호출
      this.$router.push("/"); // 강제 홈페이지로 이동
    },
  },
};
</script>

<style scoped>
/* 리뷰쓰기 css */
.reviewForm {
  height: 350px;
}

#myform fieldset {
  display: inline-block;
  direction: rtl;
  border: 0;
}

#myform fieldset legend {
  text-align: right;
}

#myform input[type="radio"] {
  display: none;
}

#myform label {
  font-size: 3em;
  color: transparent;
  text-shadow: 0 0 0 #f0f0f0;
}

#myform label:hover {
  text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
}

#myform label:hover ~ label {
  text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
}

#myform input[type="radio"]:checked ~ label {
  text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
}

#reviewContents {
  width: 100%;
  height: 150px;
  padding: 10px;
  box-sizing: border-box;
  border: solid 1.5px #d3d3d3;
  border-radius: 5px;
  font-size: 16px;
  resize: none;
}

.review-form {
  padding-left: 0%;
  margin-bottom: 5%;
}

.review-form-style {
  color: #999;
}

.list {
  text-align: left;
  max-width: 750px;
  margin: auto;
}

.deletebtn {
  margin-top: 10%;
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
