<template>
  <div>
    <!-- TODO: 영화 상세보기 페이지입니다. 메인 케러셀 -> 메인 디테일 -> 상세보기 통해서도 올 수 있고 전체 영화보기를 통해서도 들어올 수 있습나다. -->
    <div class="hero mv-single-hero">
      <div class="container">
        <div class="row">
          <div class="col-md-12"></div>
        </div>
      </div>
    </div>

    <div class="page-single movie-single movie_single">
      <div class="container">
        <div class="row ipad-width2">
          <!-- 왼쪽 사이드 바 시작 -->
          <div class="col-md-4 col-sm-12 col-xs-12">
            <div class="movie-img">
              <img :src="movie.posterurln" alt="poster" style="width: 310px" />
              <div class="movie-btn">
                <div class="btn-transform transform-vertical red">
                  <div>
                    <a href="#" class="item item-1 redbtn">
                      <i class="ion-play"></i>예고편보기</a
                    >
                  </div>
                  <div>
                    <!-- TODO: 유튜브 URL, 영화 이름, 예매 페이지 연결 등 백엔드 데이터 받아와야 하는 곳 -->
                    <a
                      :href="movie.utubeurl"
                      class="item item-2 redbtn fancybox-media hvr-grow"
                      ><i class="ion-play"></i
                    ></a>
                  </div>
                </div>
                <div class="btn-transform transform-vertical">
                  <div>
                    <a class="item item-1 yellowbtn">
                      <i class="ion-card"></i>예매하기</a
                    >
                  </div>
                  <div>
                    <router-link
                      :to="'/SeatTest/' + movie.moviecd"
                      class="item item-2 yellowbtn"
                      ><i class="ion-card"></i
                    ></router-link>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- 왼쪽 사이드 바 끝 -->

          <div class="col-md-8 col-sm-12 col-xs-12">
            <div class="movie-single-ct main-content">
              <h6
                style="margin-bottom: 1%; color: #abb7c4"
                v-show="showBoxoffice"
              >
                현재 박스오피스 {{ boxofficeRank }} 위
              </h6>
              <h1 class="bd-hd" style="margin-bottom: 40px">
                {{ movie.movienm }}<span>{{ mYear }}</span>
              </h1>
              <div class="social-btn">
                <a
                  v-show="wishlist.username == null"
                  class="parent-btn"
                  @click="likeSave"
                  ><i class="ion-ios-heart-outline"></i>찜하기</a
                >
                <a
                  v-show="wishlist.username != null"
                  class="parent-btn"
                  @click="likeSave"
                  ><i class="ion-ios-heart"></i>찜하기 완료</a
                >
                <!-- <div class="hover-bnt"> -->
                <!-- <a href="#" class="parent-btn" id="sh-link"
                  ><i class="ion-android-share-alt"></i>공유하기</a
                > -->
                <!-- </div> -->
              </div>
              <div class="movie-rate">
                <div class="rate">
                  <i class="ion-android-star"></i>
                  <p>
                    <span>{{ movie.raiting }}</span> /10<br />
                  </p>
                </div>
                <div class="rate-star">
                  <p>별점:</p>
                  <span
                    class="rate-star-result"
                    v-for="(i, index) in starRating"
                    :key="index"
                    ><i class="ion-ios-star"></i
                  ></span>
                </div>
              </div>

              <div class="movie-tabs">
                <div class="tabs">
                  <!-- <ul class="tab-links tabs-mv">
                    <li class="active" @click="toOverview"><a>영화정보</a></li>
                    <li><a @click="toReview">평점 및 관람평</a></li>
                    <li><a @click="toMedia">포스터/스틸컷</a></li>
                  </ul> -->
                  <div class="tab-content">
                    <!-- 1) 영화 정보 시작 -->
                    <div class="tab active" v-show="overview">
                      <ul class="tabs-mv tab-bar">
                        <li>
                          <a class="selected" @click="toOverview">영화정보</a>
                        </li>
                        <li>
                          <a class="not-selected" @click="toReview"
                            >평점 및 관람평</a
                          >
                        </li>
                        <li>
                          <a class="not-selected" @click="toMedia"
                            >포스터/스틸컷</a
                          >
                        </li>
                      </ul>
                      <div class="row">
                        <div class="col-md-8 col-sm-12 col-xs-12">
                          <p>
                            {{ movie.plot }}
                          </p>
                          <div class="title-hd-sm">
                            <h4>포스터/스틸컷</h4>
                            <div class="tab-links active">
                              <a href="#media" class="time" @click="toMedia"
                                >더보기 <i class="ion-ios-arrow-right"></i
                              ></a>
                            </div>
                          </div>
                          <!-- 표지 이미지들 (최대 4개까지 가져오고싶음) -->
                          <!-- 이미지 가져오기 test 시작 -->
                          <span class="mvsingle-item ov-item">
                            <a
                              v-for="(data, index) in tempImgUrl"
                              :key="index"
                              class="img-lightbox"
                              data-fancybox-group="gallery"
                              ><img
                                class="small-thumnail"
                                :src="data"
                                alt="썸네일"
                            /></a>
                          </span>
                          <!-- 이미지 가져오기 test 끝 -->
                          <div class="title-hd-sm">
                            <h4>출연/대표작</h4>
                          </div>
                          <!-- 목록 불러오기 테스트 시작 -->
                          <!-- 2번째 실험 시작 -->
                          <div class="mvcast-item">
                            <ul class="col-xs-6">
                              <li
                                class="cast-it"
                                style="color: #abb7c4"
                                v-for="(data, index) in movie.actor"
                                :key="index"
                              >
                                {{ data }}
                              </li>
                            </ul>
                            <ul class="col-xs-6">
                              <li
                                class="cast-it"
                                style="color: #abb7c4"
                                v-for="(data, index) in movie.cast"
                                :key="index"
                              >
                                {{ data }}
                              </li>
                            </ul>
                          </div>
                          <!-- 목록 불러오기 테스트 끝 -->
                        </div>

                        <!-- 오른쪽 사이드 바 시작 -->
                        <!-- TODO: 감독, 장르, 개봉일, 러닝타임 등 데이터 가져오기 -->
                        <div class="col-md-4 col-xs-12 col-sm-12">
                          <div class="sb-it">
                            <h6>감독:</h6>
                            <p>{{ movie.directors }}</p>
                          </div>
                          <div class="sb-it">
                            <h6>장르:</h6>
                            <p>{{ movie.genrenm }}</p>
                          </div>
                          <div class="sb-it">
                            <h6>관람등급:</h6>
                            <p>{{ movie.watchgradenm }}</p>
                          </div>
                          <div class="sb-it">
                            <h6>개봉:</h6>
                            <p>{{ movie.opendt }}</p>
                          </div>
                          <div class="sb-it">
                            <h6>러닝타임:</h6>
                            <p>{{ movie.showtm }}분</p>
                          </div>
                        </div>
                        <!-- 오른쪽 사이드 바 끝 -->
                      </div>
                    </div>
                    <!-- 1) 영화 정보 끝 -->

                    <!-- 2) 리뷰 파트 시작 -->
                    <div id="reviewPart" class="tab active" v-show="reviews">
                      <ul class="tabs-mv tab-bar">
                        <li>
                          <a class="not-selected" @click="toOverview"
                            >영화정보</a
                          >
                        </li>
                        <li>
                          <a class="selected" @click="toReview"
                            >평점 및 관람평</a
                          >
                        </li>
                        <li>
                          <a class="not-selected" @click="toMedia"
                            >포스터/스틸컷</a
                          >
                        </li>
                      </ul>
                      <div class="row" style="padding: 3%">
                        <div class="rv-hd">
                          <div class="div">
                            <h3>DS CINEMA</h3>
                            <h2>{{ movie.movienm }}</h2>
                          </div>
                        </div>
                        <div class="rv-hd" v-show="emptyReview()">
                          <form
                            class="review-form col-xs-9"
                            name="myform"
                            id="myform"
                            method="post"
                          >
                            <fieldset>
                              <!-- <span class="review-form-style">별점을 선택해주세요</span> -->
                              <input
                                type="radio"
                                name="reviewStar"
                                value="5"
                                id="rate1"
                                v-model="addReview.rurating"
                              /><label for="rate1">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="4"
                                id="rate2"
                                v-model="addReview.rurating"
                              /><label for="rate2">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="3"
                                id="rate3"
                                v-model="addReview.rurating"
                              /><label for="rate3">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="2"
                                id="rate4"
                                v-model="addReview.rurating"
                              /><label for="rate4">★</label>
                              <input
                                type="radio"
                                name="reviewStar"
                                value="1"
                                id="rate5"
                                v-model="addReview.rurating"
                              /><label for="rate5">★</label>
                            </fieldset>
                            <div>
                              <textarea
                                v-model="addReview.rucontent"
                                class="col-auto form-control"
                                style="fontsize: 91%"
                                type="text"
                                id="reviewContents"
                                placeholder="평점 및 영화 관람평을 작성해주세요. 주제와 무관한 리뷰 또는 스포일러는 삭제될 수 있습니다."
                              ></textarea>
                            </div>
                          </form>
                          <div class="col-xs-3">
                            <!-- 리뷰 작성 버튼에 함수 걸어주기 -->
                            <a
                              href="#"
                              class="redbtn"
                              style=""
                              @click="saveReview"
                              >관람평 작성</a
                            >
                          </div>
                        </div>
                        <div
                          class="mv-user-review-item col-xs-12"
                          style="padding-left:0%"
                          v-for="(data, index) in review"
                          :key="index"
                        >
                          <div class="user-infor">
                            <div class="col-xs-2" style="padding-left:0%">
                              <img
                                src="@/assets/images_choi/Views/choi/MovieDetail/user.png"
                                alt="user"
                                style="width: 50%;margin-left: 5%;"
                              />
                              <p class="time" style="fontsize: 100%;margin-left: 15%;">
                                {{ data.rwuser }}
                              </p>
                            </div>
                            <div class="col-xs-10" style="padding-left:0%">
                              <div class="rate-star">
                                <span
                                  class="rate-star-result"
                                  v-for="(i, index) in data.rurating"
                                  :key="index"
                                  ><i
                                    class="ion-ios-star"
                                    style="color: #f5b50a"
                                  ></i
                                ></span>
                              </div>
                              <p style="margin-top: 2%; color: white">
                                {{ data.rucontent }}
                              </p>
                            </div>
                          </div>
                        </div>
                        <!-- Todo : page 바 시작 -->
                        <div class="col-md-12">
                          <b-pagination
                            v-model="page"
                            :total-rows="count"
                            :per-page="pageSize"
                            prev-text="<"
                            next-text=">"
                            @change="handlePageChange"
                          ></b-pagination>
                        </div>
                        <!-- Todo : page 바 끝 -->
                      </div>
                    </div>
                    <!-- 2) 리뷰 파트 끝 -->

                    <!-- 3) 스틸컷 시작 -->
                    <div class="tab active" v-show="media">
                      <ul class="tabs-mv tab-bar">
                        <li>
                          <a class="not-selected" @click="toOverview"
                            >영화정보</a
                          >
                        </li>
                        <li>
                          <a class="not-selected" @click="toReview"
                            >평점 및 관람평</a
                          >
                        </li>
                        <li>
                          <a class="selected" @click="toMedia">포스터/스틸컷</a>
                        </li>
                      </ul>
                      <div class="row" style="padding: 3%">
                        <div class="rv-hd">
                          <div>
                            <h3>DS CINEMA</h3>
                            <h2>{{ movie.movienm }}</h2>
                          </div>
                        </div>
                        <div class="title-hd-sm">
                          <h3>
                            {{ movie.movienm }}에 대한
                            <span style="color: #4280bf">{{
                              imageUrlLength
                            }}</span
                            >개의 스틸컷이 있어요!
                          </h3>
                        </div>
                        <div class="mvsingle-item media-item">
                          <div>
                            <div class="mvsingle-item ov-item">
                              <a
                                v-for="(data, index) in movie.imgurl"
                                :key="index"
                                class="portfolio-box splice"
                                ><img
                                  class="small-thumnail"
                                  :src="data"
                                  alt="썸네일"
                              /></a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <!-- 3) 스틸컷 끝 -->
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- <div >
      <SeatView :movieProps2="movie" />
    </div> -->
    <!-- TODO: 탑버튼 추가_정주희 -->
    <a class="topbutton" href="#">
      <img src="@/assets/images_jung/iconUp_48.png" />
    </a>
  </div>
