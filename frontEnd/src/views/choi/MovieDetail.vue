<template>
  <div>
    <!-- 영화 상세보기 페이지입니다. 메인 케러셀 -> 메인 디테일 -> 상세보기 통해서도 올 수 있고 전체 영화보기를 통해서도 들어올 수 있습나다. -->
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
                <div class="hover-bnt">
                <a href="#" class="parent-btn" id="sh-link"
                  ><i class="ion-android-share-alt"></i>공유하기</a
                >
                </div>
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
                  <div class="tab-content">
                    <!-- 1) 영화정보 (Movie Information) -->
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
                          <div class="title-hd-sm">
                            <h4>출연/대표작</h4>
                          </div>
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
                        </div>

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
                      </div>
                    </div>

                    <!-- 2) 평점 및 관람평 (Ratings and Reviews) -->
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
                      </div>
                    </div>

                    <!-- 3) 스틸컷 (Posters & Photos) -->
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
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
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
    this.getMovie(this.$route.params.moviecd);
    this.getBoxoffice(this.$route.params.moviecd);
    this.getReview(this.$route.params.moviecd);
    this.getWishlist();
  },
  components: {
    SeatView,
  },
  data() {
    return {
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

      starRating: 0,
      userReview: "",
      userStarRaing: 3,
      tempImgUrl: [],
      imageUrlLength: 0,
      mYear: 0,

      page: 1,
      count: 0,
      pageSize: 3,
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
      ReviewDataService.getBycode(moviecd, this.page - 1, 10000000)
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

          console.log(response.data);
        })
        .catch((e) => {
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
      if (this.movie.actor != null) {
        this.movie.actor = this.movie.actor.split(",");
      }

      if (this.movie.cast != null) {
        this.movie.cast = this.movie.cast.split(",");
      }

      if (this.movie.imgurl != null) {
        this.movie.imgurl = this.movie.imgurl.split(",");
        this.imageUrlLength = this.movie.imgurl.length;

        this.tempImgUrl[0] = this.movie.imgurl[0];
        this.tempImgUrl[1] = this.movie.imgurl[1];
      }

      this.mYear = this.movie.opendt.substr(0, 4);

      if (this.movie.raiting != null) {
        this.starRating = Math.floor(this.movie.raiting);
      }

      if (this.movie.watchgradenm.includes(",")) {
        this.movie.watchgradenm = this.movie.watchgradenm.split(",")[0];
      }
    },
    likeSave() {
      if (this.wishlist.username == null) {
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
          })
          .catch((err) => {
            console.log(err);
          });
      } else {
        WishlistDataService.delete(this.wishlist.wid)
          .then((res) => {
            console.log(res.data);
            this.getWishlist();
          })
          .catch((err) => {
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
          console.log("wishlist: ", this.wishlist);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    emptyReview() {
      if (this.$store.state.auth.user == null) {
        return false;
      } else {
        return true;
      }
    },

    handlePageChange(value) {
      this.page = value;
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

.mv-single-hero {
  background: url(@/assets/images_choi/Views/choi/MovieDetail/movie-theater02.jpg)
    no-repeat;
  width: 100%;
}

.watched-people {
  font-size: 500%;
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
