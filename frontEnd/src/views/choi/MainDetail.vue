<template>
  <div class="home">
    <div style="background: black">
      <div class="mainMovie" style="background: black">
        <div class="container parent">
          <div class="cover01"></div>
          <div class="cover02"></div>
          <div class="cover03"></div>
          <div class="slider sliderv2">
            <div class="container">
              <div class="row">
                <div class="slider-single-item">
                  <div class="movie-item">
                    <div class="row">
                      <div class="col-xs-12 title-detail">
                        <div class="movie-info col-xs-12">
                          <h1 class="movie-title col-xs-12">
                            <a
                              >{{ currentMovie.movienm
                              }}<span>{{ mYear }}</span></a
                            >
                          </h1>
                          <div class="social-btn col-xs-12">
                            <router-link
                              :to="'/allMovie/' + currentMovie.moviecd"
                              class="parent-btn"
                              ><i class="ion-play"></i>상세보기 ></router-link
                            >
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

                            <a class="parent-btn" id="sh-link"
                              ><i class="ion-android-share-alt"></i>공유하기</a
                            >
                          </div>
                          <div
                            class="movie-details col-xs-12">
                            <p>
                              <i class="ion-android-star"></i
                              ><span>{{ currentMovie.raiting }}</span> /10
                            </p>
                            <ul>
                              <li>{{ currentMovie.opendt }} 개봉</li>
                              <li>{{ currentMovie.showtm }} 분</li>
                            </ul>
                          </div>
                          <div class="btn-transform transform-vertical reservation-btn col-xs-12">
                            <div class="col-xs-12">
                              <a
                                @click="showSeatPage"
                                class="item item-1 redbtn"
                                >예매하기</a
                              >
                            </div>
                            <div class="col-xs-12">
                              <a
                                class="item item-2 redbtn hvrbtn"
                                @click="showSeatPage"
                                >예매하기</a
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
          <iframe
            class="video col-xs-12"
            :src="changedUrl"
            title="YouTube video player"
            frameborder="0"
            allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
            allowfullscreen
          ></iframe>
          <div class="short-details col-xs-12">
            <div
              class="short-detail">
              {{ currentMovie.plot }}
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Component for the reservation page -->
    <div v-if="seatPage">
      <SeatView :movieProps2="currentMovie" />
    </div>
  </div>
</template>

<script>
/* eslint-disable */
import custom from "@/assets/js/custom.js";
import SeatView from "@/views/kim/SeatView.vue";
import Wishlist from "@/model/Wishlist";
import WishlistDataService from "@/services/WishlistDataService";
export default {
  mounted() {
    custom();
    this.changeUrl();
    window.scrollTo({ top: 1300, behavior: "smooth" });
    this.getWishlist();
  },
  components: {
    SeatView,
  },
  props: ["movieProps"],
  data() {
    return {
      wishlist: [],
      seatPage: false,
      currentMovie: this.movieProps,
      changedUrl: "",
      mYear: 0,
    };
  },
  methods: {
    showSeatPage() {
      if (this.$store.state.auth.user == null) {
        alert("로그인이 필요한 서비스 입니다.");
      } else {
        this.seatPage = !this.seatPage;
      }
    },
    changeUrl() {
      const cutYoutubeUrl = this.currentMovie.utubeurl.substring(17);
      this.changedUrl =
        "https://www.youtube.com/embed/" +
        cutYoutubeUrl +
        "?rel=0&loop=1&playlist=" +
        cutYoutubeUrl +
        "&autoplay=1&mute=1";

      this.mYear = this.currentMovie.opendt.substr(0, 4);
    },
    likeSave() {
      if (this.wishlist.username == null) {
        this.wishlist = new Wishlist();
        this.wishlist.username = this.$store.state.auth.user.username;
        this.wishlist.moviecd = this.currentMovie.moviecd;
        this.wishlist.movienm = this.currentMovie.movienm;
        this.wishlist.posterurln = this.currentMovie.posterurln;
        this.wishlist.raiting = this.currentMovie.raiting;
        this.wishlist.opendt = this.currentMovie.opendt;

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
        this.currentMovie.moviecd
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
  },
};
</script>

<style scoped>
.parent {
  position: relative;
  padding-bottom: 56.25%;
}
.cover01 {
  position: absolute;
  width: 100%;
  height: 100%;
  z-index: 3;
  content: " ";
  background-image: linear-gradient(
    to right,
    #000 0%,
    rgba(0, 0, 0, 0.35) 25%,
    rgba(0, 0, 0, 0) 50%,
    rgba(0, 0, 0, 0.35) 75%,
    #000 100%
  );
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}

.cover02 {
  position: absolute;
  width: 100%;
  height: 10%;
  z-index: 3;
  background-color: black;
}

.cover03 {
  position: absolute;
  top: 80%;
  width: 100%;
  height: 20%;
  z-index: 3;
  background-color: black;
}

.movie-info {
  padding-top: 50px;
  width: 1000px;
}

.movie-title {
  width: 1000px
}

.movie-details {
  width: 1000px;
  margin-bottom: 0px
}

.social-btn {
  padding-top: 2%;
  width: 1000px;
  height: 50px;
}
.short-details {
  width: 1000px;
  position: absolute;
  top: 82%;
  z-index: 3;
}

.short-detail {
  padding-top: 0px;
  margin-top: 0px;
  position: absolute;
  text-align: left;
  color: white;
}

.video {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  width: 100%;
  height: 100%;
}

.reservation-btn {
  width: 1000px;
}
</style>