</template>

<script>
/* eslint-disable */
import MovieDataService from "@/services/MovieDataService";
import Review from "@/model/review";
import ReviewDataService from "@/services/ReviewDataService";
import Wishlist from "@/model/Wishlist";
import WishlistDataService from "@/services/WishlistDataService";
import SeatView from "@/views/kim/SeatView.vue";

export default {
  mounted() {
    // this.emptyReview(); // 로그인 유무 확인(by류종학, 230109)
    // this.$route.params.moviecd : 이전페이지에서 전송한 매개변수는 $route.params 안에 있음
    // $route 객체 : 주로 url 매개변수 정보들이 있음
    // router/index.js 상세페이지 url의 매개변수명 : :moviecd
    this.getMovie(this.$route.params.moviecd);
    this.getBoxoffice(this.$route.params.moviecd);
    this.getReview(this.$route.params.moviecd);
    this.getWishlist();
    // custom();
    // this.cutNames();
  },
  components: {
    SeatView,
  },
  data() {
    return {
      // 찜하기 기능
      wishlist: new Wishlist(),

      movie: null,
      boxoffice: null,
      showBoxoffice: false,
      boxofficeRank: 0,
      review: [],
      alreadyReviewed: false,

      overview: true,
      reviews: false,
      media: false,

      addReview: new Review(),

      starRating: 0, // 가져온 평점을 내림함수로 정수 만들어주기 위한 변수
      userReview: "",
      userStarRaing: 3,
      tempImgUrl: [],
      imageUrlLength: 0,
      mYear: 0,

      // 페이징을 위한 변수 정의
      page: 1, // 현재 페이지
      count: 0, // 전체 데이터 건수
      pageSize: 3, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수
    };
  },
  methods: {
    getBoxoffice(moviecd) {
      MovieDataService.getBoxoffice(moviecd)
        .then((response) => {
          this.boxofficeRank = response.data.BoxOffice[0].rank;
          this.showBoxoffice = true;
          console.log(response.data.BoxOffice);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    // 영화코드(moviecd)로 조회 요청하는 함수
    getMovie(moviecd) {
      MovieDataService.getMoviecd(moviecd)
        .then((response) => {
          this.movie = response.data[0];
          this.cutNames();
          console.log(response.data[0]);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    getReview(moviecd) {
      ReviewDataService.getBycode(moviecd, this.page - 1, 10000000) // 모든 리뷰를 가져오기 위하여 임의로 준 수.
        .then((response) => {
          const currentUserName = this.$store.state.auth.user.username;
          const pastReviews = response.data.review.filter(
            (r) => r.rwuser == currentUserName
          );
          this.alreadyReviewed = pastReviews.length > 0;
        })
        .catch((e) => {
          console.log(e);
        });
      ReviewDataService.getBycode(moviecd, this.page - 1, this.pageSize)
        .then((response) => {
          const { review, totalItems } = response.data;
          this.review = review;
          this.count = totalItems;

          // this.review = response.data;

          // 백엔드에게 빈배열 리턴하라고 요청하기...
          // 이 코드 지우면 첫번째 리뷰를 등록할 장소가 없어서 undefined 에러남...
          // if (!response.data) {
          //   this.review = { review: [] };
          // }

          // this.addReview.rwuser = this.$store.state.auth.user.username;
          console.log(response.data);
          // var test = this.review;
          // alert(JSON.stringify(test));
        })
        .catch((e) => {
          // alert("리뷰 실패");
          console.log(e);
        });
    },
    saveReview() {
      if (this.alreadyReviewed) {
        alert("이미 리뷰를 남기셨습니다.");
        this.addReview = new Review();
        return;
      }

      this.addReview.rwuser = this.$store.state.auth.user.username;
      this.addReview.movienm = this.movie.movienm;
      this.addReview.moviecd = this.movie.moviecd;
      this.addReview.opendt = this.movie.opendt;
      this.addReview.showtm = this.movie.showtm;
      this.addReview.watchgradenm = this.movie.watchgradenm;

      ReviewDataService.create(this.addReview)
        .then((response) => {
          this.addReview.rid = response.data.rid;
          console.log(response.data);
          this.getReview(this.movie.moviecd);

          alert("리뷰가 저장되었습니다.");
          this.addReview = new Review();
        })
        .catch((e) => {
          console.log(e);
        });
    },

    toOverview() {
      this.overview = true;
      this.reviews = false;
      this.media = false;
    },
    toReview() {
      this.overview = false;
      this.reviews = true;
      this.media = false;
    },
    toMedia() {
      this.overview = false;
      this.reviews = false;
      this.media = true;
    },
    cutNames() {
      // 배우, 배역, 이미지 잘라주기
      if (this.movie.actor != null) {
        this.movie.actor = this.movie.actor.split(",");
      }

      if (this.movie.cast != null) {
        this.movie.cast = this.movie.cast.split(",");
      }

      if (this.movie.imgurl != null) {
        this.movie.imgurl = this.movie.imgurl.split(",");
        // 가져온 이미지 url 개수
        this.imageUrlLength = this.movie.imgurl.length;

        // 썸네일 이미지 2장만 보이게 설정
        this.tempImgUrl[0] = this.movie.imgurl[0];
        this.tempImgUrl[1] = this.movie.imgurl[1];
      }

      // 개봉일에서 연도만 잘라주기
      this.mYear = this.movie.opendt.substr(0, 4);

      if (this.movie.raiting != null) {
        // 데이터 들어온 평점 내림하기 (별 반복문 돌리기 위해서)
        this.starRating = Math.floor(this.movie.raiting);
      }

      // 관람등급 데이터가 2번 연달아 붙여서 오는 경우가 있어서 그 경우 잘라주기
      if (this.movie.watchgradenm.includes(",")) {
        this.movie.watchgradenm = this.movie.watchgradenm.split(",")[0];
      }
    },
    likeSave() {
      if (this.wishlist.username == null) {
        // alert("get");
        this.wishlist = new Wishlist();
        this.wishlist.username = this.$store.state.auth.user.username;
        this.wishlist.moviecd = this.$route.params.moviecd;
        this.wishlist.movienm = this.movie.movienm;
        this.wishlist.posterurln = this.movie.posterurln;
        this.wishlist.raiting = this.movie.raiting;
        this.wishlist.opendt = this.movie.opendt;

        WishlistDataService.create(this.wishlist)
          .then((res) => {
            this.wishlist = res.data;
            console.log("wishlist: ", this.wishlist);
            // alert("create");
            // this.getWishlist();
          })
          .catch((err) => {
            // alert("찜 하기 에러");
            console.log(err);
          });
      } else {
        WishlistDataService.delete(this.wishlist.wid)
          .then((res) => {
            console.log(res.data);
            // alert("Delete");
            this.getWishlist();
          })
          .catch((err) => {
            // alert("찜 지우기 에러");
            console.log(err);
          });
      }
    },
    getWishlist() {
      WishlistDataService.get(
        this.$store.state.auth.user.username,
        this.$route.params.moviecd
      )
        .then((res) => {
          if (!res.data) {
            this.wishlist = new Wishlist();
          } else {
            this.wishlist = res.data[0];
          }

          console.log(this.$store.state.auth.user.username);
          console.log(this.$route.params.moviecd);
          // console.log(res.data);
          console.log("wishlist: ", this.wishlist);
          // alert("get");
        })
        .catch((err) => {
          console.log(err);
        });
    },
    // TODO: 수정해야함.
    emptyReview() {
      // alert("emptyReview");
      // alert(this.$store.state.auth.user.username);
      if (this.$store.state.auth.user == null) {
        // alert("Not Login");
        return false;
      } else {
        // alert("Login");
        return true;
      }
    },

    // 페이지 번호 변경시 실행되는 함수(재조회)
    handlePageChange(value) {
      this.page = value; // 매개변수값으로 현재페이지 변경
      // 재조회 함수 호출
      this.getReview(this.movie.moviecd);
    },
  },
};
</script>

<style scoped>
.tabs ul.tabs-mv {
  padding: 1%;
  margin-bottom: 30px;
}

.tab-bar {
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  margin-bottom: 0;
  padding: 0;
  font-family: "Dosis", sans-serif;
  font-size: 14px;
  color: #abb7c4;
  font-weight: bold;
  text-transform: uppercase;
  /* margin-bottom: 15px; */
  /* margin-right: 20px; */
}

.tab-bar li .not-selected {
  font-family: "Dosis", sans-serif;
  font-size: 18px;
  color: #abb7c4;
  font-weight: bold;
  text-transform: uppercase;
}

.tab-bar li a:hover {
  color: #dcf836;
}

.tab-bar li .selected {
  color: #dcf836;
  font-size: 18px;
  padding-bottom: 15px;
  border-bottom: 3px solid #dcf836;
}

.movie-img {
  position: fixed;
}

/*movie single hero*/
/* TODO: 이미지 이걸로 통일하는거 어떤지 물어보기 */
.mv-single-hero {
  background: url(@/assets/images_choi/Views/choi/MovieDetail/movie-theater02.jpg)
    no-repeat;
  /* height: 598px; */
  width: 100%;
}

.watched-people {
  font-size: 500%;
  /* text-align: center; */
  color: grey;
  margin-top: 15%;
}

.rate-star-result {
  padding: 0%;
  margin: 0%;
}

.movie-image-box {
  margin-right: 1%;
}

/* 리뷰쓰기 css */
#myform fieldset {
  display: inline-block;
  direction: rtl;
  border: 0;
  /* width: 500%; */
  /* height: 300%; */
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

/* .small-thumnail {
  width: 20%;
  height: 50%;
} */

/* 테스트 추가 */
.scale {
  transform: scale(1);
  -webkit-transform: scale(1);
  -moz-transform: scale(1);
  -ms-transform: scale(1);
  -o-transform: scale(1);
  transition: all 0.3s ease-in-out; /* 부드러운 모션을 위해 추가*/
}

.scale:hover {
  transform: scale(1 z);
  -webkit-transform: scale(1.2);
  -moz-transform: scale(1.2);
  -ms-transform: scale(1.2);
  -o-transform: scale(1.2);
}

.img {
  overflow: hidden;
}

/* 부모를 벗어나지 않고 내부 이미지만 확대 */

/* TODO: 탑버튼 추가 _정주희*/
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
